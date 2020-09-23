package streams;

import java.util.Arrays;
import java.util.List;

public class Sorted {
    /*
    The ‘sorted’ method is used to sort the stream.
    The following code segment shows how to print 10 random numbers in a sorted order.
     */
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1,10,12,3,4,52,4,5,67,3,2,5,6,22,45,67,55,33,45,37,39,99,88,66,55);
        // Below code will filter first and then sort
        integers.stream().limit(10).sorted().forEach(System.out::println);
        //Below code will sort first and then filter
        integers.stream().sorted().limit(10).forEach(System.out::println);
    }
}
