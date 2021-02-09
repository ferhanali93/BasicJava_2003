package inheritance;

public class Corolla extends PreCorolla{

    public static void main(String[] args) {
        Corolla corolla = new Corolla();
        corolla.lightsOn();
        corolla.brake();
        corolla.horn();

    }
    public void lightsOn(){
        System.out.println("Lights can turn on...");
    }
}
