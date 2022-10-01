package week04_10_01_2022;

import java.util.Scanner;

public class CodilityTask {

    public static void main(String[] args) {

        int number = 6;
        String result = "";

        System.out.println("Enter a positive number: ");
        Scanner scan = new Scanner(System.in);
        number = scan.nextInt();

        if (number > 0){

            if (number % 2 ==0 || number % 3 == 0 || number %5 == 00) {

                if (number % 2 == 0)
                    result += "Codility";
                if (number % 3 == 0)
                    result += "Test";
                if (number % 5 == 0)
                    result += "Coders";
            }else result =  number +" is not divisible with 2, 3 or 5.";

            System.out.println(result);

        }else System.out.println("Invalid number!");

    }
}
