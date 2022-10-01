package week04_10_01_2022;

import java.util.Scanner;

public class BloodDonate {
    public static void main(String[] args) {

        String result = "";
        int age = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your age: ");
        if (scan.hasNextInt()){

            age = scan.nextInt();

            System.out.println("Please enter your weight: ");
            int weight = scan.nextInt();

            if (age >= 18 && weight > 50)
                result = "You are eligible to donate blood.";
            else if (age >= 18 && weight <= 50)
                result = "You are not eligible to donate blood.";
            else result = "Age must be greater than 18!";

        }
        else result = "Invalid age!!";

        System.out.println(result);
    }

}
