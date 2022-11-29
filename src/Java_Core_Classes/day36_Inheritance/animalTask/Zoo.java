package Java_Core_Classes.day36_Inheritance.animalTask;

public class Zoo {
    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.setInfo("Max", "Husky", "Small", "White", 'F', 2);

        dog.eat();
        dog.drink();
        dog.move();
        dog.bark();
        System.out.println(dog);

        Cat cat = new Cat();
        cat.setInfo("Lilly", "Short Hair", "Medium", "Brown", 'M', 3);
        cat.eat();
        cat.drink();
        cat.sleep();
        cat.meow();
        cat.scratch();
        System.out.println(cat);

        Tiger tiger = new Tiger();
        tiger.setInfo("Sher Khan", "Bengal", "Large", "Orange", 'F', 4);
        tiger.eat();
        tiger.drink();
        tiger.roar();
        tiger.hunt();
        System.out.println(tiger);
    }



}
