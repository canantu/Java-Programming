package Java_Core_Classes.day32_Constructor;

public class EmployeeObject {

    public static void main(String[] args) {

        Employee employee1 = new Employee("Canan");
        System.out.println(employee1);

        Employee employee2 = new Employee("Ali", 'M');
        System.out.println(employee2);

        Employee employee3 = new Employee("Alina", 'F', "SDET");
        System.out.println(employee3);

    }
}
