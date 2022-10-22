package week07_10_22_2022;

import javax.crypto.spec.PSource;

public class CountEachWord {
    public static void main(String[] args) {

        String str = "Adam Adam Barry Aysun Aysun";
        String temp = "";
        String result = "";

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch != ' '){
                temp += ch;
                continue;
            }

            String dummy = str;
            String search = temp;
            int count = 0;

            while (dummy.contains(search)){
                count ++;
                dummy = dummy.replaceFirst(search, "");
            }
            if (!result.contains(search)){
                result += search + "-" + count + "\n";

            }
            temp = "";





        }
        System.out.println(result);



    }
}
