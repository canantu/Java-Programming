package Java_Core_Classes.day36_Inheritance.employeeTask;

import Java_Core_Classes.day32_Constructor.Test;

public class Employees {
    public static void main(String[] args) {

        Developer dev = new Developer();
        dev.setInfo("Ali", "Java Developer", "IBM",'M', 38, 100, 140000 );
        dev.work();
        dev.code();
        System.out.println(dev);

        Tester tester = new Tester();

        Driver driver = new Driver();
    }
}
