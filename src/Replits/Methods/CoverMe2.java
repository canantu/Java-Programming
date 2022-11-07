package Replits.Methods;

import java.util.Scanner;

public class CoverMe2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(coverString(in.nextLine(), in.nextLine()));
    }

    public static String coverString (String main, String coverMe) {
        // your code here
        String str="["+coverMe+"]";
        if (main.contains(coverMe)) {main=main.replace(coverMe,str);} else main="["+main+"]";
        return main;

    }
}
