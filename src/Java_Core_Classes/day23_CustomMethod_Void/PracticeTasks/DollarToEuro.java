package Java_Core_Classes.day23_CustomMethod_Void.PracticeTasks;

import java.util.Scanner;

public class DollarToEuro {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter dollar amount");
        double dollar = scan.nextDouble();
        convertDollarToEuro(dollar);
        scan.close();
    }

    public static void convertDollarToEuro(double dollar){

        double euro = dollar * 1.12;
        System.out.println("$" + dollar + " is equal to €" + euro );
    }
}
