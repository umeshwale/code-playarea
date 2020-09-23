package funcprog.collectors;

import funcprog.model.Person;

import java.util.List;
import java.util.stream.Collectors;

public class joining {

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
        // Display COMMA separated First Name of people in UpperCase whose Age is more than 30 Years
        // Old way - Issue is it will keep , after last name as well
        for (Person person : createPeople()) {
            if (person.getAge() > 30) {
                System.out.println(person.getFirstName().toUpperCase() + ", ");
            }
        }

        // Functional Programming way
        System.out.println(
                createPeople().stream()
                    .filter(person -> person.getAge()>30)
                    .map(Person::getFirstName)
                    .map(String::toUpperCase)
                    .collect(Collectors.joining(", "))
        );
    }
}
