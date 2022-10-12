package Java_Core_Classes.day17_While_DoWhile.Practice_Tasks;

import java.util.Scanner;

public class RoomReservation {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Do you want to reserve a room? (yes / no): ");
        String answer = scan.nextLine();
        String roomType = "";
        double cost = 0;

        while(!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"))){

            System.out.println("Enter a valid answer! Do you want to reserve a room? (yes / no): ");
            answer = scan.nextLine();
        }

        if(answer.equalsIgnoreCase("yes")){
            System.out.println("Which room do you want to reserve?");
            roomType = scan.nextLine().toLowerCase();

            while (!(roomType.equalsIgnoreCase("king bed") || roomType.equalsIgnoreCase("queen bed") || roomType.equalsIgnoreCase("single bed"))){

                System.out.println("Invalid entry! Enter a valid room type (king bed, queen bed, single bed): ");
                roomType = scan.nextLine().toLowerCase();
            }

            switch (roomType){

                case "king bed":
                    cost = 120;
                    break;
                case "queen bed":
                    cost = 100;
                    break;
                default:
                    cost = 80;
            }

            System.out.println("You reserved " + roomType + "\nTotal cost is " + cost);
        }else {
            System.out.println("Have a nice day!");

        }



        scan.close();

    }
}
