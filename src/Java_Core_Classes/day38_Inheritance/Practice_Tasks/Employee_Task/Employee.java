package Java_Core_Classes.day38_Inheritance.Practice_Tasks.Employee_Task;

public class Employee {

    public String name, jobTitle;
    public int age, id, salary;
    public char gender;
    public static String companyName = "Cydeo";



    public Employee(String name, String jobTitle, int age, int id, int salary, char gender) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.age = age;
        this.id = id;
        this.salary = salary;
        this.gender = gender;
    }

    public void work(){
        System.out.println(name + " is working");
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", age=" + age +
                ", id=" + id +
                ", salary=" + salary +
                ", gender=" + gender +
                '}';
    }
}
