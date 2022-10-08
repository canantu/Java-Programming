package week05_10_08_2022;

import java.util.Scanner;

public class ColorWords {

    public static void main(String[] args) {
        System.out.println("Enter a word: ");
        String word = new Scanner(System.in).next();
        if(word.startsWith("red"))
            System.out.println("red");
        else if(word.startsWith("blue"))
            System.out.println("blue");
        else System.out.println(word);





    }
}
