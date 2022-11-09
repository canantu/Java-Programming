package Java_Core_Classes.day27_WrapperClasses;

import utilities.ArraysUtility;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {

        int[] array = {1,2,2,3,4,5,5,5, 10, 10};
        array = removeDuplicates(array);
        System.out.println(Arrays.toString(array));
    }
    //removes the duplicates of an array and returns a new array
    public static int[] removeDuplicates(int[] array){
        int[] result = {};  //since initial size is not set, you can not assign value by index, only for referencing
        for (int each : array) {
            if (!ArraysUtility.contains(result, each))
                result = ArraysUtility.addElement(result, each);
        }
        return result;
    }
    //removes the duplicates of an array and returns a new array
    public static double[] removeDuplicates(double[] array){
        double[] result = {};  //since initial size is not set, you can not assign value by index, only for referencing
        for (double each : array) {
            if (!ArraysUtility.contains(result, each))
                result = ArraysUtility.addElement(result, each);
        }
        return result;
    }
    //removes the duplicates of an array and returns a new array
    public static char[] removeDuplicates(char[] array){
        char[] result = {};  //since initial size is not set, you can not assign value by index, only for referencing
        for (char each : array) {
            if (!ArraysUtility.contains(result, each))
                result = ArraysUtility.addElement(result, each);
        }
        return result;
    }
    //removes the duplicates of an array and returns a new array
    public static String[] removeDuplicates(String[] array){
        String[] result = {};  //since initial size is not set, you can not assign value by index, only for referencing
        for (String each : array) {
            if (!ArraysUtility.contains(result, each))
                result = ArraysUtility.addElement(result, each);
        }
        return result;
    }

}
