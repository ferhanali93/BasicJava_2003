package scannerClasses;

import java.sql.SQLOutput;
import java.util.Scanner;

/** read in: name, ID#, rate, hours
 * multiply rate*hours to get gross pay
 */
public class Payroll {
    public static void main(String[] args) {
        // We calculate gross pay now, later we will calculate over time
        double rate, hours, pay;
        String name;
        int idNum;
        Scanner sc = new Scanner(System.in); // Gives us a Scanner object to help read

        // Prompt to user
        System.out.println("Enter employee 1's ID number: ");
        idNum = sc.nextInt();
        sc.nextLine(); // skip \n

        System.out.println(" Enter oopConcepts.Employee 1's name: ");
        name = sc.nextLine();

        System.out.println("You entered: " + idNum + " " + name);

        System.out.println("Enter oopConcepts.Employee 1's hours and rate: ");
        hours = sc.nextDouble();
        rate = sc.nextDouble();
        System.out.println("your entered hours: " + hours + " rate: " + rate);

        pay = hours * rate;
        System.out.println(idNum + " " + name + " " + pay);
        System.out.println("Gross pay of Ferhan is: $ " + pay);

        // Now Process oopConcepts.Employee 2
        // Prompt the user
        System.out.println("Enter employee'2 ID number: ");
        idNum = sc.nextInt();
        sc.nextLine(); // skip \n
        System.out.println("Enter oopConcepts.Employee 2's name: ");
        name = sc.nextLine();
        //read in user input
        System.out.println("You entered: " + idNum + " " + name);

        System.out.println("Enter oopConcepts.Employee 2'S hours and rate: ");
        hours = sc.nextDouble();
        rate = sc.nextDouble();
        System.out.println("Your entered: " + hours+ " " + rate);
        pay = rate * hours;
        System.out.println(idNum + " " + name + " " + pay);
        System.out.println("Gross Pay of oopConcepts.Employee's  is: " + pay);
        sc.close();
    }
}