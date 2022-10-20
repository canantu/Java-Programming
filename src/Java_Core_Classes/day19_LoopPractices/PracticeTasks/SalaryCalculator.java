package Java_Core_Classes.day19_LoopPractices.PracticeTasks;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        while(true){

            System.out.println("How much you make an hour?");
            double hourlyRate = scan.nextDouble();


            if (hourlyRate <= 0) {
                System.out.println("Invalid Entry for the hourly rate");
                System.exit(0);
            }

            System.out.println("How many hours do you work per week?");
            int hours = scan.nextInt();

            if (hours <= 0 || hours > 144) {
                System.out.println("Invalid Entry for the hours per week");
                System.exit(0);
            }

            System.out.println("Enter your state tax rate");
            double taxRate = scan.nextDouble();

            if (taxRate <= 0 || taxRate > 0.1) {
                System.out.println("Invalid Entry for the tax rate");
                System.exit(0);
            }


            double grossSalary = 4 * hours * hourlyRate;
            System.out.println("Gross salary: " + grossSalary );
            System.out.println("Federal tax: " + 0.26 * grossSalary );
            System.out.println("State tax: "+ taxRate * grossSalary);
            System.out.println("Total tax: " + (0.26 + taxRate) * grossSalary );
            System.out.println("Net income: " + (grossSalary - (0.26 + taxRate) * grossSalary ));


            System.out.println("Would you like to continue?");
            String answer = scan.next();

            if(!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"))){
                System.out.println("Invalid entry");
                System.exit(0);

            }
            if (answer.equalsIgnoreCase("no")){
                System.out.println("Thank you for using Cydeo Salary Calculator APP");
                break;
            }


        }
        scan.close();


    }
}
