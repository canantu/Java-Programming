package Java_Core_Classes.day13_String;

import java.util.Scanner;

public class Initials {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String firstName = "";
        String lastName = "";

        System.out.println("Enter your fist name: ");
        firstName = scan.nextLine();

        System.out.println("Enter your last name: ");
        lastName = scan.nextLine();

        char f = firstName.charAt(0);
        char l = lastName.charAt(0);
        String initials = f + "." + l;  //if f+l, we have to use "", empty string to make concatenation
        System.out.println(initials);

        scan.close();
    }
}
