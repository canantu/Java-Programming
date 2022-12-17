package week15_12_17_2022.method_overriding.EmployeeTask;

public class Clerk extends Employee{

    @Override
    public int salary() {
        return super.salary() + 10000;
    }
}
