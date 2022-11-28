package Java_Core_Classes.day35_Encapsulation.Encapsulation;

public class EmployeeObject {
    public static void main(String[] args) {

        Employee employee = new Employee();

        employee.setAge(-28);
        employee.setName("");

        System.out.println(employee.getName() + ": " + employee.getAge());
    }
}
