package Java_Core_Classes.day21_ForEachLoop;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {


        String str1 = "abcd";
        String str2 = "adcb";

        //write a program that can check if str1 and str2 are build out same characters

        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();

        Arrays.sort(chars1);
        Arrays.sort(chars2);

        System.out.println(Arrays.toString(chars1) + "\n" + Arrays.toString(chars2));

        boolean anagram = Arrays.equals(chars1, chars2);
        System.out.println("anagram = " + anagram);




    }
}
