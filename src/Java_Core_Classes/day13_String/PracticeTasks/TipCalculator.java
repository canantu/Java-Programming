package Java_Core_Classes.day13_String.PracticeTasks;

import java.util.Scanner;

public class TipCalculator {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Split or No split (Yes or No)?");
        String split = scan.next().toLowerCase();

        System.out.println("Enter the number of people:");
        int num = scan.nextInt();

        System.out.println("Enter the check amount:");
        int amount = scan.nextInt();

        System.out.println("How was the service quality? \n" +
                "(Excellent/Great/Good/Fair/Poor)");
        String quality = scan.next().toLowerCase();


        /*double taxRate = (quality.equals("excellent")? 0.25 : (quality.equals("great")? 0.2 :
                (quality.equals("good")? 0.15 : (quality.equals("fair")? 0.10 :
                        (quality.equals("poor")? 0.5;
       */
        double totalTip = 0;
        //Poor = 5%, Fair = 10%, Good = 15%, Great = 20%, Excellent = 25%
        switch (quality){
            case "poor":
                totalTip = amount * 0.05;
                break;
            case "fair":
                totalTip = amount * 0.1;
                break;
            case "good":
                totalTip = amount * 0.15;
                break;
            case "great":
                totalTip = amount * 0.2;
                break;
            case "excellent":
                totalTip = amount * 0.25;
        }

        if (split.equals("no")){
            System.out.println("Number of people entered: " + num);
            System.out.println("Total to pay: " + (amount + totalTip));
            System.out.println("Total tip: " + totalTip);
        } else if (split.equals("yes")) {
            System.out.println("Number of people entered: " + num);
            System.out.println("Total to pay: " + (amount + totalTip));
            System.out.println("Total tip: " + totalTip);
            System.out.println("Total per person: " + (amount + totalTip)/num);
            System.out.println("Tip per person: " + totalTip/num);
        }

        scan.close();

    }
}
