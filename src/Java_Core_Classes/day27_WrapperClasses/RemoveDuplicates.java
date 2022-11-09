package Java_Core_Classes.day27_WrapperClasses;

import utilities.ArraysUtility;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {

        int[] array = {1,2,2,3,4,5,5,5, 10, 10};
        array = removeDuplicate(array);
        System.out.println(Arrays.toString(array));
    }

    public static int[] removeDuplicate(int[] array){
        int[] result = {};  //since initial size is not set, you can not assign value by index, only for referencing
        for (int each : array) {
            if (!ArraysUtility.contains(result, each))
                result = ArraysUtility.addElement(result, each);
        }
        return result;
    }
}
