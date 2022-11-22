package Java_Core_Classes.day34_GarbageCollection_AccessModifiers;

import java.util.ArrayList;

public class Circle {

    public double radius;
    public static double pi;
    // public static double pi = 3.14; this is also possible, but sometimes we need more steps to initialize a static variable
    // therefore we need static block to set the static variable
    // it is better to use everytime a static block regardless of the number of steps
    public static String name;
    public static ArrayList<Integer> numbers;
    // public static Sheet sheet1; we will need these type of declarations to reach test data stored in an Excel sheet

    static {
        pi = 3.14;
        name = "Circle";
        numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
    }
    // you can always use static block to set static variables
    // it never fails


    public Circle(double radius) {
        this.radius = radius;
    }

    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                " area=" + radius*radius*pi +
                '}';
    }


    // do not use main method to initialize static variables.
    // outside the main, they can not be reached, because main method can not be run outside the class it is written
    // no way to execute main method outside class
    // without executing main, we can not initialize those static variables
    // therefore we can not use main method to initialize statics

    /*
    public static void main(String[] args) {
        pi = 3.14;
        name = "Circle";
    }
    */
}


