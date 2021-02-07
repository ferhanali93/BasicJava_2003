package oopConcepts;

public class Car {
    int speed;
    int gear;
    int brake;
    String name = "Ferrari:";

    public Car(){
    }

    public static void main(String[] args) {
        Car ferrari = new Car();
        ferrari.setGear(1);
        ferrari.setSpeed(60);
        ferrari.printStates();

        ferrari.setGear(2);
        ferrari.setSpeed(50);
        ferrari.printStates();

        ferrari.setGear(3);
        ferrari.setSpeed(90);
        ferrari.printStates();

        ferrari.setSpeed(4);
        ferrari.setSpeed(90);
        ferrari.printStates();
    }
    public void setGear(int newValue){
        gear = newValue;
    }
    public void setSpeed(int increment){
        speed = speed + increment;
    }
    public void setBrake(int decrement){
        brake = speed - decrement;
    }
    public void printStates(){
        System.out.println(name + " Gear: " + gear + " speed:" + speed);
    }
}
