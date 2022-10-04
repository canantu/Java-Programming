package Java_Core_Classes.day14_String.PracticeTasks;

import java.util.Scanner;

public class Really {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = scan.next();

        String word1 = word.substring(word.length()-2);
        System.out.println(word1);
        if (word1.equals("ly"))
        System.out.println("really???");
        else
        System.out.println("never mind");

        scan.close();
    }
}
