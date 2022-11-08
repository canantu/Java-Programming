package Java_Core_Classes.day26_CustomMethodsPractice;

import java.util.Arrays;

public class RemoveElements1 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        array = removeElements(array, 1);
        System.out.println(Arrays.toString(array));

        array = removeElements(array, 1);
        System.out.println(Arrays.toString(array));

        array = removeElements(array, 1);
        System.out.println(Arrays.toString(array));
    }
    //removes the element of a given index from an array and returns new array
    public static int[] removeElements(int[] array, int index){
        if (index < 0 || index > array.length-1){
            System.err.println("Invalid index:" + index);
            System.exit(0);
        }

        int[] result = new int[array.length-1];
        int j = 0;
        for (int i = 0 ; i< array.length; i++) {
            if (i == index)
                continue;
            result[j++] = array[i];
        }
        return result;

    }


}
