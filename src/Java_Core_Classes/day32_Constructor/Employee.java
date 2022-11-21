package Java_Core_Classes.day32_Constructor;

public class Employee {

    public String name;
    public char gender;
    public String jobTitle;
    public double salary;

    public Employee(String name) {
        this.name = name;
    }

    public Employee(String name, char gender) {
        this(name);  //constructor call is special, not by its name, by "this" keyword
        //this.name = name;
        this.gender = gender;
    }
    //more constructor means to have more options to create a new object

    public Employee(String name, char gender, String jobTitle) {
        this(name, gender);
        this.jobTitle = jobTitle;
    }

    public Employee(String name, char gender, String jobTitle, double salary) {
        this(name, gender, jobTitle);  //not to rewrite the same code fragments
        this.salary = salary;
    }



    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
