package Java_Core_Classes.day13_String.PracticeTasks;

import java.util.Scanner;

public class SameCharCheck {

    public static void main(String[] args) {
        Scanner scan  =new Scanner(System.in);

        System.out.println("Enter a word: ");
        String s = scan.next();

        if (s.charAt(0) == s.charAt(s.length()-1))
            System.out.println("First character and last character are same.");
        else System.out.println("First character and last character are not same.");

        scan.close();
    }
}
