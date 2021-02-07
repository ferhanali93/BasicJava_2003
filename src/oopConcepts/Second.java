package oopConcepts;

import oopConcepts.Main;

public class Second {
    public static void main(String[] args) {
        Main myObj = new Main();
        myObj.x = 25;
        myObj.y = 40;
        //myObj.z = 80; // Cannot assign a value to a final variable
        System.out.println("Value of X is: " + myObj.x +" and Value of y is: " + myObj.y);
        System.out.println("Name: " + myObj.fName + " " + myObj.lName);
        System.out.println("Age: " + myObj.age);
        Main.myMethod();
    }
}
