package javautility;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

/*
    Java provides a substantial number of methods and classes dedicated to concatenating Strings.
    In this example we will see different ways to concatenate strings

 */
public class StringConcatExample {
    public static void main(String[] args) {
        // 1. StringBuilder
        StringBuilder stringBuilder = new StringBuilder(100);
        stringBuilder.append("Java "); stringBuilder.append("is "); stringBuilder.append("Awesome");
        System.out.println("1. StringBUilder Example: "+stringBuilder.toString());

        // 2. Addition Operator
        String myString = "Java " + "is " + "Awesome";
        System.out.println("Addition Operator: "+myString);

        // 3. String concat
        String concatString = "Java ".concat( "is ").concat("Awesome");
        System.out.println("String concat: "+concatString);

        // 4. String format
        String formatString = String.format("%s %s %s", "Java", "is", "Awesome");
        System.out.println("String format: "+formatString);

        // 5. String join
        String[] strings = {"Java", "is", "Awesome"};
        String stringJoin = String.join(" ", strings);
        System.out.println("String join: "+stringJoin);

        //6. StringJoiner
        StringJoiner stringJoiner  = new StringJoiner(",");
        stringJoiner.add("Apple");
        stringJoiner.add("Banana");
        stringJoiner.add("Grapes");
        System.out.println("Comma separated stringjoiner: "+stringJoiner);

        // 7. Collectors joining
        List<String> stringList = Arrays.asList("Apple", "Banana", "Grapes");
        String commaSeparatedString = stringList.stream().collect(Collectors.joining(", "));
        System.out.println("Collectors Joining: "+commaSeparatedString);


    }
}
