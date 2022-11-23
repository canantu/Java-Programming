package Java_Core_Classes.day34_GarbageCollection_AccessModifiers;

import Java_Core_Classes.day32_Constructor.Car;
import Java_Core_Classes.day33_Statics.Iphone;

public class GarbageCollection {
    public static void main(String[] args) {

        // null = no object is created
        //String str = null;  // not same as String str = ""; == this is an empty string

        String str = "Wooden Spoon";
        // after line 11, "Wooden Spoon" will be eligible for garbage collection
        str = null;
        System.out.println(str);

        Car car = new Car("Toyota");  // after line 18, eligible for garbage coll.
        car = null;
        System.out.println(car);



    }
}
