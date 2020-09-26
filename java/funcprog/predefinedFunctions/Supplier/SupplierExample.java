package funcprog.predefinedFunctions.Supplier;

import java.util.Date;
import java.util.function.Supplier;

public class SupplierExample {

    public static void main(String[] args) {
        Supplier<Date> supplier = () -> new Date();
        System.out.println(supplier.get());

        // This function returns a random value.
        Supplier<Double> randomValue = () -> Math.random();
        // Print the random value using get()
        System.out.println(randomValue.get());
    }
}
