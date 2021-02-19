package unittesting;

public class Calculator {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.add(2, 4);
    }
        public int add( int x, int y){
            int result = x + y;
            System.out.println(result);
            return result;
        }
    }
