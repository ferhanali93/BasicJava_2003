package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


public class ListPractice {
    public static void main(String[] args) {
        listDemo();

    }
    public static void listDemo(){
        List<String> uuidList = new ArrayList<>(); // Create a ArrayList object
        for (int i = 1; i <= 5; i++){
            UUID uuid = UUID.randomUUID();
            uuidList.add(uuid.toString());
        }
        uuidList.forEach(str -> System.out.println(str));
    }
}
