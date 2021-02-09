package inheritance;

public class N1100 extends Pre1100{
    public static void main(String[] args) {
        N1100 n1100 = new N1100();
        n1100.makeCall();
        n1100.sendText();
        n1100.takePic();

    }
    public void takePic(){
        System.out.println("Take a pic");
    }
}
