package SerializationExample;

import java.io.*;

class Employee implements Externalizable {
    private static final long serialVersionUID = 1L;
    String name;
    transient int age; // Won't be serialized unless explicitly written

    transient   String cast;

    // Default constructor (mandatory for Externalizable)
    public Employee() {
    }

    public Employee(String name, int age, String cast) {
        this.name = name;
        this.age = age;
        this.cast=cast;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(name); // Manually serialize the name
        out.writeInt(age);// Manually serialize the age
        out.writeObject("Teli");
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        name = (String) in.readObject(); // Manually deserialize the name
        age = in.readInt();
        cast= (String) in.readObject();// Manually deserialize the age
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age+", Cast: "+cast);
    }
}

public class ExternalizationExample {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Employee emp1 = new Employee("Alice", 28,"Teli");

        // Serialization using Externalizable
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("employee.ext"));
        oos.writeObject(emp1);
        oos.close();

        // Deserialization using Externalizable
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("employee.ext"));
        Employee emp2 = (Employee) ois.readObject();
        ois.close();

        emp2.display();
    }
}
