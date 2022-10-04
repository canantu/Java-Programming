package Java_Core_Classes.day14_String.PracticeTasks;

import java.util.Scanner;

public class WordSearch {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = scan.next();

        if (word.charAt(0)<=57 && word.charAt(0)>=48)
            System.out.println("first character is digit");
        else if (word.charAt(0)<=122 && word.charAt(0)>=97)
            System.out.println("first character is lowercase letter");
        else if (word.charAt(0)<=90 && word.charAt(0)>=65)
            System.out.println("first character is uppercase letter");
        else
            System.out.println("first character is special letter");


        scan.close();
    }
}
