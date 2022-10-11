package Java_Core_Classes.day16_ForLoopStringPractice.PracticeTasks;

import java.util.Scanner;

public class FrequencyChar {
    public static void main(String[] args) {

        System.out.println("Enter a string: ");
        String str = new Scanner(System.in).nextLine();

        System.out.println("Enter a character: ");
        String c = new Scanner(System.in).next();

        int freq = 0;
        String ch = "";
        for (int i = 0; i < str.length(); i++) {
            ch = ""+str.charAt(i);
            if (ch.equalsIgnoreCase(c))
                freq += 1;
        }

        System.out.println("freq of "+ c + " = " + freq);


    }
}
