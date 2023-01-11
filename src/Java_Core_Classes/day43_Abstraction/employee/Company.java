package Java_Core_Classes.day43_Abstraction.employee;

import Java_Core_Classes.day32_Constructor.Test;

public class Company {
    public static void main(String[] args) {

        Tester tester = new Tester("canan", 'F', 37, "123", "SDET", 60000);
        Developer developer = new Developer("ali", 'M', 49, "223", "Java Developer", 70000);
        Teacher teacher = new Teacher("veli", 'M', 23, "223", "Math Teacher", 50000);

        System.out.println(tester);
    }
}
