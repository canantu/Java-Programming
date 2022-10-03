package Java_Core_Classes.day13_String.PracticeTasks;

import java.util.Scanner;

public class calledTravel {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double baseTicketCost = 0;
        int discount = 0;
        double baseCostRenewal = 0;

        System.out.println("Do you have a valid passport (yes or no)");
        String passport = scan.next();
        scan.nextLine();

        if (passport.equals("yes")){

            baseTicketCost = 1000;
            System.out.println("Which country do you travel to: ");
            String countryName = scan.nextLine();

            System.out.println("How many bags will you  take with you: ");
            byte numberOfBags = scan.nextByte(); //Each bag will add 50

            System.out.println("How many people will you travel with: ");
            short numPeople = scan.nextShort();
            scan.nextLine();
            //For each person the cost is
            //reduced by 100. Up to a limit of 300.

            System.out.println("Enter the name of the people you will travel with in one line, " +
                    "separating each name with a comma: ");
            String peopleYouTravelWith = scan.nextLine();


            if (numPeople<=3)
                discount = 100 * numPeople;
            else  discount = 300;

            double costAmount = baseTicketCost + numberOfBags * 50 - discount;

            System.out.println("Your ticket is booked to " + countryName + ".\nWe have charged extra for the " +
                            numberOfBags + " bags \nbut you are traveling with " + peopleYouTravelWith +
                            " so we are giving a discount. \nYour total cost is $" + costAmount);




        }



        else if (passport.equals("no")) {

            baseCostRenewal = 200;

            System.out.println("When is your passport expired? ");
            int expirationYear = scan.nextInt(); //Each year 75 add to cost
            scan.nextLine();

            System.out.println("Which country do you travel to: ");
            String countryName = scan.nextLine();

            System.out.println("Will you be traveling in the next year: yes or no");
            String nextYearTravel = scan.next();

            if (nextYearTravel.equals("yes"))
                baseCostRenewal += 100;
            else if (nextYearTravel.equals("no")) {
                baseCostRenewal -= 50;
            }
            double totalCost = baseCostRenewal + (2022 - expirationYear) * 75;
            System.out.println("Looks like your password has been expired for " + (2022 - expirationYear) + " years,\nbut not to worry we will " +
                            "get it ready for you to travel to " + countryName + ".\nYour total cost has come out to $"
                    + totalCost + ".");


        }


    }
}
