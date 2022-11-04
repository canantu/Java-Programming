package Replits.Arrays;

import java.util.Scanner;

public class BiggestWord {

    public static void main(String[] args) {
        //DO NOT TOUCH BELOW
        Scanner input = new Scanner(System.in);
        String[] words = new String[5];
        for(int i = 0; i < 5;  i++) {
            words[i] = input.nextLine();
        }
        //WRITE YOUR CODE BELOW
        String longestString = "";
        int length= 0;
        for(String each : words)
            if(each.length() > length) {
                longestString = each;
                length = each.length();
            }

        System.out.println(longestString);
        input.close();


    }


}
