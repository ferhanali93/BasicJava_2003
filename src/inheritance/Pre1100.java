package inheritance;

public abstract class Pre1100 implements Symbian{
    public void makeCall(){
        System.out.println("Make a call...");
    }
    public void sendText(){
        System.out.println("Send a text...");
    }
    public abstract void takePic();
}
