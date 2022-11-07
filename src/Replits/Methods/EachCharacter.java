package Replits.Methods;

import java.util.Scanner;

public class EachCharacter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(countLetters(in.next()));
    }

    public static String countLetters(String str) {

        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (ch == str.charAt(j))
                    count++;
            }
            if(!result.contains(""+ch))
                result += "" + ch + count;

        }
        return result;

    }
}
