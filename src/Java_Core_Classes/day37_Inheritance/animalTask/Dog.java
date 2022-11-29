package Java_Core_Classes.day37_Inheritance.animalTask;

public class Dog extends Animal{

    public Dog(String name, String breed, String size, String color, char gender, int age) {
        super(name, breed, size, color, gender, age);
    }

    public void bark(){
        System.out.println(name + " is barking");
    }
}
