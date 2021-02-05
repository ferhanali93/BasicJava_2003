public class TableWhileLoop {
    public static void main(String[] args) {
        int num = 2;
        int i = 1;
        while (i <= 10){
            System.out.printf("%d * %d = %d \n", num, i, num * i);
            i++;
        }
    }
}
