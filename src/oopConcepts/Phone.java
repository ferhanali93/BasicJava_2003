package oopConcepts;

public class Phone {
    // iphone, samsung, lg are phones in the market
    // these phones above are the objects of that phone class

    // properties of the phones (State of the phone)
    String brand;
    String model;
    String color;
    int price;

    // constructor --> builder --> Same Name as Class Name
    public Phone(String brand, String model, String color, int price){
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.price = price;
        System.out.println("I am in the phone factory");
    }

    public static void main(String[] args) {
        // These are the objects of the phone class
        Phone iphone = new Phone("Apple", "12 pro max", "Blue", 1100);
        Phone android = new Phone("Samsung", "S20", "Bronze", 800);

        iphone.sendText("iphone Pro Max 12");
        iphone.makeCall("iphone Pro Max 12");

        System.out.println(" ");

        android.sendText("Samsung S20");
        android.makeCall("Samsung S20");

    }
    public void sendText(String phoneName){  //method 1: phone should send text
        System.out.println(phoneName + " is sending text message.");

    }

    public void makeCall(String phoneName){ // method 2: phone should make call
        System.out.println(phoneName + " is making a call");

    }
}
