package Java_Core_Classes.day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class CapitalOne {
    public static void main(String[] args) {

        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        Employee employee3 = new Employee();
        Employee employee4 = new Employee();
        Employee employee5 = new Employee();

        employee1.setInfo("Canan", 10, "QA", 60000, true);
        employee2.setInfo("Ali", 11, "Developer", 70000, true);
        employee3.setInfo("Alim", 12, "QA", 35000, false);
        employee4.setInfo("Nese", 13, "Scrum Master", 40000, true);
        employee5.setInfo("Meral", 14, "PO", 50000, false);

        Employee[] employees = {employee1, employee2, employee3, employee4, employee5};

        ArrayList<Employee> fullTimeList = new ArrayList<>(Arrays.asList(employees));
        fullTimeList.removeIf(p-> !p.isFullTime);

        System.out.println(fullTimeList.size() + " employees are full time");

        double max = employees[0].salary;
        double min = employees[0].salary;

        for (Employee each : employees) {
            if (each.salary > max)
                max = each.salary;
            if(each.salary < min)
                min = each.salary;
        }

        System.out.println("min = " + min);
        System.out.println("max = " + max);




    }
}
