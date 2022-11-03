package Java_Core_Classes.day24_CustomMethod_Return.PracticeTasks;

import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        String str = "canan";
        String reversed = reverse(str);
        System.out.println("reversed = " + reversed);

    }
    public static String reverse(String str){
        String reversed = "";
        for (int i = str.length() - 1; i >= 0 ; i--) {
            reversed += str.charAt(i);
        }

        return reversed;
    }
}
