package Java_Core_Classes.day38_Inheritance.Practice_Tasks.Animal_Task;

public class Cat extends Animal{

    public Cat(String name, String breed, String color, int age, int size, char gender) {
        super(name, breed, color, age, size, gender);
    }

    @Override
    public void eat() {
        System.out.println("Cat is eating cat food");
    }
}
