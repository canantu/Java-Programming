package Java_Core_Classes.day23_CustomMethod_Void.PracticeTasks;

import java.util.Scanner;

public class EligibleVote {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age?");
        int age = scan.nextInt();
        System.out.println("Enter your nationality?");
        String country = scan.next();
        checkEligibilityVote(age, country);
    }

    public static void checkEligibilityVote(int age, String country){
        if (age >= 18 && country.equals("USA"))
            System.out.println("You can vote");
        else System.out.println("You can not vote");
    }
}
