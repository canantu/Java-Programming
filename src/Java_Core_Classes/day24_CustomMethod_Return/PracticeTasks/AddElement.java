package Java_Core_Classes.day24_CustomMethod_Return.PracticeTasks;

import java.util.Arrays;

public class AddElement {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(Arrays.toString(addElement(arr, 4)));
    }

    public static int[] addElement(int[] arr, int num){

        int[] array = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            array[i] = arr[i];
        }
        array[array.length - 1] = num;

        return array;
    }
}
