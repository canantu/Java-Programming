package Java_Core_Classes.day17_While_DoWhile;

import java.util.Scanner;

public class EligibleToVote {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your age: ");
        int age = scan.nextInt();

        while (!(age >= 1 && age <= 120)){
            System.out.println("Invalid age, please re-enter: ");
            System.out.println("Enter your age: ");
            age = scan.nextInt();
        }

        System.out.println("Are you a US citizen? yes/or");
        String answer = scan.next();
        while (!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"))){
            System.out.println("Invalid answer, please re-enter:");
            System.out.println("Are you a US citizen? yes/no");
            answer = scan.next();
        }

        System.out.println((age>=18 && answer.equals("yes"))? "You are eligible": "You are not eligible");

        scan.close();


    }
}
