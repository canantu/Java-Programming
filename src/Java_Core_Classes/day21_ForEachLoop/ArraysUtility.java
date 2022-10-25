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








    }


}
