package Java_Core_Classes.day38_Inheritance.Practice_Tasks.Animal_Task;

public class PetShop {

    public static void main(String[] args) {
        Cat cat = new Cat("kitty", "British", "white", 2, 10, 'F');
        Dog dog = new Dog("Charlie", "Kangal", "brown", 4, 23, 'M');

        cat.eat();
        dog.eat();
    }
}
