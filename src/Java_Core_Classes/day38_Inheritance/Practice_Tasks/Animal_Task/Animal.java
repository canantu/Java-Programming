package Java_Core_Classes.day38_Inheritance.Practice_Tasks.Animal_Task;

public class Animal {

    public String name, breed, color;
    public int age, size;
    public char gender;

    public Animal(String name, String breed, String color, int age, int size, char gender) {
        this.name = name;
        this.breed = breed;
        this.color = color;
        this.age = age;
        this.size = size;
        this.gender = gender;
    }

    public void eat(){
        System.out.println(name + " is eating");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                ", size=" + size +
                ", gender=" + gender +
                '}';
    }
}
