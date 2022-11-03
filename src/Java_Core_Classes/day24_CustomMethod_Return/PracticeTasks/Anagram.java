package Java_Core_Classes.day24_CustomMethod_Return.PracticeTasks;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String str1 = "cabb";
        String str2 = "abcc";

        System.out.println(isAnagram(str1, str2));

    }

    public static boolean isAnagram(String str1, String str2){

        boolean result = true;

        char [] arr1 = str1.toCharArray();
        char [] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if (!Arrays.equals(arr1, arr2))
            result = false;

        return result;
    }
}
