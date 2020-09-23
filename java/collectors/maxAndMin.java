package collectors;

import model.Person;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;

import static java.util.Comparator.*;
import static java.util.stream.Collectors.*;

public class maxAndMin {

    public static List<Person> createPeople() {
        return List.of(new Person("John", "Smith", 38),
                new Person("Russel", "Crow", 35),
                new Person("Brad", "Pitt", 35),
                new Person("Brad", "Pitt", 35),
                new Person("Tom", "Cruise", 35),
                new Person("John", "Travolta", 9),
                new Person("Sylvestor", "Stallone", 10),
                new Person("Nicolas", "Cage", 8));
    }

    public static void main(String[] args) {
      OptionalInt ageMax = createPeople().stream()
               .mapToInt(Person::getAge)
               .max();
        System.out.println("Max Age is : " +ageMax);

        OptionalInt ageMin = createPeople().stream()
                .mapToInt(Person::getAge)
                .min();
        System.out.println("Min Age is : " +ageMin);

        // Above code gave us int value of max or min age but what if we want Person object
        Optional<Person> maxAgePerson = createPeople().stream()
                .collect(maxBy(comparing(Person::getAge)));
        System.out.println(maxAgePerson);
        Optional<Person> minAgePerson = createPeople().stream()
                .collect(minBy(comparing(Person::getAge)));
        System.out.println(minAgePerson);

        // How about if we want just Name from Person Object
        String maxAgePersonName = createPeople().stream()
                .collect(collectingAndThen(maxBy(comparing(Person::getAge)),
                        person -> person.map(Person::getFirstName).orElse("")));
        System.out.println(maxAgePersonName);
        String minAgePersonName = createPeople().stream()
                .collect(collectingAndThen(minBy(comparing(Person::getAge)),
                        person -> person.map(Person::getFirstName).orElse("")));
        System.out.println(minAgePersonName);



    }
}
