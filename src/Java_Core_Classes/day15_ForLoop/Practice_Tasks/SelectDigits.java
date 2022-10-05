package Java_Core_Classes.day15_ForLoop.Practice_Tasks;

import java.util.Scanner;

public class SelectDigits {

    public static void main(String[] args) {

        System.out.println("Enter a string with numbers and letters: ");
        String str = new Scanner(System.in).nextLine();

        int len1 = str.length();
        String digits = "";
        char c1;
        char c2;
        int sum = 0;
        int num = 0;

        for(int i =0; i<len1; i++ ){
            c1 = str.charAt(i);

            if(c1 <= '9' && c1 >= '0')
                digits += c1;
        }

        System.out.println("digits = " + digits);

        int len2 = digits.length();
        for(int j=0; j<len2; j++ ) {
            c2 = digits.charAt(j);
            num = Character.getNumericValue(c2);
            sum += num;
        }

        System.out.println("sum = " + sum);




    }
}
