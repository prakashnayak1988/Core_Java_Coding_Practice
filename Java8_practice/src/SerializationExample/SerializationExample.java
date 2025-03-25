package SerializationExample;

import java.io.*;

class Employee1 implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    String name;
    int age;

    public Employee1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class SerializationExample {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Employee1 emp1 = new Employee1("John", 30);

        // Serialization
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("employee.ser"));
        oos.writeObject(emp1);
        oos.close();

        // Deserialization
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("employee.ser"));
        Employee emp2 = (Employee) ois.readObject();
        ois.close();

        emp2.display();
    }
}

