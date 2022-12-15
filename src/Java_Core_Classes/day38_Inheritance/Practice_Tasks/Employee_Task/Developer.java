package Java_Core_Classes.day38_Inheritance.Practice_Tasks.Employee_Task;

public class Developer extends Employee{
    public Developer(String name, int age, int id, int salary, char gender) {
        super(name, "Developer", age, id, salary, gender);
    }

    @Override
    public void work() {
        System.out.println(name + " is coding");
    }
}
