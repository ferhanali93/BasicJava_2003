package arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class IntArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> myNumbers = new ArrayList<>();
        myNumbers.add(50);
        myNumbers.add(10);
        myNumbers.add(40);
        myNumbers.add(20);
        myNumbers.add(30);
        System.out.println(myNumbers);  // Print all the elements in the arraylist

        System.out.println("We will use for loop to print the elements below");
        for (int i = 0; i < myNumbers.size(); i++){
            System.out.println(myNumbers.get(i));
        }
        System.out.println("we will now use for each loop to print");
        for(int i: myNumbers){
            System.out.println(i);
        }
        System.out.println("Using sort method to sort the arraylist");
        Collections.sort(myNumbers);
        for(int i: myNumbers){
            System.out.println(i);
        }
    }
}
