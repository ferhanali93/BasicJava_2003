package arraylist;

import java.util.ArrayList;

public class LambdaExpressionDemo {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(5);
        // Using for Each method
        numbers.forEach(n -> System.out.println(n));
    }
}
