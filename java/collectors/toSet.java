package collectors;

import streams.Person;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class toSet {

    public static List<Person> createPeople() {
        return List.of(new Person("Umesh", "Wale", 38),
                new Person("Priyanka", "Dhumal", 35),
                new Person("Vasanti", "Patil", 35),
                new Person("Vasanti", "Patil", 32),
                new Person("Rutvi", "Wale", 9),
                new Person("Rutvi", "Wale", 10),
                new Person("Arth", "Wale", 10));
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
