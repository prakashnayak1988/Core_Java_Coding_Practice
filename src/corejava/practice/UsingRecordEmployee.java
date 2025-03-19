package corejava.practice;
import java.util.*;

record Person(String name, int age) {}

public class UsingRecordEmployee {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Alice", 30),
                new Person("Bob", 25),
                new Person("Charlie", 35)
        );

        // Sort by age
        people.sort(Comparator.comparingInt(Person::age));

        // Print sorted list
        people.forEach(System.out::println);

        // Sort by name
        people.sort(Comparator.comparing(Person::name));
        people.forEach(System.out::println);

       // people.sort((e1, e2) -> e1.name.compareTo(e2.name)); //because Record will hava name as private access
    }
}