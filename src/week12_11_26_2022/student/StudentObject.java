package week12_11_26_2022.student;

import java.util.Scanner;

public class StudentObject {
    public static void main(String[] args) {

        String name = "Adam";
        Student student1 = new Student(name);

        System.out.println(student1);

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter " + name + "'s age");
        int age = scan.nextInt();
        student1.age = age;
        System.out.println("Enter " + name + "'s batch number");
        int batchNumber = scan.nextInt();
        student1.batchNumber = batchNumber;

        System.out.println(student1);

    }
}
