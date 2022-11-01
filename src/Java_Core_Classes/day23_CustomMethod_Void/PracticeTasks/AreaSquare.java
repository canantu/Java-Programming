package Java_Core_Classes.day23_CustomMethod_Void.PracticeTasks;

import java.util.Scanner;

public class AreaSquare {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the side of the square?");
        double side = scan.nextDouble();
        calculateAreaOfSquare(side);
        scan.close();

    }

    public static void calculateAreaOfSquare(double side){

        double area = side * side;
        System.out.println("area = " + area);
    }
}
