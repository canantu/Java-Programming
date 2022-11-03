package Java_Core_Classes.day24_CustomMethod_Return;

import java.util.Arrays;

public class MergeArrays {

    public static void main(String[] args) {
        int[] arr1 = {1,2,3};
        int[] arr2 = {1,2,3,4,5};
        int[] merged = new int[arr1.length + arr2.length];
        merged = mergeArray(arr1, arr2);
        System.out.println(Arrays.toString(merged));
    }

    public static int[] mergeArray(int[] arr1, int[] arr2){
        int[] merged = new int[arr1.length + arr2.length];

        for (int i = 0; i < arr1.length; i++) {
            merged[i] = arr1[i];
        }
        for (int j = 0; j < arr2.length; j++) {
            merged[arr1.length + j] = arr2[j];
        }

        return merged;

    }
}
