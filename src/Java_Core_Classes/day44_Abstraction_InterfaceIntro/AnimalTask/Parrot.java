package Java_Core_Classes.day44_Abstraction_InterfaceIntro.AnimalTask;

public final class Parrot extends Animal{
    public Parrot(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " eats chocolate");
    }

}
