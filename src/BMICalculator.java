import java.util.Scanner;
public class BMICalculator {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double m, kg, bmi;
        // BMI CALCULATION BASED ON HEIGHT IN METERS AND WEIGHT IN KG.
        System.out.print( "Your height in m: " );
        m = keyboard.nextDouble();

        System.out.print( "your weight in kg: " );
        kg = keyboard.nextDouble();

        bmi = kg / (m*m);
        System.out.println( "Your BMI is " + bmi);

        // BMI CALCULATION BASED ON HEIGHT IN INCHES AND WEIGHT IN POUNDS.
        double inches, pounds, bmi2;
        System.out.print( "Your height in inches " );
        inches = keyboard.nextDouble();

        System.out.print( "your weight in pounds " );
        pounds = keyboard.nextDouble();

        bmi2 = pounds/ (inches*inches);
        System.out.println( " your BMI is: " + bmi2);
    }
}
