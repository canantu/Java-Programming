package Java_Core_Classes.day24_CustomMethod_Return;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int[] result = new int[arr.length];
        result = reverseArray(arr);
        System.out.println(Arrays.toString(result));

    }

    public static int[] reverseArray(int[] arr){
        int[] result = new int[arr.length];
        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            result[j] = arr[i];
        }

        return result;
    }
}
