package collection;

import java.util.HashMap;

public class HashMapDemo2 {
    public static void main(String[] args) {
        HashMap<String, Integer> people = new HashMap<>();

        // Add keys and values (Name, Age)
        people.put("Ferhan", 27);
        people.put("John", 32);
        people.put("Steve", 30);
        people.put("Ciara", 33);
        System.out.println("Simple print" + people);
        for(String i : people.keySet()){ // using for loop
            System.out.println("Key: " + i + " Value: " + people.get(i));
        }
    }
}
