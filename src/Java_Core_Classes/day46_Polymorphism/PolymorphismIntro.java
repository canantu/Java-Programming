package Java_Core_Classes.day46_Polymorphism;



import Java_Core_Classes.day43_Abstraction.employee.Developer;
import Java_Core_Classes.day43_Abstraction.employee.Employee;
import Java_Core_Classes.day43_Abstraction.employee.Teacher;
import Java_Core_Classes.day43_Abstraction.employee.Tester;
import Java_Core_Classes.day44_Abstraction_InterfaceIntro.AnimalTask.Animal;
import Java_Core_Classes.day44_Abstraction_InterfaceIntro.AnimalTask.Dog;
import Java_Core_Classes.day44_Abstraction_InterfaceIntro.AnimalTask.Playable;
import Java_Core_Classes.day45_Abstraction_Interface.shape.*;

import java.util.ArrayList;

public class PolymorphismIntro {

    public static void main(String[] args) {

        String str = "Wooden Spoon";
        Integer n1 = 2;
        Double n2 = 5.5;
        Boolean r1 = true;

     //   String [] array = {str, n1, n2, r1};  compilation error

   //     Object [] array = {str, n1, n2, r1, new Circle(4), new Square(4)};  // Object type is a universal type

        /*
        WebDriver driver;
        driver = new ChromeDriver();
        driver = new FirefoxDriver();

         */

        Employee tester = new Tester("canan", 'F', 37, "123", "SDET", 60000);
        Employee developer = new Developer("ali", 'M', 49, "223", "Java Developer", 70000);
        Employee teacher = new Teacher("veli", 'M', 23, "223", "Math Teacher", 50000);

        ArrayList<Employee> cydeoEmployees = new ArrayList<>();

        cydeoEmployees.add(tester);
        cydeoEmployees.add(developer);
        cydeoEmployees.add(teacher);

        // there is a relationship between reference type (data type) and object type. so we achieve polymorphism.


        System.out.println("-----------------------------------------------------------------");

        Employee employee = new Tester("canan", 'F', 37, "123", "SDET", 60000);
        employee.work();
    //    employee.bugReport();   can not reach subclass' methods

        /*

        WebDriver driver1 = new ChromeDriver();
        WebDriver driver2 = new Firefox();

        driver1.get(amazon);   different implementations for each object type for get method
        driver2.get(google);


        Animal animal = new Dog();
        animal.drink();    there is one implementation / animal drink water


        Animal animal = new Cat();
        animal.drink();    cat drinks milk/ overridden method

        when there is more than one implementation, only one of them and overridden method gets executed,
        if not overridden, then the original method is executed.

         */

        System.out.println("-----------------------------------------------------------------");

        Animal animal = new Dog("Max","Husky", 'M', 3, "Small", "White" );
        animal.drink();
        animal.eat();
     //   animal.play();    can not call Playable interface methods
     //   animal.bark();    can not call Dog() methods


        Playable animal2 = new Dog("Max","Husky", 'M', 3, "Small", "White" );
        System.out.println(animal2.isFriendly);
        animal2.play();
      //  animal2.drink();
      //  animal2.eat();


        System.out.println("-----------------------------------------------------------------");

        Shape shape = new Circle(5);
        shape.area();

     //   System.out.println(shape.getRadius());
     //   System.out.println(shape.pi);

        boolean isSquare = shape instanceof Square;
        boolean isTriangle = shape instanceof Triangle;
        boolean isCircle = shape instanceof Circle;

        System.out.println("isTriangle = " + isTriangle);
        System.out.println("isSquare = " + isSquare);
        System.out.println("isCircle = " + isCircle);

        System.out.println("-----------------------------------------------------------------");

        /*
        if(driver instanceof Chrome)
             Chrome browser will open
        else if (driver instanceof Firefox)
              Firefox browser will open

        ....
        instanceof helps to identify the object type because a reference variable can have multiple types

         */


    }
}
