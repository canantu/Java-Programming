package Java_Core_Classes.day25_CustomMethod_Overloading;

import utilities.ArraysUtility;

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

        int[] arr5 = {14,22,13,41,35};
        System.out.println(ArraysUtility.max(arr5));

        double[] arr6 = {151.5,22.6,33.7,14.8,75.9};
        System.out.println(ArraysUtility.max(arr6));

        int[] arr7 = {14,22,13,41,35};
        System.out.println(ArraysUtility.min(arr7));

        double[] arr8 = {151.5,22.6,33.7,14.8,75.9};
        System.out.println(ArraysUtility.min(arr8));

        System.out.println(ArraysUtility.contains(arr1, 5)); //arr1 = {1,2,3,4,5};

        System.out.println(ArraysUtility.contains(arr3, 'a'));//arr3 = {'c', 'a', 'n', 'a', 'n'};

        System.out.println(ArraysUtility.contains(arr2, 1.4));//arr2 = {1.5,2.6,3.7,4.8,5.9};

        System.out.println(ArraysUtility.contains(arr4, "ali"));//arr4 = {"canan", "can", "ali"};
    }
}
