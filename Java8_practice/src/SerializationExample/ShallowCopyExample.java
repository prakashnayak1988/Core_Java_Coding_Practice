package SerializationExample;

class Address {
    String city;

    public Address(String city) {
        this.city = city;
    }
}

class Person implements Cloneable {
    String name;
    Address address; // Reference type

    public Person(String name, Address address) {
        this.name = name;
       // this.address = address;// Swallow Copy Example
        this.address = new Address(address.city);// Swallow Copy Example
    }

    // Shallow Copy
    @Override
    protected Object clone() throws CloneNotSupportedException {
       // return super.clone();
        return new Person(this.name,this.address);
    }

    public void display() {
        System.out.println(name + " lives in " + address.city);
    }
}

public class ShallowCopyExample {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address address = new Address("New York");
        Person person1 = new Person("John", address);
        Person person2 = (Person) person1.clone(); // Shallow copy

        System.out.println("Before Modification:");
        person1.display();
        person2.display();

        // Modifying the address in person2
        person2.address.city = "Los Angeles";

        System.out.println("\nAfter Modification:");
        person1.display();
        person2.display();
    }
}

