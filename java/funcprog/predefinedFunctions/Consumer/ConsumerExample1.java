package funcprog.predefinedFunctions.Consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample1 {

    public static void main(String[] args) {
        Consumer<String> consumer = str -> System.out.println(str);
        consumer.accept("This will print");

        Consumer<List> listConsumer = list -> list.stream().forEach(System.out::println);
        List<String> namesList = Arrays.asList("John", "Johnny", "Johnathan");
        listConsumer.accept(namesList);
    }
}
