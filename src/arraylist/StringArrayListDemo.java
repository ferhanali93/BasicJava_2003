package arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class StringArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Audi"); // Index 0
        cars.add("Bmw"); // Index 1
        cars.add("Mercedes"); // Index 2
        cars.add("Toyota"); // Index 3
        cars.add("Volvo"); // Index 4
        System.out.println("The size of the array is: " + cars.size()); // check the size of the array
        System.out.println("Elements inside cars Arraylist are: " + cars); // Print all the elements in the ArrayList
        System.out.println(cars.get(2)); // Print the elements at index 2
        cars.set(3, "Honda"); // we replaced Toyota to Honda at index 3
        System.out.println(cars); // Print the modified version of the arraylist.
        System.out.println(cars); // Added one more element at index 4
        cars.remove(4); // removed volvo at index 4
        System.out.println(cars);
        // To remove all the elements in the array use: cars.clear()

        // Loop through an array
        System.out.println("We will print the elements using for loop");
        for (int i = 0; i < cars.size(); i++){
            System.out.println(cars.get(i));
        }
        System.out.println("we will print the elements using for each loop");
        for (String i: cars){
            System.out.println(i);
        }
        System.out.println("we will sort the arraylist now using Collections");
        Collections.sort(cars);
        for(String i : cars){
            System.out.println(i);
        }

    }
}
