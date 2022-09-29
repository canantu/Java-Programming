package Java_Core_Classes.day12_Scanner;

import java.util.Scanner;

public class ScannerPractice4_NextMethod {

    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);

        System.out.println("Enter your input : ");
        String name = input.next();
        System.out.println("You've entered \"" + name + "\"");
    }
}
