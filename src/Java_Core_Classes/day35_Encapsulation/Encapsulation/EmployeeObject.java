package Java_Core_Classes.day35_Encapsulation.Encapsulation;

public class EmployeeObject {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Daniel", 23, 'M', 130000);
        System.out.println(employee1);

        employee1.setAge(33);
        System.out.println(employee1);

        Employee employee2 = new Employee("    CAN   ", 10, 'A', 100000);
        employee2.setSalary(employee2.getSalary() + 15000);
        System.out.println(employee2);


        /*
        employee.setAge(-28);
        employee.setName("");
        */


    }
}
