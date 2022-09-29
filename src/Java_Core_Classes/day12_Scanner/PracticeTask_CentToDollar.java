package Java_Core_Classes.day12_Scanner;

import java.util.Scanner;

public class PracticeTask_CentToDollar {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int cents = 0;
        int dollars = 0;
        int remainder = 0;

        System.out.println("Enter cents:");
        cents = scan.nextInt();
        dollars = cents / 100;
        remainder = cents % 100;

        System.out.println(cents + " cents equal to: " + dollars + " dollars and " + remainder + " cents");

        scan.close();


    }
}
