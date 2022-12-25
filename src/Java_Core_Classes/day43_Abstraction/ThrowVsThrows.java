package Java_Core_Classes.day43_Abstraction;

import Java_Core_Classes.day31_Constructors.PracticeTasks.SalaryCalculator;

import java.util.Scanner;

public class ThrowVsThrows {

    public static void main(String[] args) {


        System.out.println("Enter your score: ");
        int score = new Scanner(System.in).nextInt();

        if (score < 0 || score > 100){
            throw new RuntimeException("Invalid score: " + score);
        }

        if (score >= 90)
            System.out.println("A");
        else if (score >= 80)
            System.out.println("B");
        else if (score >= 70)
            System.out.println("C");
        else if (score >= 60)
            System.out.println("D");
        else System.out.println("F");

        method1();




    }

    public static void method1(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
