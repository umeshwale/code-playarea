package funcprog.streams;

import funcprog.model.Person;

import java.util.List;

public class Map {

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
        // Display FirstName from the Map in UPPERCASE
        createPeople().stream()
                .map(Person::getFirstName)
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
