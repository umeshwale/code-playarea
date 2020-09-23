import java.util.List;

public class Filter {

    public static List<Person> createPeople() {
        return List.of(new Person("Umesh", "Wale", 38),
                new Person("Priyanka", "Dhumal", 35),
                new Person("Vasanti", "Patil", 35),
                new Person("Rutvi", "Wale", 9),
                new Person("Arth", "Wale", 10));
    }

    public static void main(String[] args) {
        createPeople().stream()
                .filter(person -> person.getAge()>30)
                .forEach(System.out::println);
    }
}
