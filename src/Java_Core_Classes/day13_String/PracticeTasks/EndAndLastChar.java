package Java_Core_Classes.day13_String.PracticeTasks;

import java.util.Scanner;

public class EndAndLastChar {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a sentence: ");
        String s = scan.nextLine();

        System.out.println("First character is " + s.charAt(0)
                + "\nLast character is " + s.charAt(s.length()-1));

        scan.close();
    }
}
