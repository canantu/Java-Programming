package Java_Core_Classes.day34_GarbageCollection_AccessModifiers;

import Java_Core_Classes.day30_CustomClass.Dog;
import Java_Core_Classes.day31_Constructors.Student;
import Java_Core_Classes.day32_Constructor.Car;
import Java_Core_Classes.day33_Statics.Iphone;

import java.util.ArrayList;
import java.util.Arrays;

public class GarbageCollection {
    public static void main(String[] args) {

        // null = no object is created
        //String str = null;  // not same as String str = ""; == this is an empty string

        System.out.println("------------null pointer------------");
        String str = "Wooden Spoon";
        // after line 11, "Wooden Spoon" will be eligible for garbage collection
        str = null;
        System.out.println(str);

        Car car = new Car("Toyota");  // after line 18, eligible for garbage coll.
        car = null;
        System.out.println(car);

        System.out.println("------------unreferencing ----------");

        // one reference name can reference only one object
        Dog dog1 = new Dog();
        dog1.name = "Lucy"; // eligible for garbage collection

        dog1 = new Dog();
        dog1.name = "Max";

        System.out.println(dog1);

        String language = "Python"; // eligible for garbage collection
        language = "Java";
        System.out.println(language);

        ArrayList<Integer> list1 = new ArrayList<>();

        list1.add(100);
        ArrayList<Integer> list2 = list1;
        System.out.println(list1);
        System.out.println(list2);

        list2.addAll(Arrays.asList(200, 300));
        System.out.println(list2);
        System.out.println(list1);  // list1 and list2 have same elements, referencing the same object

        System.out.println("-----------------------------------------------");

        Student student1 = new Student("canan", 30, 'F', 'A', 123);
        Student student2 = student1;
        student1.grade = 'F';
        student2.name = "Ali";

        System.out.println(student1);
        System.out.println(student2);

        System.out.println("------------------multiple reference name to one object------------------");
        // l1 and l2 are like two doors that opens to one room
        ArrayList<String> l1 = new ArrayList<>();
        l1.add("Java");

        ArrayList<String> l2 = l1;
        l2.add("Python");

        System.out.println("l1 = " + l1);
        System.out.println("l2 = " + l2);

        // if an object has any reference, it is eligible for garbage collection, unreferenced object

    }
}
