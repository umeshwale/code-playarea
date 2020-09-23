package funcprog;

import streams.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PureFunction {

    public static List<Person> createPeople() {
        return List.of(new Person("Umesh", "Wale", 38),
                new Person("Priyanka", "Dhumal", 35),
                new Person("Vasanti", "Patil", 35),
                new Person("Rutvi", "Wale", 9),
                new Person("Arth", "Wale", 10));
    }

    public static void main(String[] args) {
        // Get List of First Name in UpperCase of Age is more than 30 Years

        // Below code is Impure Function
        List<String> impureList = new ArrayList<>();
        createPeople().stream()
                .filter(person -> person.getAge()>30)
                .map(Person::getFirstName)
                .map(String::toUpperCase)
                .forEach(name -> impureList.add(name));
        System.out.println(impureList);
        // Above code is impure because of forEach statement. If we change stream to parallelStream it will fail.

        // Below code is Pure Function
        List<String> pureList = createPeople().stream()
                .filter(person -> person.getAge()>30)
                .map(Person::getFirstName)
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(pureList);
        // In above code all the functions are PURE Functions.

    }
}
