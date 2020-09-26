package funcprog.predefinedFunctions.Function;

/*
    interface Function<T, R> {
        public R apply (T t);
      }

      Returns a function that always returns its input argument.
 */

import java.util.function.Function;

public class FunctionExApplyIdentity {
    public static void main(String[] args) {
        // Function which takes in a number and
        // returns it
        Function i = Function.identity();

        System.out.println(i);

    }
}
