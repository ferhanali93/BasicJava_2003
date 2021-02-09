package inheritance;

public class Nokia3310 extends N1100{
    public static void main(String[] args) {
        Nokia3310 n3310 = new Nokia3310();
        n3310.makeCall();
        n3310.sendText();
        n3310.takePic();
    }
}
