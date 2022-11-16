package Java_Core_Classes.day30_CustomClass;

public class Employee {

    public String name;
    public int id;
    public String jobTitle;
    public double salary;
    public boolean isFullTime;

    public void setInfo(String name, int id, String jobTitle, double salary, boolean isFullTime) {
        this.name = name;
        this.id = id;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.isFullTime = isFullTime;
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", isFullTime=" + isFullTime +
                '}';
    }

    public void work(){
        System.out.println(name + " is working");
    }
}
