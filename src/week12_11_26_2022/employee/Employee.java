package week12_11_26_2022.employee;

public class Employee {

    public String name;
    public int id;
    public char gender;

    public Employee(String name) {
        this.name = name;
    }

    public Employee(String name, int id) {
        this(name);
        this.id = id;
    }

    public Employee(String name, int id, char gender) {
        this(name, id);
        this.gender = gender;
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", gender=" + gender +
                '}';
    }



}
