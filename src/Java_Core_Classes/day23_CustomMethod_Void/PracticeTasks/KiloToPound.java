package Java_Core_Classes.day23_CustomMethod_Void.PracticeTasks;

import java.util.Scanner;

public class KiloToPound {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter kilogram");
        double kilo = scan.nextDouble();
        convertKgToLbs(kilo);
        scan.close();

    }

    public static void convertKgToLbs(double kilo){

        double lbs = kilo * 2.2;
        System.out.println(kilo + " kilogram is equal to " + lbs + " lbs" );
    }
}
