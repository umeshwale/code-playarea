package funcprog.collectors;

import funcprog.model.Person;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class toSet {

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

    public static void main(String[] args) {
        // Display First Name of Age is more than 30 Years
        Set newList = createPeople().stream()
                .filter(person -> person.getAge()>30)
                .map(s->s.getFirstName())
                .collect(Collectors.toSet());
        System.out.println(newList); // This will give unique result
    }
}
