package Java_Core_Classes.day42_Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowKeyword {
    public static void main(String[] args) {

        System.out.println("Enter your age:");
        int age = new Scanner(System.in).nextInt();
        if (age < 0){

            throw new InputMismatchException("Age can not be negative: " + age);
            // using throw keyword, create an exception

            // System.err.println("Invalid age: " + age);
           // System.exit(1);  instead of using exit(), it is better to throw an exception

        }
        if (age > 21){
            System.out.println("You are eligible");
        }else {
            throw new RuntimeException("You must be at least 21 years old!");
        }


    }
}
