package Java_Core_Classes.day27_WrapperClasses;

import java.util.Arrays;

public class Replace {

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        array = replace(array, 1, 10);
        System.out.println(Arrays.toString(array));

        String[] array1 = {"Java", "Python", "C++", "C#"};
        array1 = replace(array1, 2, "Ruby");
        System.out.println(Arrays.toString(array1));
    }

    //replaces the element of an array at the given index and returns the array
    public static int[] replace(int[] array, int index, int newElement){
        if (index < 0 || index > array.length-1){
            System.err.println("Invalid Index " + index);
            System.exit(0);
        }
        array[index] = newElement;
        return array;
    }

    //replaces the element of an array at the given index and returns the array
    public static double[] replace(double[] array, int index, double newElement){
        if (index < 0 || index > array.length-1){
            System.err.println("Invalid Index " + index);
            System.exit(0);
        }
        array[index] = newElement;
        return array;
    }

    //replaces the element of an array at the given index and returns the array
    public static char[] replace(char[] array, int index, char newElement){
        if (index < 0 || index > array.length-1){
            System.err.println("Invalid Index " + index);
            System.exit(0);
        }
        array[index] = newElement;
        return array;
    }

    //replaces the element of an array at the given index and returns the array
    public static String[] replace(String[] array, int index, String newElement){
        if (index < 0 || index > array.length-1){
            System.err.println("Invalid Index " + index);
            System.exit(0);
        }
        array[index] = newElement;
        return array;
    }


}



/*
1. Replace Task:

    1.1 Create a method named replace that passes three parameters: integer array, integer index, integer newElement.
    The method replaces the element of the array at given index with the new element, and returns the new array.

Ex:
arr = {1,2,3,4,5};
replace(arr, 2, 30) ===> {1, 2, 30, 4, 5}

    1.2 Create the same functions for double arrays, char arrays, and String arrays
 */
