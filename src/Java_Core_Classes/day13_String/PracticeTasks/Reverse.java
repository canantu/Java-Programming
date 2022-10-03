package Java_Core_Classes.day13_String.PracticeTasks;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a 5-character word: ");
        String word = scan.nextLine();

        if (word.length() < 5)
            System.out.println("It is too short!");
        else if (word.length() > 5)
            System.out.println("It is too long");
        else
            System.out.println(""+word.charAt(4)+word.charAt(3)+word.charAt(2)+word.charAt(1)+word.charAt(0));

        scan.close();
    }
}
