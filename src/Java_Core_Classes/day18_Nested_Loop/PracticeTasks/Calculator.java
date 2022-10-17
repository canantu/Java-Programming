package Java_Core_Classes.day18_Nested_Loop.PracticeTasks;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        while(true){
            System.out.println("Enter first number: ");
            int num1 = scan.nextInt();

            System.out.println("Enter a valid operator (+, -, *, /)");
            char op = scan.next().charAt(0);

            while (!(op == '+' || op == '-' || op == '*' || op == '/')) {
                System.out.println("Invalid operator, please re-enter!");
                op = scan.next().charAt(0);
            }

            System.out.println("Enter second number: ");
            int num2 = scan.nextInt();

            double result = 0;
            switch (op) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    result = num1 / num2;
                    break;
            }

            System.out.println("Calculation is " + result);

            System.out.println("Do you want to continue?");
            String answer = scan.next();

            while (!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"))) {
                System.out.println("Invalid entry, please re-try?");
                answer = scan.next();
                scan.nextLine();
            }
            if (answer.equalsIgnoreCase("no")) {
                System.out.println("Thank you for using Cydeo calculator!");
                break;
            }
        }
    }
}
