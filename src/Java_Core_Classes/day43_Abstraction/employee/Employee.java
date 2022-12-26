package Java_Core_Classes.day43_Abstraction.employee;

public abstract class Employee extends Person{

    private final String id;
    private String jobTitle;
    private double salary;

    public Employee(String name, char gender, int age, String id, String jobTitle, double salary) {
        super(name, gender, age);
        this.id = id;
        setJobTitle(jobTitle);
        setSalary(salary);
    }

    public String getId() {
        return id;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public abstract void work();

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + getName() + '\'' +
                ", gender='" + getGender() + '\'' +
                ", age=" + getAge() +
                ", id='" + id + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
