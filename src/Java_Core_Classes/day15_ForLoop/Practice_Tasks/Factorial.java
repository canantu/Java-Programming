package Java_Core_Classes.day15_ForLoop.Practice_Tasks;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        System.out.println("Enter a number");
        int n = new Scanner(System.in).nextInt();
        int fact = 1;
        for (int i = n; i>=1; i--)
            fact *= i;

        System.out.println("fact = " + fact);

    }
}
