package collectors;

import streams.Person;

import java.util.List;
import java.util.stream.Collectors;

public class toList {

    public static List<Person> createPeople() {
        return List.of(new Person("Umesh", "Wale", 38),
                new Person("Priyanka", "Dhumal", 35),
                new Person("Vasanti", "Patil", 35),
                new Person("Vasanti", "Patil", 35),
                new Person("Rutvi", "Wale", 9),
                new Person("Arth", "Wale", 10));
    }

    public static void main(String[] args) {
        // Display First Name of Age is more than 30 Years
        List newList = createPeople().stream()
                .filter(person -> person.getAge()>30)
                .map(s->s.getFirstName())
                .collect(Collectors.toList());
        System.out.println(newList);
    }
}
