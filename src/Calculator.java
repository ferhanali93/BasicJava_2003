public class Calculator {
    int length;
    String color;
    String type;
    int weight;
    int price;

    public Calculator(int length, String color, String type, int weight, int price){
        this.length = length;
        this.color = color;
        this.type = type;
        this.weight = weight;
        this.price = price;
    }

    public static void main(String[] args) {
        add(200, 400);
        subtract(1000, 500);
        multiply(10, 800);
        division(25, 5);
        module(12,5);

        Calculator cal = new Calculator(7, "Black", "Digital", 200, 50);
            cal.functionality("Digital Calculator");
    }
    public void functionality(String nameOfCal){
        System.out.println(nameOfCal + " is working");
    }
    public static void add(int a, int b){ //method: adding
        int result = a + b;
        System.out.println("The result of (a+b) is: " + result );
    }
    public static void subtract(int c, int d){ // method: subtraction
        int result = c - d;
        System.out.println("The result of (c-d) is: " + result);
    }
    public static void multiply(int e, int f){ //method: multiplication
        int result = e * f;
        System.out.println("The result of (e*f) is: " + result);
    }
    public static void division(int g, int h){ // method: division
        int result = g / h;
        System.out.println("The result of (g/h) is: " + result);
    }
    public static void module(int i, int j){ //method: module
        int result = i % j;
        System.out.println("The result of (i%j) is: " + result);
    }

}
