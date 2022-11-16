package Java_Core_Classes.day30_CustomClass;

public class Dog {
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
/*
Attributes:
    name, age, gender, breed, size, color

Actions:
    eat(), play(), bark(), ....
 */