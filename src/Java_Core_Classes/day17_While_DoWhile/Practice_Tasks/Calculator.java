package Java_Core_Classes.day17_While_DoWhile.Practice_Tasks;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = scan.nextInt();
        System.out.println("Enter second number: ");
        int num2 = scan.nextInt();
        int result = 0;
        System.out.println("Enter a valid math operator (+, -, *, /): ");
        char op = scan.next().charAt(0);


        while (!(op == '+' || op == '-' || op == '*' || op == '/')){
            System.out.println("Invalid operator! Enter a valid math operator (+, -, *, /): ");
            op = scan.next().charAt(0);
        }

        switch (op){

            case '+' :
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            default:
                result = num1 / num2;

        }

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("op = " + op);
        System.out.println("result = " + result);



        scan.close();
    }
}
