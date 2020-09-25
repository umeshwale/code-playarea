package funcprog.collectors;

import funcprog.model.Person;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.filtering;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.*;
/*

 */

public class flatMapping {

    public static List<Person> createPeople() {
        return List.of(new Person("John", "Smith", 38),
                new Person("Russel", "Crow", 35),
                new Person("Brad", "Pitt", 35),
                new Person("Brad", "Pitt", 33),
                new Person("Tom", "Cruise", 33),
                new Person("John", "Travolta", 9),
                new Person("Sylvestor", "Stallone", 10),
                new Person("Nicolas", "Cage", 10));
    }

    public static void main(String[] args) {
      //  I want to groupby names as per age where I want unique characters from the fist name in uppercase
        System.out.println(createPeople().stream()
                .collect(groupingBy(Person::getAge,
                        mapping(person -> person.getFirstName().toUpperCase(),
                                flatMapping(name -> Stream.of(name.split("")), toSet()))))
        // o/P - {33=[A, B, R, D, T, M, O],
                // 35=[A, R, B, S, D, U, E, L],
                // 38=[H, J, N, O], 9=[H, J, N, O],
                // 10=[A, R, S, C, T, E, V, Y, I, L, N, O]}
        );
    }
}
