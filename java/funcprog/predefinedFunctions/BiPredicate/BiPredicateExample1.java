package funcprog.predefinedFunctions.BiPredicate;

import java.util.function.BiPredicate;

public class BiPredicateExample1 {

    public static void main(String[] args) {
        // Validate sum of two integers is even
        BiPredicate<Integer, Integer> bp = (a,b) -> (a+b) %2==0;
        System.out.println("Is 10+20 Even: "+bp.test(10,20));
        System.out.println("Is 15+20 Even: "+bp.test(15,20));
    }
}
