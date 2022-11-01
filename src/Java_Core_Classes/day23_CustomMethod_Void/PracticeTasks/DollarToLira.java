package Java_Core_Classes.day23_CustomMethod_Void.PracticeTasks;

import java.util.Scanner;

public class DollarToLira {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter dollar amount");
        double dollar = scan.nextDouble();
        convertDollarToLira(dollar);
        scan.close();
    }
    public static void convertDollarToLira(double dollar){

        double lira = dollar * 18;
        System.out.println("$" + dollar + " is equal to " + lira + " lira" );
    }
}
