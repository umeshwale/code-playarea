package funcprog.predefinedFunctions.Function;

/*
    interface Function<T, R> {
        public R apply (T t);
      }
 */

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionExApply2 {
    public static void main(String[] args) {
        // input -->perform some operation --> output
        // Return length of String
        Function<String, Integer> f = i -> i.length();
        List<String> stringList = Arrays.asList("John", "Johnny", "Janardan");
        for (String s : stringList) {
            System.out.println("Lenth of "+s + ": " +f.apply(s));
        }

        // Return uppercase of String
        Function<String, String> f1 = i -> i.toUpperCase();
        List<String> stringList1 = Arrays.asList("John", "Johnny", "Janardan");
        for (String s : stringList) {
            System.out.println("Uppercase of "+s + ": " +f1.apply(s));
        }

    }
}
