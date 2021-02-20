package collection;

import java.util.HashMap;

public class HashMapDemo1 {
    public static void main(String[] args) {
        HashMap<String, String> capitalCities = new HashMap<>();

        // Add keys and Values (Country, City)
        capitalCities.put("USA", "Washington Dc");
        capitalCities.put("Pakistan", "Islamabad");
        capitalCities.put("India", "New Delhi");
        capitalCities.put("Bangladesh","Dhaka");
        capitalCities.put("England", "London");
        capitalCities.put("Germany","Berlin");
        System.out.println(capitalCities); // print all the elements
        System.out.println(capitalCities.get("Pakistan")); // using Key we can print value
        System.out.println(capitalCities.isEmpty()); // you can check if its empty or not
        System.out.println("the size of the map is: " + capitalCities.size());

        System.out.println("we will use for each loop to get all the keys set");
        for(String i : capitalCities.keySet()){ // get keys
            System.out.println(i);
        }
        for(String i : capitalCities.values()){ // get values
            System.out.println(i);
        }
        for(String i: capitalCities.keySet()){
            System.out.println("Key: " + i + " Value: " + capitalCities.get(i));
            // it should give us key and value both
        }

    }
}
