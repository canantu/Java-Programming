package week05_10_08_2022;

import java.util.Scanner;

public class StringMethods2 {

    public static void main(String[] args) {

        System.out.println("Enter a word: ");
        String word = new Scanner(System.in).next();
        System.out.println(word.substring(0,2).toUpperCase());

    }
}
