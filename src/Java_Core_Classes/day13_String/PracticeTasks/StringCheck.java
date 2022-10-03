package Java_Core_Classes.day13_String.PracticeTasks;

import java.util.Scanner;

public class StringCheck {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = scan.nextLine();
        int len = s.length();

        if (len > 3)
            System.out.println(""+s.charAt(len-1) + s.charAt(len-2) + s.charAt(len-3));
        else if (len == 0)
            System.out.println("String is empty!");
        else System.out.println(s);




        scan.close();
    }
}
