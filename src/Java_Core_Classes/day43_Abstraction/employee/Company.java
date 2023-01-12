package Java_Core_Classes.day43_Abstraction.employee;

import Java_Core_Classes.day32_Constructor.Test;

public class Company {

    public static void main(String[] args) {

        //Person person = new Person("Josh", 35, 'M');
        //Employee employee = new Employee("Ali",30,'M',42,"SDET",145000.00);

        Tester tester = new Tester("Ali", 30, 'M', 42, "SDET", 145000.00);
        Developer developer = new Developer("Alex", 28, 'M', 32, "Web Developer", 155000.00);
        Teacher teacher = new Teacher("Angel", 28, 'F', 22, "English Teacher", 85000.00);


        System.out.println(tester);
        System.out.println(developer);
        System.out.println(teacher);


        tester.work();
        tester.sleep();
        tester.bugReport();
        tester.eat();

        System.out.println("-----------------------------------");

        developer.work();
        developer.sleep();
        // developer.bugReport();
        developer.eat();
        developer.unitTest();

        System.out.println("-----------------------------------");

        teacher.work();
        teacher.sleep();
        teacher.eat();


    }
}