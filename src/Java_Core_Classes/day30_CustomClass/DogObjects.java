package Java_Core_Classes.day30_CustomClass;

import java.util.ArrayList;

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

        Dog dog4 = new Dog();
        dog4.setInfo("Jenny", "Labrador", 3, 'M', "extra large", "yellow");
        Dog dog5 = new Dog();
        dog5.setInfo("Sally", "Pit-bull", 6, 'M', "large", "black" );

        Dog[] dogs = {dog1, dog2, dog3, dog4, dog5};

        ArrayList<Dog> femaleDogs = new ArrayList<>();
        ArrayList<Dog> maleDogs = new ArrayList<>();

        for (Dog dog : dogs) {
            if (dog.gender == 'M')
                maleDogs.add(dog);
            else femaleDogs.add(dog);
        }

        System.out.println(femaleDogs);
        System.out.println(maleDogs);

    }
}
