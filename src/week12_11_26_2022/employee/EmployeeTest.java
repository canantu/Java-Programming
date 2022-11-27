package week12_11_26_2022.employee;

public class EmployeeTest {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Adam", 123, 'M');
        System.out.println(employee1);

        Employee employee2 = new Employee("Eve");
        System.out.println(employee2);

        Employee employee3 = new Employee("AdamEve", 124);
        System.out.println(employee3);
    }
}
