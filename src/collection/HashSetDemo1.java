package collection;

import java.util.HashSet;

// String Type Hash Set
public class HashSetDemo1 {
    public static void main(String[] args) {
        HashSet<String> cars = new HashSet<>();
        cars.add("Mercedes");   // 1
        cars.add("Audi");       // 2
        cars.add("BMW");        // 3
        cars.add("Ford");       // 4
        cars.add("Mazda");      // 5
        cars.add("Toyota");     // 6
        cars.add("Audi"); // duplication-> which is not allowed in the set
        System.out.println(cars);
        System.out.println("The size of the set is: " + cars.size());
        // To check whether an item exists in a HashSet, use the contain()
        System.out.println(cars.contains("Audi"));

        // Loop through the items of an HashSet With a for-each Loop
        System.out.println("*******************************");
        for(String i : cars){
            System.out.println(i);
        }
        System.out.println("*******************************");
    }
}
