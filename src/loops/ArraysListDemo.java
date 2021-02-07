package loops;

import java.util.ArrayList;
import java.util.Collections;

public class ArraysListDemo {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Bmw");
        cars.add("Audi");
        cars.add("Toyota");
        System.out.println("All the elements inside cars Array: " + cars);
        System.out.println("The size of the array is: " + cars.size());
        System.out.println("Before Sorting: " + cars);
        Collections.sort(cars);
        System.out.println("After Sorting: " + cars);
        cars.remove(2);
        System.out.println("After removing index 2: " + cars);
        cars.add(2, "Toyota");
        for (String i : cars){
            System.out.println("Printing via For each loop: "+ i);
        }
    }
}