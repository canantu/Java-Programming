package Java_Core_Classes.day44_Abstraction_InterfaceIntro.AnimalTask;

public class AnimalTest {

    public static void main(String[] args) {

        Dog dog = new Dog("Max", "Husky", 'M',2, "small", "white");

        dog.bark();
        dog.eat();

        System.out.println(dog);
    }
}
