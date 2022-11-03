package Java_Core_Classes.day24_CustomMethod_Return.PracticeTasks;

import java.util.Arrays;

public class MergeArrays {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3};
        int[] arr2 = {4,5,6};
        System.out.println(Arrays.toString(merge(arr1, arr2)));
    }

    public static int[] merge(int[] arr1, int[] arr2){

        int[] merged = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            merged[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            merged[arr1.length + i] = arr2[i];
        }
        return merged;
    }
}
