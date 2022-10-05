package Java_Core_Classes.day15_ForLoop.Practice_Tasks;

import java.util.Scanner;

public class InverseString {
    public static void main(String[] args) {

        System.out.println("Enter a string: ");
        String str = new Scanner(System.in).nextLine();

        for (int i = str.length() -1; i >= 0 ; i--) {
            System.out.print(str.charAt(i));
        }

    }
}
