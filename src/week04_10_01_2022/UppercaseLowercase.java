package week04_10_01_2022;

import java.util.Scanner;

public class UppercaseLowercase {
    public static void main(String[] args) {


        String result = "";
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a character: ");
        char ch = scan.next().charAt(0);
        boolean isUpperCase = (ch >= 'A' && ch <= 'Z');
        boolean isLowerCase = (ch >= 'a' && ch <= 'z');
        boolean isNotAlphabetic = !(isUpperCase || isLowerCase);

        if (isLowerCase)
            result = ch + " is a Lower Case character.";
        else if (isUpperCase)
            result = ch + " is an Upper Case character.";
        else
            result = ch + " is not an alphabetic character.";
        System.out.println(result);



    }
}
