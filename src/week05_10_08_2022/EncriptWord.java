package week05_10_08_2022;

import java.util.Scanner;

public class EncriptWord {

    public static void main(String[] args) {
        System.out.println("Enter a word: ");
        String word = new Scanner(System.in).next();
        /*
        for (int i = 0; i < word.length(); i++) {
            System.out.print(word.charAt(i) + "x");
        }*/
        char encryptWith = 'x';
        String encryptedWord = "";
        for (int i = 0; i < word.length(); i++) {
            encryptedWord += word.charAt(i) + encryptWith;
        }
        System.out.println(encryptedWord);
    }
}
