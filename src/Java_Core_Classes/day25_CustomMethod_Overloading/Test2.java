package Java_Core_Classes.day25_CustomMethod_Overloading;

import utilities.ArraysUtility;
import utilities.StringUtility;

public class Test2 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        ArraysUtility.printEachElement(arr1);

        double[] arr2 = {1.5,2.6,3.7,4.8,5.9};
        ArraysUtility.printEachElement(arr2);

        char[] arr3 = {'c', 'a', 'n', 'a', 'n'};
        ArraysUtility.printEachElement(arr3);

        String[] arr4 = {"canan", "can", "ali"};
        ArraysUtility.printEachElement(arr4);
    }
}
