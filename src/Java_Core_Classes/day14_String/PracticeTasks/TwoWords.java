package Java_Core_Classes.day14_String.PracticeTasks;

import java.util.Scanner;

public class TwoWords {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first word: ");
        String word1 = scan.next();

        System.out.println("Enter second word: ");
        String word2 = scan.next();
        int len1 = word1.length();

        if (word1.charAt(len1-1) == word2.charAt(0))

            System.out.println(word1.substring(0,len1-1) + word2);
        else System.out.println(word1+word2);

        scan.close();
    }
}
