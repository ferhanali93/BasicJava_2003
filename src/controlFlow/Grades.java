package controlFlow;

public class Grades {
    public static void main(String[] args) {
        findGrades("Ferhan", 90);
        findGrades("Monir", 95);
        findGrades("Huma", 88);
        findGrades("Sadika", 75);

    }
    public static void findGrades(String studentName, int score){
        String grade = null;
        if (score >= 90 &&score <= 100){
            grade = "A";
        } else if (score >= 80 && score < 90){
            grade = "B";
        } else if (score >= 70 && score < 80){
            grade = "C";
        } else if (score >= 60 && score < 70){
            grade = "D";
        } else if (score < 60){
            grade = "F";
        }
        
        System.out.println("Grade of " + studentName + " is " + grade);
    }
}
