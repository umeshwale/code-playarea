package funcprog.streams;

import funcprog.model.Person;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class flatMap {

    /*
        Lets take an example where for every person there are multiple emails and we want to
        get list of all the emails then we will be able to use flatMap
     */
    public static void main(String[] args) {

        List<Integer> values = Arrays.asList(1,2,3);

        // If you have one-to-one function then use map to go from Stream<T> to Stream<R>
        System.out.println(
                values.stream()
                    .map(e  -> e*2)
                        .collect(Collectors.toList()) );

        // If you have one-to-many function then use map to go from Stream<T> to Stream<Collection<R>>
        System.out.println(
                values.stream()
                        .map(e  -> List.of(e-1, e+1))
                        .collect(Collectors.toList()) );

        // If you have one-to-one function then use flatMap to go from Stream<T> to Stream<R>
        System.out.println(
                values.stream()
                        .flatMap(e  -> List.of(e-1, e+1).stream())
                        .collect(Collectors.toList()) );

    }
}
