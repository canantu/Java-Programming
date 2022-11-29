package Java_Core_Classes.day37_Inheritance.animalTask;

public class Cat extends Animal{

    public Cat(String name, String breed, String size, String color, char gender, int age) {
        super(name, breed, size, color, gender, age);
    }

    public void meow(){
        System.out.println(name + " is meowing");
    }
}

