package Java_Core_Classes.day20_Arrays.PracticeTasks;

import java.util.Arrays;

public class Reversed {
    public static void main(String[] args) {

        int numbers[] = {1,2,3,4,5,6,7};
        int reversed[] = new int[numbers.length];
        int index = 0;

        for (int i = numbers.length - 1; i >= 0; i--) {
            reversed[index] = numbers[i];
            index++;
        }

        System.out.println(Arrays.toString(reversed));
    }
}
