package Java_Core_Classes.day37_Inheritance.animalTask;

public class AnimalObjects {
    public static void main(String[] args) {

        Dog dog = new Dog("Max", "German Shepard", "large", "black", 'F', 4);
        System.out.println(dog);
        dog.bark();
        dog.eat();

        Cat cat = new Cat("Lily", "British", "small", "white", 'F', 3);
        System.out.println(cat);
        cat.meow();
        cat.drink();

        Parrot parrot = new Parrot("King", "Macaw", "small", "red", 'M', 6);
        System.out.println(parrot);
        parrot.sing();
        parrot.move();

    }
}
