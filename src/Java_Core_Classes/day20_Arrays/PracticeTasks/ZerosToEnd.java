package Java_Core_Classes.day20_Arrays.PracticeTasks;

import java.util.Arrays;

public class ZerosToEnd {

    public static void main(String[] args) {

        int numbers[] = {10, 0, 5, 0, -1, 0};
        int temp[] = new int[numbers.length];
        int index = 0;

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] != 0){
                temp[index] = numbers[i];
                index++;
            }
        }
        System.out.println(Arrays.toString(temp));

    }
}
