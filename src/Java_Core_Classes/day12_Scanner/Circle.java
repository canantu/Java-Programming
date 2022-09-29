package Java_Core_Classes.day12_Scanner;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the radius of circle: ");
        double radius = input.nextDouble();
        double area = Math.PI * Math.pow(radius,2) ;
        double perimeter = 2 * Math.PI * radius;

        System.out.println("Area of the circle is " + area);
        System.out.println("Perimeter of the circle is " + perimeter);



    }


}
