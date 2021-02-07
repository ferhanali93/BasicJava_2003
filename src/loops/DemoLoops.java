package loops;

public class DemoLoops {
    public static void main(String[] args) {
        System.out.println("This is multiplication table of 2");
        table(1, 2);
    }
    public static void table(int count, int tableOf){

        for (int i = 1 ; i<=10; i++){
            int z=i*tableOf;
            System.out.println(tableOf+ "*"+ count+ "="+ z);
        }
        System.out.println("End of the Table....");
    }
}
