package Java_Core_Classes.day24_CustomMethod_Return.PracticeTasks;

import java.util.Arrays;

public class ReverseInt {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        System.out.println(Arrays.toString(reverseInt(arr)));
    }

    public static int[] reverseInt(int[] arr){
        int[] reversed = new int[arr.length];
        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            reversed[j] = arr[i];
        }

        return reversed;
    }
}
