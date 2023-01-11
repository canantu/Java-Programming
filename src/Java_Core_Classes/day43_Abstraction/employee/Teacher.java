package Java_Core_Classes.day43_Abstraction.employee;

public class Teacher extends Employee{
    public Teacher(String name, char gender, int age, String id, String jobTitle, double salary) {
        super(name, gender, age, id, jobTitle, salary);
    }

    @Override
    public void work() {

    }

    @Override
    public void sleep() {

    }
}
