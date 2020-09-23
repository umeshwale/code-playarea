package collectors;

import model.Person;

import java.util.List;
import java.util.stream.Collectors;

public class sum {

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
        // Get Sum of all the ages
       int ageSum = createPeople().stream()
               .mapToInt(Person::getAge)
               .sum();
        System.out.println("Sum of all the Ages : " +ageSum);
    }
}
