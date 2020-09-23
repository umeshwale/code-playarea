package collectors;

import model.Person;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.*;

public class filtering {

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
        // GroupBy firstname
        List<Person> people = createPeople();
        Map<String, List<Person>> byName = new HashMap<>();

        Map<String, List<Person>> byGroupingName = people.stream()
                .collect(groupingBy(Person::getFirstName));
        System.out.println(byGroupingName);

        // Lets grouping By with Age
        Map<String, List<Integer>> byGroupingNameMapping = people.stream()
                .collect(groupingBy(Person::getFirstName,
                            mapping(Person::getAge, toList())));
        System.out.println(byGroupingNameMapping);

        // if we want to filter by names with more than length 5
        Map<Integer, List<String>> filteringMap = people.stream()
                .collect(groupingBy(Person::getAge,
                        mapping(Person::getFirstName,
                                filtering(name -> name.length()>5, toList()))));
        System.out.println(filteringMap);
    }
}
