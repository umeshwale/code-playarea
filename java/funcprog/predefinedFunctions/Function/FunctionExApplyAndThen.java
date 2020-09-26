package funcprog.predefinedFunctions.Function;

/*
    interface Function<T, R> {
        public R apply (T t);
      }
      andThen(Function<? super R,? extends V> after)
    Returns a composed function that first applies this function to its input,
    and then applies the after function to the result.

    Parameters: This method accepts a parameter after which is the function to be applied after the current one.

    Return Value: This method returns a composed function that applies the current function first and then the after function

    Exception: This method throws NullPointerException if the after function is null.
 */

import java.util.function.Function;

public class FunctionExApplyAndThen {
    public static void main(String[] args) {

        Function<Integer, Integer> f1 = i -> i*2;
        Function<Integer, Integer> f2 = i -> i*i*i;
        System.out.println("andThen Example: "+f1.andThen(f2).apply(2));


        Function<Integer, Double> half = a -> a / 2.0;
        // Now treble the output of half function
        half = half.andThen(a -> 3 * a);
        // apply the function to get the result
        System.out.println(half.apply(10));


    }
}
