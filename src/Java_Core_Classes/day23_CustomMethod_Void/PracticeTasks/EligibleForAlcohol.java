package Java_Core_Classes.day23_CustomMethod_Void.PracticeTasks;

import java.util.Scanner;

public class EligibleForAlcohol {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age?");
        int age = scan.nextInt();
        checkEligibilityAlcohol(age);
    }

    public static void checkEligibilityAlcohol(int age){
        if (age >= 23)
            System.out.println("You are eligible");
        else System.out.println("You're not eligible");
    }
}
