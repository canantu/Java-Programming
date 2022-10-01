package week04_10_01_2022;

import java.util.Scanner;

public class BloodDonate2 {

    public static void main(String[] args) {

        String result = "";
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = scan.nextInt();

        if (age >= 18){

            System.out.println("Enter your weight: ");
            int weight = scan.nextInt();

            if (weight > 50)
                result = "You are eligible to donate blood.";
            else result = "You are not eligible to donate blood.";

        }else result = "Age must be greater than 18!";

        System.out.println(result);






    }
}
