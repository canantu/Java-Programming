package Java_Core_Classes.day21_ForEachLoop;

import java.util.Arrays;

public class ReversedArray {
    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50, 60, 70, 80, 90};

        int[] reversed = new int[numbers.length];

        int index = numbers.length-1;
        for (int number : numbers) {
            reversed[index] = number;
            index--;
        }

        /*for (int i = numbers.length - 1, j = 0; i >= 0; i--, j++) {
            reversed[j] = numbers[i];
        }*/

        System.out.println(Arrays.toString(reversed));

    }
}
