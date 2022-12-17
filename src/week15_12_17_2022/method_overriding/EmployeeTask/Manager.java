package week15_12_17_2022.method_overriding.EmployeeTask;

public class Manager extends Employee{

    @Override
    public int salary() {
        return super.salary() + 20000; //parent base salary
    }
}
