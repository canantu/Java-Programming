package Java_Core_Classes.day19_LoopPractices.PracticeTasks;

import java.util.Scanner;

public class AreaAndPerimeterOfSquare {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        while(true){

            System.out.println("Enter the side of the square:");
            double side = scan.nextDouble();

            if (side <= 0) {
                System.out.println("Invalid Entry for the side of the square");
                System.exit(0);
            }

            System.out.println("Perimeter is " + 4 * side);
            System.out.println("Area is " + side * side);

            System.out.println("Would you like to calculate another Square?");
            String answer = scan.next();

            while(!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"))){
                System.out.println("Invalid entry, please re-enter:");
                answer = scan.next();

            }

            if (answer.equalsIgnoreCase("no")){
                System.out.println("Thank you for using Cydeo Square Calculator APP");
                break;
            }


        }
        scan.close();



    }
}
