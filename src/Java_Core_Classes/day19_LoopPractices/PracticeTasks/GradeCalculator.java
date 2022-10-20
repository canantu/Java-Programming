package Java_Core_Classes.day19_LoopPractices.PracticeTasks;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        while(true){

            System.out.println("Enter your score:");
            int score = scan.nextInt();
            char grade;

            if (score <= 0) {
                System.out.println("Invalid Entry for the length of the rectangle");
                System.exit(0);
            }

            if(score<=100 && score >=90){
                grade = 'A';
            } else if (score<=89 && score >=80) {
                grade = 'B';
            }else if (score<=79 && score >=70) {
                grade = 'C';
            }else if (score<=69 && score >=60) {
                grade = 'D';
            }else grade = 'F';

            System.out.println("Your grade is " + grade);


            System.out.println("Would you like to continue?");
            String answer = scan.next();

            if(!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"))){
                System.out.println("Invalid entry");
                System.exit(0);

            }
            if (answer.equalsIgnoreCase("no")){
                System.out.println("Thank you for using Cydeo Grade Calculator APP");
                break;
            }


        }
        scan.close();
    }
}
