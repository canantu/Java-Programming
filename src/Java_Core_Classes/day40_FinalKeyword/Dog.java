package Java_Core_Classes.day40_FinalKeyword;

public final class Dog extends Animal{
    public Dog(String name, String breed, char gender, String color, String size, int age) {
        super(name, breed, gender, color, size, age);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating dog food.");
    }
    /*
    public void drink(){
        System.out.println(getName() + " is drinking cola.");
    }
    final methods can not be overridden     */

    public void bark(){
        System.out.println(getName() + " is barking");
    }


}
