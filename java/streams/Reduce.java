package streams;

import model.Person;

import java.util.List;

public class Reduce {

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
