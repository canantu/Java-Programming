package Java_Core_Classes.day24_CustomMethod_Return.PracticeTasks;

import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50, 60, 70};
        int index = 6;
        System.out.println(Arrays.toString(removeElement(array, index)));
    }

    public static int[] removeElement(int[] arr, int index){
        int[] removedArray = new int[arr.length - 1];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i == index)
                continue;
            removedArray[j] = arr[i];
            j++;
        }
        return removedArray;
    }
}
