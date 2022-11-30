package Java_Core_Classes.day37_Inheritance.scrumTeamTask;

public class Tester extends Employee{

    public String language;
    public Tester(String name, int age, char gender, int id, double salary, String language) {
        super(name, age, gender, id, "Tester", salary);
        this.language = language;
    }

    public void test(){
        System.out.println(name + " is testing with " + language + " programming language");
    }

    public String toString() {
        return "Tester{" +
                "language='" + language + '\'' +
                ", id=" + id +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
