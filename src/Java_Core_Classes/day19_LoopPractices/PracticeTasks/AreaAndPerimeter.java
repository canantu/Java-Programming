package Java_Core_Classes.day19_LoopPractices.PracticeTasks;

import java.util.Scanner;

public class AreaAndPerimeter {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (true){


            System.out.println("Enter the radius:");
            double radius = scan.nextDouble();

            if (radius <= 0){
                System.out.println("Invalid Entry for the radius of the circle");
                System.exit(0);
            }
            System.out.println("Diameter is " + 2 * radius);
            System.out.println("Area is " + 3.14 * radius * radius);
            System.out.println("Perimeter is " + 2 * 3.14 * radius);

            System.out.println("Do you want to continue?");
            String answer = scan.next();

            while(!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"))){
                System.out.println("Invalid entry, please retry!");
                answer = scan.next();
            }
            if (answer.equalsIgnoreCase("no")){
                System.out.println("Thank you for using Cydeo Circle Calculator APP");
                break;
            }


        }







    }
}
