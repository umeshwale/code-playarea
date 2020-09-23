package collectors;

import model.Person;

import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.*;

public class collectingAndThen {

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

        // counting returns Long value but we need to convert it to Integer.
        Map<String, Integer> countByName = people.stream()
                .collect(groupingBy(Person::getFirstName,
                        collectingAndThen(counting(), Long::intValue)));
        System.out.println(countByName);
    }
}
