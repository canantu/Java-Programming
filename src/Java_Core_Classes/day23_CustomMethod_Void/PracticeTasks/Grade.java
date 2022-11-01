package Java_Core_Classes.day23_CustomMethod_Void.PracticeTasks;

import java.util.Scanner;

public class Grade {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your score?");
        int score = scan.nextInt();
        calculateGrade(score);
    }

    public static void calculateGrade(int score){
        String grade = "";
        if (score >= 90)
            grade = "A";
        else if (score >= 80)
            grade = "B";
        else if (score >= 70)
            grade = "C";
        else if (score >= 60)
            grade = "D";
        else grade = "F";

        System.out.println(grade);

    }
}
