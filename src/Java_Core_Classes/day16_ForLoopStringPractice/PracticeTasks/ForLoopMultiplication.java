package Java_Core_Classes.day16_ForLoopStringPractice.PracticeTasks;

import java.util.Scanner;

public class ForLoopMultiplication {

    public static void main(String[] args) {

        System.out.println("Enter first number: ");
        int num1 = new Scanner(System.in).nextInt();

        System.out.println("Enter second number: ");
        int num2 = new Scanner(System.in).nextInt();
        int result = 0;

        if(num1 < 0 || num2 < 0){
            System.out.println("Invalid number!");
        }
        else {
            for (int i = 0; i < num1; i++)
                result += num2;
        }


        System.out.println("number1 * number2 is "  +result);


    }


}
