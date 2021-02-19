package collection;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        mapDemo();

    }

    public static void mapDemo() {
        Map<String, Integer> phoneNumbMap = new HashMap<>();
        // put -> Insert
        phoneNumbMap.put("John", 12345); // element1 (K=key, V=value)
        phoneNumbMap.put("Jackson", 23456);
        phoneNumbMap.put("Jones", 34567);
        phoneNumbMap.put("Jack", 45678);
        // How to retrieve it ?
        for (Map.Entry<String, Integer> e : phoneNumbMap.entrySet()) {
            System.out.println("Key: " + e.getKey() + ","+ " Value: " + e.getValue());
        }
    }
}
