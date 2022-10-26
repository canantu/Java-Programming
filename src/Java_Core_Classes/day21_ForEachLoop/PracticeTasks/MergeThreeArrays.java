package Java_Core_Classes.day21_ForEachLoop.PracticeTasks;

import java.util.Arrays;

public class MergeThreeArrays {
    public static void main(String[] args) {

        int[] arr1 = {30, 10, 20};
        int[] arr2 = {15, 40, 25, 35};
        int[] arr3 = {8, 9, 17, 5, 4, 1};

        int[] merged = new int[arr1.length + arr2.length + arr3.length];
        int index = 0;
        for (int each : arr1) {
            merged[index++] = each;
        }for (int each : arr2) {
            merged[index++] = each;
        }for (int each : arr3) {
            merged[index++] = each;
        }

        System.out.println(Arrays.toString(merged));
    }
}
