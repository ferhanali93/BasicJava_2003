package collection;

import java.util.HashSet;

// Integer Type Hash Set
public class HashSetDemo2 {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>();
        // Add Values to the Set:
        numbers.add(1);
        numbers.add(3);
        numbers.add(5);
        numbers.add(7);
        System.out.println("These are the elemeents in the set: " + numbers);

        // show numbers between 1 and 10 are in the set
        for (int i = 1; i <= 10; i++){
            if(numbers.contains(i)){
                System.out.println(i + " was found in the set.");
            } else{
                System.out.println(i + " was not found in the set.");
            }
        }
    }
}
