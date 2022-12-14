package Java_Core_Classes.day44_Abstraction_InterfaceIntro.AnimalTask;

public final class Cat extends Animal implements Playable{

    public Cat(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " eats Biryani");
    }

    @Override
    public void play() {
        System.out.println(getName() + " is playing with wool");
    }

    public void meow(){
        System.out.println(getName() + " is meowing");
    }
}
