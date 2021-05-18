package funcprog.collectors;

import funcprog.model.Person;

import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.*;

public class counting {

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

        // count by Name - This counts number of records by name Ex - John =2 , Brad =2
        Map<String, Long> countByName = people.stream()
                .collect(groupingBy(Person::getFirstName,
                            counting()));
        System.out.println(countByName);
    }
}
