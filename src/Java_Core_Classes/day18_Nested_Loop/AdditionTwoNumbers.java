package Java_Core_Classes.day18_Nested_Loop;

import java.util.Scanner;

public class AdditionTwoNumbers {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while(true){
            System.out.println("Enter first number: ");
            int num1 = scan.nextInt();
            System.out.println("Enter second number: ");
            int num2 = scan.nextInt();
            System.out.println("Addition " + (num1 + num2));
            System.out.println("Do you want to continue?");
            String answer = scan.next();

            while (!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"))){
                System.err.println("Invalid Entry, please re-try!");
                answer = scan.next();
            }

            if (answer.equalsIgnoreCase("no"))
                System.out.println("Goodbye!");
                break;  //without break statement, while(true) runs infinite times
        }
        scan.close();


    }
}
