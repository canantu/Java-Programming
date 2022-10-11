package Java_Core_Classes.day16_ForLoopStringPractice.PracticeTasks;
import java.util.*;

public class Replit_Insurance {


    public static void main(String[] args) {
        //DO NOT TOUCH FOLLOWING LINE/LINES
        System.out.println("Welcome to the Cydeo car insurance!");

        //WRITE YOUR CODE BELOW

        Scanner scan = new Scanner(System.in);
        double premiumCost = 0;
        System.out.println("Enter your full name");
        String fullName = scan.nextLine().toLowerCase();

        System.out.println("Do you have a US driver license?");
        String haveLicence = scan.next().toLowerCase();

        if(haveLicence.equals("no")){
            System.out.println("You must have a license to get insurance!");
            System.exit(0);
        }
        System.out.println("Enter your zip code");
        int zipCode = scan.nextInt();

        if(zipCode == 20910 || zipCode == 20740)
            premiumCost += 60;
        else if(zipCode == 22102 || zipCode == 22103)
            premiumCost += 30;
        else
            premiumCost += 50;

        System.out.println("Is this vehicle owned, financed, or leased?");
        String status = scan.next().toLowerCase();

        switch(status){

            case "owned":
                premiumCost += 10;
                break;
            case "financed":
                premiumCost += 15;
                break;
            case "leased":
                premiumCost += 20;
                break;
            default:
                System.out.println("Invalid status!");
        }

        System.out.println("How is this vehicle primarily used?");
        String usage = scan.next().toLowerCase();
        switch(usage){

            case "business":
                premiumCost += 50;
                break;
            case "pleasure":
                premiumCost += 10;
                break;
            case "commuting":
                premiumCost += 20;
                System.out.println("How many days do you commute?");
                int days = scan.nextInt();
                premiumCost += days*5;
                break;
            default:
                System.out.println("Invalid status!");
        }

        System.out.println("How old are you?");
        int age = scan.nextInt();

        if(age<16){
            System.out.println("You can't be driving");
            System.exit(0);
        }
        else if(age>=16 && age <20)
            premiumCost *= 10;
        else if(age>=20 && age <25)
            premiumCost *= 6;
        else
            premiumCost *= 2;

        System.out.println("Have you had any accidents in the last 5 years?");
        String accident = scan.next().toLowerCase();

        if(accident.equals("yes")){
            System.out.println("How many?");
            int numAccident = scan.nextInt();
            premiumCost += numAccident * 10;
        }
        scan.nextLine();
        System.out.println("What is the highest level of education you have completed?");
        String educationLevel = scan.nextLine().toLowerCase();

        switch(educationLevel){
            case "bachelors": case "masters":
                premiumCost -= premiumCost*0.05;
                break;
            case "phd":
                premiumCost -= premiumCost*0.1;
                break;
            case "high school":
                premiumCost -= premiumCost*0.05;
                break;
        }
        int nameLen = fullName.length();
        String referenceNumber = ("" + fullName.toUpperCase().charAt(0) + fullName.toUpperCase().charAt(fullName.indexOf(" ")+1) + age + fullName.substring(nameLen-3, nameLen).toUpperCase() + zipCode + educationLevel.toUpperCase()).replace(" ", "");

        String firstName = fullName.substring(0, fullName.indexOf(" "));
        firstName = firstName.substring(0,1).toUpperCase() + firstName.substring(1);
        String lastName = fullName.substring(fullName.indexOf(" ") + 1);
        lastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1);
        System.out.println(firstName + " " + lastName + ", here's your quote!");
        System.out.println("This is your start premium cost: $" + premiumCost);
        System.out.println("This is your reference number: " + referenceNumber);

        scan.close();









    }
}
