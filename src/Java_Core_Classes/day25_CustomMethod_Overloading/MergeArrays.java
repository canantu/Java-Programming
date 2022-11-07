package Java_Core_Classes.day25_CustomMethod_Overloading;

import java.util.Arrays;

public class MergeArrays {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3};
        int[] arr2 = {4,5,6};
        System.out.println(Arrays.toString(merge(arr1, arr2)));
    }

    public static int[] merge(int[] arr1, int[] arr2){
        int length = arr1.length + arr2.length;
        int[] arr = new int[length];

        System.arraycopy(arr1, 0, arr, 0, arr1.length);
        System.arraycopy(arr2, 0, arr, 0 + arr1.length, arr2.length);

        return arr;
    }
}
