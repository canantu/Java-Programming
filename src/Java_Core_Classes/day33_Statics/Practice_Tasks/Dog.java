package Java_Core_Classes.day33_Statics.Practice_Tasks;

import org.w3c.dom.ls.LSOutput;

public class Dog {

    public String breed;
    public String size;
    public char gender;
    public int age;
    public String color;

    public static int numberOfLegs = 4;
    public static int numberOfEyes = 2;
    public static int numberOfWings = 0;
    public static boolean isFriendly = true;

    public Dog(String breed, String size, char gender, int age, String color) {
        this.breed = breed;
        this.size = size;
        this.gender = gender;
        this.age = age;
        this.color = color;
    }

    public void eat(){
        System.out.println(breed + " is eating");
    }

    public void sleep(){
        System.out.println(breed + " is sleeping");
    }

    public void play(){
        System.out.println(breed + " is playing");
    }

    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                ", size='" + size + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
