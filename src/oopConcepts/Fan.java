package oopConcepts;

public class Fan {
    int size;
    int weight;
    String color;
    String type;

    public Fan(int size, int weight, String color, String type){
        this.size = size;
        this.weight = weight;
        this.color = color;
        this.type = type;
        System.out.println("You are in the oopConcepts.Fan Factory");
    }

    public static void main(String[] args) {
        Fan ceilingFan = new Fan(22, 200, "white", "ceiling oopConcepts.Fan");
        ceilingFan.turnOn("Ceiling oopConcepts.Fan");
        ceilingFan.turnOff("Ceiling oopConcepts.Fan");

        System.out.println(" ");

        Fan tableFan = new Fan(12, 100, "Black", "Table oopConcepts.Fan");
        tableFan.turnOn("Table oopConcepts.Fan");
        tableFan.turnOff("Table oopConcepts.Fan");


    }
    public void turnOn(String fanName ){
        System.out.println(fanName+ " is turned on");
    }
    public void turnOff(String fanName){
        System.out.println(fanName+ " is turned off");
    }
}
