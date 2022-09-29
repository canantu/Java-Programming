package Java_Core_Classes.day12_Scanner;

import java.util.Scanner;

public class ScannerPractice2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter true/false: ");

        boolean answer = input.nextBoolean();

        System.out.println("You've entered " + answer);
    }
}
