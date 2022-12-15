package Java_Core_Classes.day38_Inheritance.Practice_Tasks.Animal_Task;

public class Dog extends Animal{

    public Dog(String name, String breed, String color, int age, int size, char gender) {
        super(name, breed, color, age, size, gender);
    }

    @Override
    public void eat() {
        System.out.println("Dog is eating dog food");
    }

}
