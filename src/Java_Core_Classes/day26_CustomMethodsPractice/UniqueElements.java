package Java_Core_Classes.day26_CustomMethodsPractice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class UniqueElements {

    public static void main(String[] args) {

        int[] array = {1,2,3,3,34,5,5};
        int[] unique = uniqueElement(array);
        System.out.println(Arrays.toString(unique));

        double[] array1 = {1.5,2.5,3.5,3.5,34.5,5.5,5.5};
        double[] unique1 = uniqueElement(array1);
        System.out.println(Arrays.toString(unique1));

        char[] array2 = {'a', 'a', 'b', 'b', 'c', 'd'};
        char[] unique2 = uniqueElement(array2);
        System.out.println(Arrays.toString(unique2));

        String[] array3 = {"can", "can", "java", "python","Ali"};
        String[] unique3 = uniqueElement(array3);
        System.out.println(Arrays.toString(unique3));
    }
    
    //returns an array that includes all unique elements in an array
    public static int[] uniqueElement(int[] array){

        int[] result = {};
        for (int each : array) {
            if (ArraysUtility.frequencyOfElement(array, each) == 1)
                result = ArraysUtility.addElement(result, each);
        }
        return result;
    }
    
    //returns an array that includes all unique elements in an array
    public static double[] uniqueElement(double[] array){

        double[] result = {};
        for (double each : array) {
            if (ArraysUtility.frequencyOfElement(array, each) == 1)
                result = ArraysUtility.addElement(result, each);
        }
        return result;
    }

    //returns an array that includes all unique elements in an array
    public static char[] uniqueElement(char[] array){

        char[] result = {};
        for (char each : array) {
            if (ArraysUtility.frequencyOfElement(array, each) == 1)
                result = ArraysUtility.addElement(result, each);
        }
        return result;
    }

    //returns an array that includes all unique elements in an array
    public static String[] uniqueElement(String[] array){

        String[] result = {};
        for (String each : array) {
            if (ArraysUtility.frequencyOfElement(array, each) == 1)
                result = ArraysUtility.addElement(result, each);
        }
        return result;
    }
    
    
}
