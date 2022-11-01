package Java_Core_Classes.day23_CustomMethod_Void.PracticeTasks;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integer");
        int num1 = scan.nextInt();
        System.out.println("Enter second integer");
        int num2 = scan.nextInt();
        System.out.println("Enter an operator");
        String operator = scan.next();

        calculate(num1, num2, operator);

        scan.close();
    }

    public static void calculate(int num1, int num2, String operator){

        double result = 0;
        switch (operator){

            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
        }

        System.out.println("result = " + result);

    }
}
