package Java_Core_Classes.day26_CustomMethodsPractice;

import utilities.ArraysUtility;

public class MergeTwoArrays {

    //merges given two arrays and returns the new array
    public static int[] merge(int[] arr1, int[] arr2){
        int[] merged = new int[arr1.length + arr2.length];
        int i = 0;
        for (int each : arr1) {
            merged[i++] = each;
        }

        for (int each : arr2) {
            merged[i++] = each;
        }
        return merged;

    }
}
