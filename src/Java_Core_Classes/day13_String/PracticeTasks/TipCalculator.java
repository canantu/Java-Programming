package Java_Core_Classes.day13_String.PracticeTasks;

import java.util.Scanner;

public class TipCalculator {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Split or No split (Yes or No)?");
        String split = scan.next();

        System.out.println("Enter the number of people:");
        int num = scan.nextInt();

        System.out.println("Enter the check amount:");
        int amount = scan.nextInt();

        System.out.println("How was the service quality? \n" +
                "(Excellent/Great/Good/Fair/Poor)");
        String quality = scan.next();

        double totalTip = 0;
        //Poor = 5%, Fair = 10%, Good = 15%, Great = 20%, Excellent = 25%
        switch (quality){
            case "Poor":
                totalTip = amount * 0.05;
                break;
            case "Fair":
                totalTip = amount * 0.1;
                break;
            case "Good":
                totalTip = amount * 0.15;
                break;
            case "Great":
                totalTip = amount * 0.2;
                break;
            case "Excellent":
                totalTip = amount * 0.25;
        }

        if (split.equals("No")){
            System.out.println("Number of people entered: " + num);
            System.out.println("Total to pay: " + (amount + totalTip));
            System.out.println("Total tip: " + totalTip);
        } else if (split.equals("Yes")) {
            System.out.println("Number of people entered: " + num);
            System.out.println("Total to pay: " + (amount + totalTip));
            System.out.println("Total tip: " + totalTip);
            System.out.println("Total per person: " + (amount + totalTip)/num);
            System.out.println("Tip per person: " + totalTip/num);
        }

        scan.close();

    }
}
