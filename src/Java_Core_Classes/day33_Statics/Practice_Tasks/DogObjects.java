package Java_Core_Classes.day33_Statics.Practice_Tasks;

public class DogObjects {
    public static void main(String[] args) {
        Dog dog1 = new Dog("German Shepard", "Large", 'M', 3,"Black");

        dog1.eat();
        dog1.play();
        dog1.sleep();

        System.out.println(dog1);
    }
}
