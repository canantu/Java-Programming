package Java_Core_Classes.day18_Nested_Loop;

import java.util.Scanner;

public class NestedLoopPractice {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);



        while(true){

            System.out.println("Enter your age: ");
            int age = scan.nextInt();

            while (!(age >= 1 && age <= 120)){
                System.err.println("Invalid entry, please enter a valid age: ");
                age = scan.nextInt();
            }

            System.out.println("Would you like to continue? ");
            String answer = scan.next();

            while (!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"))){
                System.err.println("Invalid entry, please enter a valid answer: ");
                answer = scan.next();
            }

            if (answer.equalsIgnoreCase("no")){
                System.out.println("Goodbye!");
                break;
            }


        }








    }
}
