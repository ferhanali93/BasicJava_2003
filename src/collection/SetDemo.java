package collection;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        setDemo();

    }
    public static void setDemo(){
        Set<Integer> phoneNumber = new HashSet<>();
        phoneNumber.add(12345); // 1
        phoneNumber.add(23456); // 2
        phoneNumber.add(34567); // 3
        phoneNumber.add(45678); // 4
        phoneNumber.add(56789); // 5
        phoneNumber.add(12345); // 6
        // Duplication is  --> not allowed in Set
        System.out.println("The size of Set is: " + phoneNumber.size());
        phoneNumber.forEach(numb -> System.out.println(numb));
    }
}
