package Java_Core_Classes.day15_ForLoop.Practice_Tasks;

import java.util.Scanner;

public class StringChars {

    public static void main(String[] args) {
        System.out.println("Enter a string: ");
        String str = new Scanner(System.in).nextLine();

        int len = str.length();
        String digits = "";
        String letters = "";
        String specials = "";

        for(int i = 0; i<len; i++){

            char c = str.charAt(i);
            if(c<='9' && c>='0')
                digits += c;
            else if (c<='Z' && c>='A' || c<='z' && c>='a' )
                letters += c;
            else
                specials += c;

        }

        System.out.println("digits = " + digits);
        System.out.println("letters = " + letters);
        System.out.println("specials = " + specials);
    }
}
