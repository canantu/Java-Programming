package Java_Core_Classes.day31_Constructors.ScrumTask;

public class Developer {

    public String name, jobTitle;
    public int employeeID;
    public double salary;

    public Developer(String name, String jobTitle, int employeeID, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.employeeID = employeeID;
        this.salary = salary;
    }

    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", employeeID=" + employeeID +
                ", salary= $" + salary +
                '}';
    }

    public void coding(){
        System.out.println(name + " is coding");
    }

    public void unitTesting(){
        System.out.println(name + " is unit testing");
    }

    public void fixingBug(){
        System.out.println(name + " is fixing bug");
    }

}
