package Java_Core_Classes.day19_LoopPractices.PracticeTasks;

import java.util.Scanner;

public class AreaRectangle {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        while(true){

            System.out.println("Enter the length of the Rectangle:");
            double length = scan.nextDouble();

            if (length <= 0) {
                System.out.println("Invalid Entry for the length of the rectangle");
                System.exit(0);
            }

            System.out.println("Enter the width of the Rectangle:");
            double width = scan.nextDouble();

            if (width <= 0) {
                System.out.println("Invalid Entry for the width of the rectangle");
                System.exit(0);
            }

            System.out.println("Perimeter is " + 2 * (length + width));
            System.out.println("Area is " + (length * width));

            System.out.println("Would you like to calculate another Rectangle?");
            String answer = scan.next();

            while(!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"))){
                System.out.println("Invalid entry, please re-enter:");
                answer = scan.next();

            }

            if (answer.equalsIgnoreCase("no")){
                System.out.println("Thank you for using Cydeo Rectangle Calculator APP");
                break;
            }


        }
        scan.close();
    }
}
