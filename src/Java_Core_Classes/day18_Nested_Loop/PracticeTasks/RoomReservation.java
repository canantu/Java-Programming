package Java_Core_Classes.day18_Nested_Loop.PracticeTasks;

import java.util.Scanner;

public class RoomReservation {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double totalCost = 0;


        while (true){

            System.out.println("Which bedroom do you want to reserve? (King Bed, Queen Bed, Single Bed)");
            String bedroom = scan.nextLine().toLowerCase();

            System.out.println("How many nights do you want to stay?");
            int days= scan.nextInt();

            switch (bedroom){
                case "king bed":
                    totalCost += 120 * days;
                    break;
                case "queen bed":
                    totalCost += 100 * days;
                    break;
                case "single bed":
                    totalCost += 80 * days;
                    break;
            }

            System.out.println("Would you like to reserve another room?");
            String answer = scan.next();
            scan.nextLine();

            while (!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"))){
                System.out.println("Invalid entry, please re-try?");
                answer = scan.next();
                scan.nextLine();
            }


            if (answer.equalsIgnoreCase("no")){
                System.out.println("Total cost is " + totalCost);
                break;
            }

        }



    }
}
