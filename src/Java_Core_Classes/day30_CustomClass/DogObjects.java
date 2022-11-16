package Java_Core_Classes.day30_CustomClass;

public class DogObjects {
    public static void main(String[] args) {
        Dog dog1 = new Dog();

        dog1.breed = "Husky";
        dog1.name = "Lucy";
        dog1.age = 5;
        dog1.gender = 'F';
        dog1.size = "small";
        dog1.color = "white";

        Dog dog2 = new Dog();
        dog2.name = "Lilli";
        dog2.color = "black";
        dog2.breed = "Husky";
        dog2.age = 5;
        dog2.gender = 'M';
        dog2.size = "Large";

        Dog dog3 = new Dog();
        dog3.setInfo("Jack", "German Sheperd", 2, 'M', "Large", "Black");

        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);

        dog1.eat();
        dog2.bark();
        dog3.eat();

    }
}
