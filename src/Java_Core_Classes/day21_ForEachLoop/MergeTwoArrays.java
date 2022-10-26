package Java_Core_Classes.day21_ForEachLoop;

import java.util.Arrays;

public class MergeTwoArrays {
    public static void main(String[] args) {

        int[] arr1 = {1,2,3};
        int[] arr2 = {4,5};

        int[] merged = new int[arr1.length + arr2.length];

        int index = 0;

        for (int num : arr1) {
            merged[index] = num;
            index++;
        }

        for (int num : arr2) {
            merged[index] = num;
            index++;
        }

        System.out.println(Arrays.toString(merged));


    }
}
