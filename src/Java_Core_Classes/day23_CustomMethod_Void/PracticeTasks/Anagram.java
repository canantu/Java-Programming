package Java_Core_Classes.day23_CustomMethod_Void.PracticeTasks;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string");
        String str1 = scan.nextLine();
        System.out.println("Enter second string");
        String str2 = scan.nextLine();
        checkAnagram(str1, str2);
        scan.close();

    }

    public static void checkAnagram(String str1, String str2){

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if (Arrays.equals(arr1, arr2))
            System.out.println("Anagram");
        else System.out.println("Not anagram");

    }
}
