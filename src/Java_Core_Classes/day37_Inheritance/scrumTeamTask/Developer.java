package Java_Core_Classes.day37_Inheritance.scrumTeamTask;

public class Developer extends Employee{

    public String language;

    public Developer(String name, int age, char gender, int id, double salary, String language) {
        super(name, age, gender, id, "Developer", salary);
        this.language = language;
    }

    public void code(){
        System.out.println(name + " is coding with " + language);
    }

    public String toString() {
        return "Developer{" +
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
