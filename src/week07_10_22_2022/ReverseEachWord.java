package week07_10_22_2022;

import java.io.FilterOutputStream;

public class ReverseEachWord {

    public static void main(String[] args) {

        String str = "Adam come here";
        String temp = "";
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch != ' ') {
                temp += ch;
                continue;
            }

            for (int j = temp.length() -1; j >= 0; j--) {

                result += temp.charAt(j);

            }
            result += " ";
            temp = "";

        }

        for (int j = temp.length() -1; j >= 0; j--) {

            result += temp.charAt(j);

        }

        System.out.println(result);
    }
}
