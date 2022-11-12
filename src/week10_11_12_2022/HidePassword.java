package week10_11_12_2022;

import java.util.Arrays;

public class HidePassword {
    public static void main(String[] args) {
        String[] array = {"one", "two", "three"};
        System.out.println(Arrays.toString(hidePassword(array)));

    }

    public static String[] hidePassword(String[] array){
        String[] result = new String[array.length];
        int i = 0;
        for (String each : array) {
           result[i++] =  convertLetterToStar(each);
        }
        return result;
    }

    private static String convertLetterToStar(String str){
        String temp = "";
        for (int i = 0; i < str.length(); i++) {
            temp += '*';
        }
        return temp;
    }
}
