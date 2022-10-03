package Java_Core_Classes.day13_String.PracticeTasks;

import java.util.Scanner;

public class LongestString {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a sentence: ");
        String s1 = scan.nextLine();

        System.out.println("Enter a second sentence: ");
        String s2 = scan.nextLine();

        if (s1.length() > s2.length())
            System.out.println(s1);
        else System.out.println(s2);

        scan.close();
    }
}
