public class Television {
    String brand;
    String color;
    String shape;
    int size;
    int weight;

    public Television(String brand, String color, String shape, int size, int weight){
        this.brand = brand;
        this.color = color;
        this.shape = shape;
        this.size = size;
        this.weight = weight;
    }

    public static void main(String[] args) {
        Television samsungTv;  // weight are in kg and size are in inches
        samsungTv = new Television("Samsung", "Black", "Rectangle", 86, 25);

        Television appleTv;
        appleTv = new Television("Apple", "White", "Rectangle", 30, 15);

        Television lgTv;
        lgTv = new Television("LG", "Grey", "Rectangle", 65, 20);

        samsungTv.turnOn("Samsung Tv");
        samsungTv.changeChannels("Discovery");
        samsungTv.increaseVolume(50);
        samsungTv.decreaseVolume(30);
        samsungTv.turnOff("Samsung Tv");
        System.out.println();

        appleTv.turnOn("Apple Tv");
        appleTv.decreaseVolume(40);
        appleTv.changeChannels("CNN");
        appleTv.increaseVolume(60);
        appleTv.turnOff("Apple Tv");
        System.out.println();

        lgTv.turnOff("LG Tv");
        lgTv.turnOn("LG Tv");
        lgTv.increaseVolume(35);
        lgTv.changeChannels("MSNBC");
        lgTv.decreaseVolume(20);
        lgTv.turnOff("LG Tv");
        

    }
    public void turnOn(String tvName){
        System.out.println(tvName + " is turned On");
    }
    public void turnOff(String tvName){
        System.out.println(tvName + " is turned off");
    }
    public void changeChannels(String channelChange){
        System.out.println("channel is  changed to: " + channelChange);

    }
    public void increaseVolume(int volumeInc){
        System.out.println("volume is increased to " + volumeInc);

    }
    public void decreaseVolume(int volumeDec){
        System.out.println("volume is decreased to " + volumeDec);
    }
}
