package scannerClasses;
import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter Username");
        String userName = myObj.nextLine();
        System.out.println("Username is: " + userName);
        System.out.println("Enter your password");
        String password = myObj.nextLine();
        System.out.println("Password is: " + password);



    }
}
