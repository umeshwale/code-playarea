package collectors;

import model.Person;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.*;

public class groupingBy {

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

        // Old imperative way to do it is as below
        for (Person person : people) {
            List<Person> list = null;
            if (byName.containsKey(person.getFirstName())) {
                list = byName.get(person.getFirstName());
            } else {
                list = new ArrayList<Person>();
                byName.put(person.getFirstName(), list);
            }
            list.add(person);
        }
        System.out.println(byName);

        // Functional programming way
        Map<String, List<Person>> byGroupingName = people.stream()
                .collect(groupingBy(Person::getFirstName));
        System.out.println(byGroupingName);

        // I want grouping By with Age
        Map<String, List<Integer>> byGroupingNameMapping = people.stream()
                .collect(groupingBy(Person::getFirstName,
                            mapping(Person::getAge, toList())));
        System.out.println(byGroupingNameMapping);
    }
}
