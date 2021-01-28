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
        System.out.println("You are in the Fan Factory");
    }

    public static void main(String[] args) {
        Fan ceilingFan = new Fan(22, 200, "white", "ceiling Fan");
        ceilingFan.turnOn("Ceiling Fan");
        ceilingFan.turnOff("Ceiling Fan");

        System.out.println(" ");

        Fan tableFan = new Fan(12, 100, "Black", "Table Fan");
        tableFan.turnOn("Table Fan");
        tableFan.turnOff("Table Fan");


    }
    public void turnOn(String fanName ){
        System.out.println(fanName+ " is turned on");
    }
    public void turnOff(String fanName){
        System.out.println(fanName+ " is turned off");
    }
}
