package inheritance;
public abstract class PreCorolla implements Vehicle {
    public void horn(){

        System.out.println("The car should horn");
    }

    public void brake(){
        System.out.println("car is braking");
    }
    public abstract void lightsOn();


}
