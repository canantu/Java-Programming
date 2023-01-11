package Java_Core_Classes.day43_Abstraction.employee;

public class Developer extends Employee{

    public Developer(String name, char gender, int age, String id, String jobTitle, double salary) {
        super(name, gender, age, id, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println(getName() + " is coding");
    }

    @Override
    public void sleep() {
        System.out.println(getName() + " sleeps 6 hours");
    }
}
