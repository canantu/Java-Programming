package Java_Core_Classes.day21_ForEachLoop;

import java.util.Arrays;

public class ArraysUtility {
    public static void main(String[] args) {

        int nums[] = {1,2,3,4,5};

        System.out.println(nums); //hashcode
        System.out.println(Arrays.toString(nums));
        System.out.println(nums[0]);
        //when we print a String, toString method called implicitly
        System.out.println("-----------------------------------");

        int scores[] = {95, 100, 55, 65, 85, 75};
        System.out.println(Arrays.toString(scores));
        Arrays.sort(scores);
        System.out.println(Arrays.toString(scores));

        System.out.println("Min score is " + scores[0]);
        System.out.println("Max score is " + scores[scores.length-1]);
        System.out.println("-------------------------------------");

        String[] names = {"Anna", "Ahmet", "Ali", "Canan", "Abdullah", "Anil"};
        System.out.println(Arrays.toString(names));
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));

        String[] words = {"ANNA", "Anna"};
        Arrays.sort(words);
        System.out.println(Arrays.toString(words));

        System.out.println("----------------------------------");

        int[] arr1 = {1,3,2};
        int[] arr2 = {1,2,3};

        boolean r1 = Arrays.equals(arr1, arr2);
        System.out.println(r1);

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        boolean r2 = Arrays.equals(arr1, arr2);
        System.out.println(r2);

        System.out.println("-----------------------------------");
        //Anagram task, first sort arrays, them compare them if they are equal.
        char[] ch1 = {'a','c','b'};
        char[] ch2 = {'b','a','c'};

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        boolean r3 = Arrays.equals(ch1, ch2);
        System.out.println("Are they Anagram: " + r3);





    }


}
