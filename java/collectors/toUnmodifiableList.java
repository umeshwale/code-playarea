package collectors;

import streams.Person;

import java.util.List;
import java.util.stream.Collectors;

public class toUnmodifiableList {

    public static List<Person> createPeople() {
        return List.of(new Person("Umesh", "Wale", 38),
                new Person("Priyanka", "Dhumal", 35),
                new Person("Vasanti", "Patil", 35),
                new Person("Vasanti", "Patil", 35),
                new Person("Rutvi", "Wale", 9),
                new Person("Arth", "Wale", 10));
    }

    public static void main(String[] args) {
        // Get List of all the age
        List ageList = createPeople().stream()
                .map(Person::getAge)
                .collect(Collectors.toList());
        // We will be able to add another age which is not present in original List
        ageList.add(99);
        System.out.println(ageList);

        // If we want to get the unmodifiable list then use below

        List unModfiableAgeList = createPeople().stream()
                .map(Person::getAge)
                .collect(Collectors.toUnmodifiableList());
        System.out.println(unModfiableAgeList);
        //If we try to add any other additional value to the list then it will throw exception
        unModfiableAgeList.add(99);

    }
}
