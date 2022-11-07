package Replits.Methods;

import java.util.Scanner;

public class UniqueCharacters {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(uniqueChars(in.next()));
    }

    public static String uniqueChars(String str) {
        //TODO: write your code
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!result.contains(""+ch)){
                result+=ch;
            }
        }
        return result;
    }
}
