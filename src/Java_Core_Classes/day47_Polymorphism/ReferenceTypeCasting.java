package Java_Core_Classes.day47_Polymorphism;

import Java_Core_Classes.day32_Constructor.Test;
import Java_Core_Classes.day43_Abstraction.employee.Employee;
import Java_Core_Classes.day43_Abstraction.employee.Person;
import Java_Core_Classes.day43_Abstraction.employee.Teacher;
import Java_Core_Classes.day43_Abstraction.employee.Tester;
import Java_Core_Classes.day44_Abstraction_InterfaceIntro.AnimalTask.Animal;
import Java_Core_Classes.day44_Abstraction_InterfaceIntro.AnimalTask.Cat;
import Java_Core_Classes.day44_Abstraction_InterfaceIntro.AnimalTask.Dog;
import Java_Core_Classes.day45_Abstraction_Interface.shape.*;

public class ReferenceTypeCasting {
    public static void main(String[] args) {

      //  Shape shape = (Shape) new Circle(5);
        Shape shape = new Circle(5);    // upcasting done implicitly

        //WebDriver driver = new ChromeDriver();

        Animal animal = new Dog("Max","Husky", 'M', 3, "Small", "White" );
     //   animal.bark();  compile error

        Dog dog = (Dog) animal;
        dog.bark();

       ((Dog)animal).bark();  // if you use it only once, this type of down-casting is used.
        // if you need more than one, then it is better to define a variable.

        System.out.println("dog.getName() = " + dog.getName());
        System.out.println("animal.getName() = " + animal.getName());

        System.out.println("--------------------------------------------------");

        Shape shape1 = new Square(5);
        System.out.println(((Square) shape1).getSide());

        System.out.println("--------------------------------------------------");

        Animal animal2 = new Cat("Jim","Scottish", 'M', 3, "Small", "White" );
        Cat cat = (Cat) animal2;
        cat.meow();

        ((Cat) animal2).meow();

       // ((Dog) animal2).bark();    ClassCastException is thrown
      // there should be inheritance between object type and reference type
        // you can not cast Cat type to Dog Type. there is not relationship between cat and dog.


        System.out.println("--------------------------------------------------");

        Employee employee = new Tester("canan", 'F', 37, "123", "SDET", 60000);
        ((Tester)employee).bugReport();

     //   Teacher teacher = (Teacher) employee;   ClassCastException
        Person person = (Person) employee;

        System.out.println("--------------------------------------------------");

        Shape s1 = new Circle(5);
        s1.area();
        s1.perimeter();
     //   ((Volume)s1).volume();   // ClassCastException  , there is no inheritance



    }
}
