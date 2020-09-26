package funcprog.predefinedFunctions.predicate;

import java.util.function.Predicate;

public class predicateExample1 {

    public static void main(String[] args) {
        int[] ints = {1,2,3,4,5,6,7,8,9,10};

        System.out.println("Even numbers using Predicate: ");
        Predicate<Integer> p1 = i -> i%2==0;
        for (int i1 : ints) {
            if(p1.test(i1)) {
                System.out.println(i1);
            }

        }
    }
}
