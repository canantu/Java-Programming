package Java_Core_Classes.day15_ForLoop.Practice_Tasks;

import java.util.Scanner;

public class SelectDigits {
    public static void main(String[] args) {

        System.out.println("Enter a string with numbers and letters: ");
        String str = new Scanner(System.in).nextLine();

        int len = str.length();
        char c1;
        int sum = 0;

        for(int i =0; i<len; i++ ){
            c1 = str.charAt(i);
            if(c1 <= '9' && c1 >= '0')
                sum += c1 - 48;
        }





        /*int len2 = digits.length();
        int number = Integer.parseInt(digits);
        for (int i = 0; i < len2; i++) {
            sum += number % 10;
            number = number / 10;
        }*/

        /*int len2 = digits.length();
        for(int j=0; j<len2; j++ ) {
            c2 = digits.charAt(j);
            sum += Character.getNumericValue(c2);

        }
         */

        System.out.println("sum = " + sum);




    }
}
