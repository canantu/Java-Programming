package Java_Core_Classes.day15_ForLoop.Practice_Tasks;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {

        System.out.println("Enter a word: ");
        String word= new Scanner(System.in).next();
        int count = 0;
        word = word.toLowerCase();

        for (int i = 0; i < word.length()/2; i++) {
            if (word.charAt(i) != word.charAt(word.length()-i-1)){
                count += 1;
            }
        }

        if(count == 0)
            System.out.println("palindrome");
        else System.out.println("not palindrome");


    }
}
