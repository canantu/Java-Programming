package Java_Core_Classes.day35_Encapsulation.Encapsulation;

public class Employee {

    private String name;
    private int age;
    private char gender;
    private double salary;

    public Employee(String name, int age, char gender, double salary) {
        setName(name);
        setAge(age);
        setGender(gender);
        setSalary(salary);
    }

    public void setName(String name){
        if (name.isEmpty() || name.isBlank()){
            return;  // if err message is sent, the program should exit. return exits the method
            //and remaining statements are not executed
        }
        this.name = name.trim().toUpperCase().charAt(0) + name.trim().substring(1).toLowerCase();
    }

    public void setGender(char gender){
        if (!(gender == 'M' || gender == 'F')){
            return;
        }
        this.gender = gender;
    }

    public void setAge(int age){
        if (age < 16|| age > 90){
            return;
        }
        this.age = age;
    }

    public void setSalary(double salary){
        if (salary <= 0){
            return;
        }
        this.salary = salary;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public char getGender() {
        return gender;
    }

    public double getSalary() {
        return salary;
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", salary=" + salary +
                '}';
    }
}
