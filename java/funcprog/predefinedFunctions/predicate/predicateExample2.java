package funcprog.predefinedFunctions.predicate;

import java.util.function.Predicate;

public class predicateExample2 {

    public static void main(String[] args) {
        int[] ints = {1,2,3,4,5,6,7,8,9,10};

        System.out.println("Display numbers >5 using Predicate: ");
        Predicate<Integer> p1 = i -> i>5;
        for (int i1 : ints) {
            if(p1.test(i1)) {
                System.out.println(i1);
            }

        }
    }
}
