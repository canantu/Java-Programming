package Java_Core_Classes.day14_String.PracticeTasks;

import java.util.Scanner;

public class WordSearch {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = scan.next();

        if (word.charAt(0)<='9' && word.charAt(0)>='0')
            System.out.println("first character is digit");
        else if (word.charAt(0)<='z' && word.charAt(0)>='a')
            System.out.println("first character is lowercase letter");
        else if (word.charAt(0)<='Z' && word.charAt(0)>='A')
            System.out.println("first character is uppercase letter");
        else
            System.out.println("first character is special letter");


        scan.close();
    }
}
