package funcprog.predefinedFunctions.Function;

/*
    interface Function<T, R> {
        public R apply (T t);
      }

      It returns a composed function wherein the parameterized function will be executed first and then the first one. If evaluation of either function throws an error, it is relayed to the caller of the composed function.

    Syntax:

    default <V> Function<V, R>
        compose(Function<? super V, ? extends T> before)
    where V is the type of input of the before function, and of the composed function

    Parameters: This method accepts a parameter before which is the function to be applied first and then the current one

    Return Value: This method returns a composed function that applies the current function after the parameterized function

    Exception: This method throws NullPointerException if the before function is null.

 */

import java.util.function.Function;

public class FunctionExApplyCompose {
    public static void main(String[] args) {

        Function<Integer, Integer> f1 = i -> i*2;
        Function<Integer, Integer> f2 = i -> i*i*i;
        System.out.println("compose Example: "+f1.compose(f2).apply(2));

        // Function which takes in a number and returns half of it
        Function<Integer, Double> f = i -> i / 2.0;
        // However treble the value given to half function
        f = f.compose(i -> 3*i);
        // apply the function to get the result
        System.out.println(f.apply(5));
    }
}
