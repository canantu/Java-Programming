package Java_Core_Classes.day37_Inheritance.animalTask;

public class Parrot extends Animal{

     // public String wingColor; if Parrot class has an extra variable

    public Parrot(String name, String breed, String size, String color, char gender, int age) {
        super(name, breed, size, color, gender, age);
       // this.wingColor = wingColor; and also in constructor call
    }

    public void sing(){
        System.out.println(name + " is singing");
    }
}
