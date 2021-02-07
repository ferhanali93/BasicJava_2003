package scannerClasses;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        double num1, num2;
        /* We are using data type double so that user
         * can enter integer as well as floating point
         * value
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");

        num1 = scanner.nextDouble();
        System.out.println("Enter second number: ");
        num2 = scanner.nextDouble();

        System.out.println("Enter an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);
        scanner.close();
        double output;

        switch(operator)
        {
            case '+':
                output = num1 + num2;
                break;

            case '-':
                output = num1 - num2;
                break;

            case '*':
                output = num1 * num2;
                break;

            case '/':
                output = num1 / num2;
                break;

            /* If user enters any other operator or char apart from
             * +, -, * and /, then display an error message to user
             *
             */
            default:
                System.out.printf("You have entered wrong operator");
                return;
        }

        System.out.println(num1+" "+operator+" "+num2+": "+output);
    }
}
