package week11_11_19_2022.warmUp;

import java.time.LocalDate;
import java.util.Date;

public class Student {

    public String name;
    public int age, studentID;
    public LocalDate dateOfBirth;
    public char gender, grade;

    public Student(String name, char gender, char grade, LocalDate dateOfBirth, int studentID) {
        this.name = name;
        this.gender = gender;
        this.grade = grade;
        this.age = LocalDate.now().getYear()-dateOfBirth.getYear();  //we don't need to add age variable into argument
        this.dateOfBirth = dateOfBirth;
        this.studentID = studentID;

    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", studentID=" + studentID +
                ", dateOfBirth=" + dateOfBirth +
                ", gender=" + gender +
                ", grade=" + grade +
                '}';
    }



}
