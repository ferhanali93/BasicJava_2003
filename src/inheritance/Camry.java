package inheritance;

public class Camry extends PreCamry{
    public static void main(String[] args) {
        Camry camry = new Camry();
        camry.brake();
        camry.horn();
        camry.lightsOn();
        camry.speedUp();

    }
    public void speedUp(){
        System.out.println("speeding up");
    }
}
