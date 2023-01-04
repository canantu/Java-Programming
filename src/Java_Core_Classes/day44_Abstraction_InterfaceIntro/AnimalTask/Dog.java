package Java_Core_Classes.day44_Abstraction_InterfaceIntro.AnimalTask;

public final class Dog extends Animal implements Playable{

    public Dog(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " eats Pizza");
    }

    @Override
    public void play() {
        System.out.println(getName() + " is playing  with ball");
    }

    public void bark(){
        System.out.println(getName() + " is barking");
    }
}
