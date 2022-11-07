package Replits.Methods;

import java.util.Scanner;

public class CoverMe {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(coverString(in.nextLine(), in.nextLine()));
    }

    public static String coverString(String main, String coverMe) {
        // your code here
        int len = coverMe.length();
        String result = "";
        for(int i=0; i<=main.length()-len;){

            String word = main.substring(i,i+len);

            if(!word.equals(coverMe)){
                result += main.charAt(i);
                i++;
                if (i == main.length()-1)
                    result+=main.charAt(i);

            }else {
                result += "[" + word + "]";
                i=i+len;
            }


        }
        if(!result.contains(coverMe))
            result = "[" + result + "]";
        return result;

    }

}
