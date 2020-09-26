package funcprog.predefinedFunctions.Consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExampleAndThen {

    public static void main(String[] args) {
        Consumer<String> consumer1 = str -> System.out.println("First Consumer: "+str);
        Consumer<String> consumer2 = str -> System.out.println("Second Consumer: "+str);
        Consumer<String> consumer3 = str -> System.out.println("Third Consumer: "+str);

        consumer1.andThen(consumer2).andThen(consumer3).accept("STRING");

    }
}
