package oopConcepts;

public class Airplane {
    String name;
    String color;
    int weight;
    int size;

    public Airplane(String name, String color, int weight, int size){
        this.name = name;
        this.color = color;
        this.weight = weight;
        this.size = size;

    }
    public static void main(String[] args) {
        Airplane spirit = new Airplane("Spirit Airline","Yellow", 3, 300 );
            spirit.fly("Spirit Airline");
            spirit.land("Spirit Airline");

        System.out.println();

        Airplane american = new Airplane("American Airline", "White", 4,400 );
        american.fly("American Airline");
        american.land("American Airline");
    }
    public void fly(String nameOfAirline){
        System.out.println(nameOfAirline + " is flying");
    }
    public void land(String nameOfAirline){
        System.out.println(nameOfAirline + " is landing");
    }

}
