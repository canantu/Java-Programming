package Java_Core_Classes.day18_Nested_Loop;

import java.util.Scanner;

public class OddEven {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while(true){
            System.out.println("Enter a number");
            int num = scan.nextInt();

            if (num % 2 == 0)
                System.out.println("Even number");
            else System.out.println("Odd number");

            System.out.println("Would you like to continue?");
            String answer = scan.next();

            while (!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"))) {
                System.err.println("Invalid answer, please re-try!");
                answer = scan.next();
            }

            if (answer.equalsIgnoreCase("no")) {
                System.out.println("Goodbye!");
                break;
            }
        }

        scan.close();








    }
}
