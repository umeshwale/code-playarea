package funcprog.predefinedFunctions.Function;

/*
    interface Function<T, R> {
        public R apply (T t);
      }
 */

import java.util.function.Function;

public class FunctionExApply {
    public static void main(String[] args) {
        // input -->perform some operation --> output
        // Return square value ==> i/p 4 --> 4*4 --> 16
        Function<Integer, Integer> f = i -> i*i;
        int[] ints = {1,2,3,4,5};
        for (int i : ints) {
            System.out.println("Square of "+i + ": " +f.apply(i));
        }

    }
}
