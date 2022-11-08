package Java_Core_Classes.day26_CustomMethodsPractice;

import java.util.Arrays;

public class MergeTwoArrays {

    public static void main(String[] args) {

        int[] arr1 = {1,2,3};
        int[] arr2 = {4,5,6};
        int[] arr3 = merge(arr1, arr2);
        System.out.println(Arrays.toString(arr3));
    }
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
