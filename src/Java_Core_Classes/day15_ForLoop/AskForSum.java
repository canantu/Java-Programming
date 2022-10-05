package Java_Core_Classes.day15_ForLoop;

import java.util.Scanner;

public class AskForSum {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int sum = 0;

        for (int i = 0; i < 5; i++) {

            System.out.println("Enter a number: ");
            sum += scan.nextInt();
        }

        System.out.println("sum = " + sum);

        scan.close();
    }
}
