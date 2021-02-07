package scannerClasses;

import java.util.Scanner;

public class HelloName {
    public static void main(String[] args) {
        String name, response;
        int age;
        double income;

        Scanner humanInput = new Scanner(System.in);
        System.out.println("What is your name? ");
        name = humanInput.nextLine();
        System.out.println("Hello " + name + "!");

        System.out.println("How old are you Ferhan? ");
        age = humanInput.nextInt();
        System.out.println("So you are " + age + "years old " + "Ferhan!");

        System.out.println("What is your yearly Income Ferhan?");
        income = humanInput.nextInt();
        System.out.println("Let me confirm your income, your income is: " + income + " is that correct?");
        response = humanInput.next();
        System.out.println("Thanks for providing these information. Ferhan!");
        humanInput.close();
    }
}