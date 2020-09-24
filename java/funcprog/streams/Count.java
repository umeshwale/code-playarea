package funcprog.streams;

import funcprog.model.Person;

import java.util.List;

public class Count {

    public static List<Person> createPeople() {
        return List.of(new Person("John", "Smith", 38),
                new Person("Russel", "Crow", 35),
                new Person("Brad", "Pitt", 35),
                new Person("Brad", "Pitt", 35),
                new Person("Tom", "Cruise", 35),
                new Person("John", "Travolta", 9),
                new Person("Sylvestor", "Stallone", 10),
                new Person("Nicolas", "Cage", 10));
    }
    /*
        long count() returns the count of elements in the stream. This is a special case of a reduction
        (A reduction operation takes a sequence of input elements and combines them into a single summary result by
        repeated application of a combining operation).
        This is a terminal operation i.e, it may traverse the stream to produce a result or a side-effect.
        After the terminal operation is performed, the stream pipeline is considered consumed, and can no longer be used.
        Stream.count() really shines when we combine it with other Stream methods – most often with filter():
     */
    public static void main(String[] args) {
        // Display First Name of Age is more than 30 Years
        long count = createPeople().stream()
                .filter(person -> person.getAge()>30)
                .count();
        System.out.println("Count of people with Age more than 30: "+count);
    }
}
