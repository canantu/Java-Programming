package Java_Core_Classes.day17_While_DoWhile;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first number: ");
        int num1 = scan.nextInt();

        System.out.println("Enter your second number: ");
        int num2 = scan.nextInt();

        System.out.println("Enter an operator: ");
        char op = scan.next().charAt(0);

        while( !(op == '+' || op == '-')){ // if the operator is invalid
            System.out.println("Invalid operator, please re-enter!");
            op = scan.next().charAt(0);
        }

        System.out.println(op == '+'? num1+num2: num1-num2 );

        // +, #, *, /

        scan.close();


    }
}
