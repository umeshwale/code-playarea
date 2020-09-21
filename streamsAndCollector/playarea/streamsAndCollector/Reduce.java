package playarea.streamsAndCollector;

import java.util.List;

public class Reduce {

    public static List<Person> createPeople() {
        return List.of(new Person("Umesh", "Wale", 38),
                new Person("Priyanka", "Dhumal", 35),
                new Person("Vasanti", "Patil", 35),
                new Person("Rutvi", "Wale", 9),
                new Person("Arth", "Wale", 10));
    }

    public static void main(String[] args) {
        // Get total age of all the members
        /*\
            Reduce takes collection and reduces to a single value
            Reduce converts streams to something concrete
            JAva has reduce in two forms 1. reduce 2. collect
         */
        System.out.println(createPeople().stream()
        .map(Person::getAge)
        .reduce(0, (total, age) -> total+age));

        // More concise code
        System.out.println(createPeople().stream()
                .map(Person::getAge)
                .reduce(0, Integer::sum));
    }
}
