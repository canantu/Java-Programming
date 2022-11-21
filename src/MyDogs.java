import java.util.ArrayList;

public class MyDogs {
    public static void main(String[] args) {
        Java_Core_Classes.day30_CustomClass.Dog dog1 = new Java_Core_Classes.day30_CustomClass.Dog();

        dog1.breed = "Husky";
        dog1.name = "Lucy";
        dog1.age = 5;
        dog1.gender = 'F';
        dog1.size = "small";
        dog1.color = "white";

        Java_Core_Classes.day30_CustomClass.Dog dog2 = new Java_Core_Classes.day30_CustomClass.Dog();
        dog2.name = "Lilli";
        dog2.color = "black";
        dog2.breed = "Husky";
        dog2.age = 5;
        dog2.gender = 'M';
        dog2.size = "Large";

        Java_Core_Classes.day30_CustomClass.Dog dog3 = new Java_Core_Classes.day30_CustomClass.Dog();
        dog3.setInfo("Jack", "German Sheperd", 2, 'M', "Large", "Black");

        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);

        dog1.eat();
        dog2.bark();
        dog3.eat();

        Java_Core_Classes.day30_CustomClass.Dog dog4 = new Java_Core_Classes.day30_CustomClass.Dog();
        dog4.setInfo("Jenny", "Labrador", 3, 'M', "extra large", "yellow");
        Java_Core_Classes.day30_CustomClass.Dog dog5 = new Java_Core_Classes.day30_CustomClass.Dog();
        dog5.setInfo("Sally", "Pit-bull", 6, 'M', "large", "black" );

        Java_Core_Classes.day30_CustomClass.Dog[] dogs = {dog1, dog2, dog3, dog4, dog5};

        ArrayList<Java_Core_Classes.day30_CustomClass.Dog> femaleDogs = new ArrayList<>();
        ArrayList<Java_Core_Classes.day30_CustomClass.Dog> maleDogs = new ArrayList<>();

        for (Java_Core_Classes.day30_CustomClass.Dog dog : dogs) {
            if (dog.gender == 'M')
                maleDogs.add(dog);
            else femaleDogs.add(dog);
        }

        System.out.println(femaleDogs);
        System.out.println(maleDogs);

    }
}

class Dog{
    public String name;
    public String breed;
    public String color;
    public String size;
    public int age;
    public char gender;

    public void setInfo(String dogName, String dogBreed, int dogAge, char dogGender, String dogSize, String dogColor){
        name = dogName;
        breed = dogBreed;
        color = dogColor;
        size = dogSize;
        age = dogAge;
        gender = dogGender;
    }

    public void eat(){
        System.out.println(name + " is eating.");
    }

    public void bark(){
        System.out.println(name + " is barking.");
    }

    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
