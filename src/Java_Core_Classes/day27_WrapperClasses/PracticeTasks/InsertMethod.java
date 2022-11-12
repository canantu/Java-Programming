package Java_Core_Classes.day27_WrapperClasses.PracticeTasks;

import java.util.Arrays;

public class InsertMethod {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        System.out.println(Arrays.toString(insert(array, 2, 100)));
    }

    public static int[] insert(int[] arr, int index, int num){
        int[] result = new int[arr.length+1];

        for (int i = 0; i < index; i++) {
            result[i] = arr[i];
        }
        result[index] = num;
        for (int i = index; i < arr.length; i++) {
            result[i+1] = arr[i];
        }
        return result;
    }
}
