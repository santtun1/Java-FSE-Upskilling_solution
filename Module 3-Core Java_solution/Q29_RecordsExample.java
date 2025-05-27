// Q29: Records
// Objective: Use the record keyword for immutable data structures (Java 16+).
// Task: Create a record to represent a Person with name and age.
// Instructions:
// - Define a record named Person.
// - Create instances and print them.
// - Use records in a List and filter based on age using Streams.

import java.util.List;

public class Q29_RecordsExample {
    public record Person(String name, int age) {}

    public static void main(String[] args) {
        Person p1 = new Person("Alice", 23);
        Person p2 = new Person("Bob", 31);
        Person p3 = new Person("Charlie", 17);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        List<Person> people = List.of(p1, p2, p3);

        System.out.println("People older than 20:");
        people.stream()
              .filter(p -> p.age() > 20)
              .forEach(System.out::println);
    }
}
