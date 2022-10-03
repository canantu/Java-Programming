package Java_Core_Classes.day13_String.PracticeTasks;

import java.sql.SQLOutput;
import java.util.Scanner;

public class CheckWords {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first word: ");
        String s1 = scan.next();

        System.out.println("Enter second word: ");
        String s2 = scan.next();

        System.out.println("Enter third word: ");
        String s3 = scan.next();

        if (s1.length() == s2.length() && s2.length() == s3.length())
            System.out.println("All words are same length");
        else if (s1.length() == s2.length() && s2.length() != s3.length()
        || s1.length() == s3.length() && s2.length() != s3.length()
        || s2.length() == s3.length() && s1.length() != s3.length())
            System.out.println("Not Same nor Different lengths");
        else
            System.out.println("All different length");


        scan.close();
    }
}
