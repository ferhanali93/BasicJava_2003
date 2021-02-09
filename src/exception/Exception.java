package exception;

public class Exception {
    public static void main(String[] args) {
       division(4, 0);

    }
    public static void division(int x, int y){

        try {
            int results = x/y;
        }
        catch (ArithmeticException exception){
            System.out.println(exception);
        }
        finally {
            System.out.println("Mathematical rule: You can not divide any number by zero, it is undefined");
        }
    }
}
