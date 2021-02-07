package controlFlow;

public class CheckAge {
    // Create an checkAge() method with an integer variable called age
    static void checkAge(int age){
        // if age is less than 18, print "access denied"
        if (age < 18){
            System.out.println("Access denies - You are not old enough!");
            // If age is greater than, or equal to, 18, print 'access denies"
        } else {
            System.out.println("Access granted - you are old enough");
        }
    }

    public static void main(String[] args) {
        checkAge(20); // Call the checkAge method and pass along an of 20
    }
}
