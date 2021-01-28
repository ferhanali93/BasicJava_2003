public class Dog {
    int age;
    String color;
    String breed;

    public Dog(int age, String color, String breed){
        this.age = age;
        this.color = color;
        this.breed = breed;
    }

    public static void main(String[] args) {
        Dog pitBull = new Dog(5, "Black", "Pit bull");
        Dog bullDog = new Dog(4, "Brown", "Bull dog");

        pitBull.barking("Pit bull");
        bullDog.barking("Bull dog");
    }
    public void barking(String dogName){
        System.out.println(dogName + " is barking");
    }
}
