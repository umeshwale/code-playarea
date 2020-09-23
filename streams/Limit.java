import java.util.Arrays;
import java.util.List;

public class Limit {
    /*
    The ‘limit’ method is used to reduce the size of the stream.
    The following code segment shows how to print 10 numbers using limit.
     */
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1,10,12,3,4,52,4,5,67,3,2,5,6,22,45,67,55,33,45,37,39,99,88,66,55);
        integers.stream().limit(10).forEach(System.out::println);
    }
}
