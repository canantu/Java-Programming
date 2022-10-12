package Java_Core_Classes.day17_While_DoWhile.Practice_Tasks;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num = 0;
        int result = 0;

        while(num >= 0){

            result += num;
            System.out.println("Enter a number: ");
            num = scan.nextInt();

        }

        System.out.println("result = " + result);

        scan.close();






    }



}
