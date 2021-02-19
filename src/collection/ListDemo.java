package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ListDemo {
    public static void main(String[] args) {
        studentList();

    }
    public static void studentList(){
        List<String> uuidList = new ArrayList<>();
        for(int i = 1; i <= 20; i++){
            UUID uuid = UUID.randomUUID(); // Generate 20 random UUID
            uuidList.add(uuid.toString());

        }
        uuidList.add(""); // Empty string
        uuidList.add(null); // null not empty
        uuidList.add(null); // null not empty
        uuidList.add("true"); // String value
        uuidList.add("true"); // Duplication is allowed in the List

        uuidList.forEach(str -> System.out.println(str));
    }
}
