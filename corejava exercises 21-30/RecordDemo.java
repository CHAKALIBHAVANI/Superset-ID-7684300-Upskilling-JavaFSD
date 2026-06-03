import java.util.Arrays;
import java.util.List;

// Record for person data
record Person(String name, int age) {}

class RecordDemo {
    public static void main(String[] args) {

        // Store persons
        List<Person> people = Arrays.asList(
                new Person("Anjali", 20),
                new Person("Sneha", 16),
                new Person("Archana", 22)
        );

        // Filter age 18 and above
        people.stream()
                .filter(p -> p.age() >= 18)
                .forEach(System.out::println);
    }
}