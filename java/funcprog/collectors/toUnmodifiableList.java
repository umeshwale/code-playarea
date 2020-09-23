package funcprog.collectors;

import funcprog.model.Person;

import java.util.List;
import java.util.stream.Collectors;

public class toUnmodifiableList {

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
