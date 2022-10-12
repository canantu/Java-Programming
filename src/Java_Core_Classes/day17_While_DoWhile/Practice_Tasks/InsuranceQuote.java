package Java_Core_Classes.day17_While_DoWhile.Practice_Tasks;

import java.util.Scanner;

public class InsuranceQuote {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scan.nextLine();
        double cost = 0;
        double discount = 0;
        double charge = 0;

        System.out.println("Enter your gender: (male / female)");
        String gender = scan.next();

        while (!(gender.equalsIgnoreCase("male") || gender.equalsIgnoreCase("female"))){

            System.out.println("Invalid gender! Enter a valid gender: (male / female)");
            gender = scan.next();
        }

        System.out.println("Are you married? (yes / no)");
        String maritalStatus = scan.next();

        while (!(maritalStatus.equalsIgnoreCase("yes") || maritalStatus.equalsIgnoreCase("no"))){

            System.out.println("Invalid marital status! Are you married?: (yes / no)");
            maritalStatus = scan.next();
        }

        System.out.println("Enter you age (1-120)");
        int age = scan.nextInt();

        while (!(age > 0 || age <= 120)){

            System.out.println("Invalid age! Enter your age: (1-120)");
            age = scan.nextInt();
        }

        System.out.println("How many miles do you drive in a day? (>=5)");
        int mileage = scan.nextInt();

        while (!(mileage >= 5)){

            System.out.println("Invalid mile! How many miles do you drive in a day? (>=5)");
            mileage = scan.nextInt();
        }
        scan.nextLine();
        System.out.println("Which one do you want? (full coverage or liability insurance)");
        String insuranceType = scan.nextLine().toLowerCase();

        System.out.println("Did you have any accidents or claims in the last 5 year? (yes / no)");
        String accident = scan.next();

        while (!(accident.equalsIgnoreCase("yes") || accident.equalsIgnoreCase("no"))){

            System.out.println("Invalid answer! Did you have any accidents or claims in the last 5 year? (yes / no)");
            accident = scan.next();
        }

        System.out.println("Does your car have an anti-theft device? (yes / no)");
        String antiTheft = scan.next();

        while (!(antiTheft.equalsIgnoreCase("yes") || antiTheft.equalsIgnoreCase("no"))){

            System.out.println("Invalid answer! Does your car have an anti-theft device? (yes / no)");
            antiTheft = scan.next();
        }

        switch (insuranceType){

            case "full coverage":
                if(age < 25){
                    cost += 90;

                }else cost += 50;

                if (mileage <= 10){
                    cost += 10;
                } else if (mileage > 10 && mileage <= 50) {
                    cost += 30;
                }else cost += 50;

                break;
            case "liability insurance":
                if(age < 25){
                    cost += 160;

                }else cost += 120;

                if (mileage <= 10){
                    cost += 20;
                } else if (mileage > 10 && mileage <= 50) {
                    cost += 50;
                }else cost += 70;

                break;
        }

        if(antiTheft.equalsIgnoreCase("yes")){
            discount += 0.05;
        }

        if(accident.equalsIgnoreCase("yes")){
            charge += 0.15;
        }else {
            discount += 0.10;
        }

        if (maritalStatus.equalsIgnoreCase("yes")){

            discount += 0.05;
        }

        cost = cost + cost * (charge - discount);

        System.out.println(name + ", you have selected " + insuranceType);
        System.out.println("Total cost of your insurance is " + cost);

        scan.close();










    }
}
