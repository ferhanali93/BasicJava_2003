package scannerClasses;

import java.util.Scanner;

public class Batch2003 {
    public static void main(String[] args) {
        String name;
        int idNum;
        char grade;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter student's Id Number: ");
        idNum = sc.nextInt();

        System.out.println("Enter student's Name: ");
        name = sc.next();

        System.out.println("you entered id# " + idNum + " and Name: " + name);
        grade = 'A';

        System.out.println("you grade is: " + grade);
    }
}
