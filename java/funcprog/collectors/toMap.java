package funcprog.collectors;

import funcprog.model.Person;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class toMap {

    public static List<Person> createPeople() {
        return List.of(new Person("John", "Smith", 38),
                new Person("Russel", "Crow", 35),
                new Person("Brad", "Pitt", 35),
                new Person("Tom", "Cruise", 35),
                new Person("Sylvestor", "Stallone", 10),
                new Person("Nicolas", "Cage", 10));
    }

    public static void main(String[] args) {
        // Create Map with KEy as Name and Value as Age

        // Below code is old style of Object Oriented programming - Imperative Style
        Map<String, Integer> nameAndAgeMap = new HashMap<>();
        for (Person person : createPeople()) {
            nameAndAgeMap.put(person.getFirstName(), person.getAge());
        }
        System.out.println(nameAndAgeMap);

        // Below is new Functional Programming style
        Map<String, Integer> nameAndAgeMapNew = createPeople().stream()
                .collect(Collectors.toMap(Person::getFirstName, Person::getAge));
        System.out.println(nameAndAgeMapNew);

    }
}
