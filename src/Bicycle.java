public class Bicycle {
    int cadence;
    int speed;
    int gear;

    public Bicycle(){
    }

    public static void main(String[] args) {
        Bicycle bike1 = new Bicycle();
        Bicycle bike2 = new Bicycle();

        bike1.changeCadence(50);
        bike1.changeGear(10);
        bike1.speedUp(2);
        bike1.printStates();
            System.out.println();
        bike2.changeCadence(50);
        bike2.speedUp(10);
        bike2.changeGear(2);
        bike2.changeCadence(40);
        bike2.speedUp(10);
        bike2.changeGear(3);
        bike2.printStates();

    }
    public void changeCadence(int newValue){
        cadence = newValue;
    }
    public void changeGear(int newValue){
        gear = newValue;
    }
    public void speedUp(int increment){
        speed = speed + increment;
    }
    public void applyBrakes(int decrement){
        speed = speed - decrement;
    }
    public void printStates(){
        System.out.println("cadence:" + cadence + " speed:" + speed + " gear:" + gear);
    }
}
