package funcprog.streams;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class flatMap2 {

    public static void main(String[] args) {

        List<List<String>> vowels = Arrays.asList(
                Arrays.asList("A", "E"),
                Arrays.asList("I"),
                Arrays.asList("O","U"));

        // Below code will output - [[A, E], [I], [O, U]]
        System.out.println(
                vowels.stream().collect(Collectors.toList()));

        //Below code will output - [A, E, I, O, U]
        System.out.println(
                vowels.stream()
                    .flatMap(Collection::stream).collect(Collectors.toList())
        );

    }
}
