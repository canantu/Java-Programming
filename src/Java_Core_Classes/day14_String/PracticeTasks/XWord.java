package Java_Core_Classes.day14_String.PracticeTasks;

import java.util.Scanner;

public class XWord {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a word: ");
        String word = scan.next();

        if (word.charAt(0) == 'x')
            System.out.println(word.substring(1));
        else System.out.println(word);

        scan.close();
    }
}
