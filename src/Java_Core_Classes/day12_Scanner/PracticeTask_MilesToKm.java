package Java_Core_Classes.day12_Scanner;

import java.util.Scanner;

public class PracticeTask_MilesToKm {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double miles = 0;
        double km = 0;

        System.out.println("Enter miles:");
        miles = scan.nextDouble();
        km = 1.609 * miles;

        System.out.println(miles + " miles equal to "+ km  + " kilometers");

        scan.close();

    }
}
