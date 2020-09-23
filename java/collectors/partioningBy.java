package collectors;

import streams.Person;

import java.util.List;
import java.util.stream.Collectors;

public class partioningBy {

    public static List<Person> createPeople() {
        return List.of(new Person("Umesh", "Wale", 38),
                new Person("Priyanka", "Dhumal", 33),
                new Person("Vasanti", "Patil", 35),
                new Person("Vasanti", "Patil", 32),
                new Person("Rutvi", "Wale", 9),
                new Person("Arth", "Wale", 10));
    }

    public static void main(String[] args) {
        // Display Age as per ODD & Even value
        List<Person> personList = createPeople();
        // Old way of writing this code
        List<String> evenAgeList = personList.stream()
                .filter(person -> person.getAge() % 2 ==0)
                .map(Person::getFirstName)
                .collect(Collectors.toList());
        System.out.println(evenAgeList);
        List<String> oddAgeList = personList.stream()
                .filter(person -> person.getAge() % 2 !=0)
                .map(Person::getFirstName)
                .collect(Collectors.toList());
        System.out.println(oddAgeList);

        // USing PartitioningBy
        System.out.println(
                personList.stream()
                    .collect(Collectors.partitioningBy(person -> person.getAge() % 2 ==0))
        );
    }
}
