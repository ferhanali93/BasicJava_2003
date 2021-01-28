public class Light {
    // Below the properties of the light
    int weight;
    int length;
    int radius;
    String color;
    String shape;

    // Here is a constructor below:
    public Light(int weight, int length, int radius, String color, String shape){
        this.weight = weight;
        this.length = length;
        this.radius = radius;
        this.color = color;
        this.shape = shape;
    }

    public static void main(String[] args) {
        System.out.println("This is my first Java app (light)");
        System.out.println("");
        Light myFirstLight = new Light(100, 5, 2, "Black", "Round");
        Light mySecondLight = new Light(70, 7, 3, "White", "Oval");

        myFirstLight.turnOnLights("myFirstLight");
        myFirstLight.turnOffLights("myFirstLight");
        System.out.println(" ");
        mySecondLight.turnOnLights("mySecondLight");
        mySecondLight.turnOffLights("mySecondLight");



    }
    public void turnOnLights(String lightName){
        System.out.println(lightName + " turned on");

    }

    public void turnOffLights(String TurnOfflightName){
        System.out.println(TurnOfflightName + " turned off");
    }
}
