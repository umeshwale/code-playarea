package collectors;

import streams.Person;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class toMap {

    public static List<Person> createPeople() {
        return List.of(new Person("Umesh", "Wale", 38),
                new Person("Priyanka", "Dhumal", 35),
                new Person("Vasanti", "Patil", 35),
                new Person("Rutvi", "Wale", 9),
                new Person("Arth", "Wale", 10));
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
