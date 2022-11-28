package Java_Core_Classes.day35_Encapsulation.Encapsulation;

public class Employee {

    private String name;
    private int age;
    private char gender;
    private double salary;

    public void setName(String name){
        if (name.isEmpty()){
            return;  // if err message is sent, the program should exit. return exits the method
            //and remaining statements are not executed
        }
        this.name = name;
    }

    public void setGender(char gender){
        if (!(gender == 'M' || gender == 'F')){
            System.err.println("Invalid gender: " + gender);
            System.exit(0);
        }
        this.gender = gender;
    }

    public void setAge(int age){
        if (age <= 16|| age > 90){
            return;
        }
        this.age = age;
    }

    public void setSalary(double salary){
        if (salary <= 0){
            System.err.println("invalid salary: " + salary);
            System.exit(0);
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


}
