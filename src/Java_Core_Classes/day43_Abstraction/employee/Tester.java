package Java_Core_Classes.day43_Abstraction.employee;

public class Tester extends Employee{


    public Tester(String name, char gender, int age, String id, String jobTitle, double salary) {
        super(name, gender, age, id, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println(getName() + " is testing");
    }


    @Override
    public void sleep() {
        System.out.println(getName() + " sleeps 8 hours");
    }
}
