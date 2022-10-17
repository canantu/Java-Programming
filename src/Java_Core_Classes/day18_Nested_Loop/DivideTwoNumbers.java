package Java_Core_Classes.day18_Nested_Loop;

import java.util.Scanner;

public class DivideTwoNumbers {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = scan.nextInt();
        System.out.println("Enter second number: ");
        int num2 = scan.nextInt();
        int max = 0;
        int min = 0;
        int count = 0;

        if(num1 > num2 ){
            max = num1;
            min = num2;}
        else {max = num2;
            min = num1;}

        while(max >= min){
            max -= min;
            count++;
        }

        System.out.println("division is " + count);
        System.out.println("remainder is " + max);


    }
}
