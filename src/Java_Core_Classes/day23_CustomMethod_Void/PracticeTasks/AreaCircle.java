package Java_Core_Classes.day23_CustomMethod_Void.PracticeTasks;

import java.util.Scanner;

public class AreaCircle {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the radius of the circle?");
        double radius = scan.nextDouble();
        calculateAreaOfCircle(radius);
        scan.close();
    }

    public static void calculateAreaOfCircle(double radius){
        double area = radius * radius * 3.14;
        System.out.println("area = " + area);
    }
}
