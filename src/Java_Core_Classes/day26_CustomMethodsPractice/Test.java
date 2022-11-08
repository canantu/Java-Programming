package Java_Core_Classes.day26_CustomMethodsPractice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {

        int[] array = {1,2,3,3,34,5,5};
        int[] unique = ArraysUtility.uniqueElement(array);
        System.out.println(Arrays.toString(unique));
        System.out.println(Arrays.toString(ArraysUtility.removeElement(array,1)));


        double[] array1 = {1.5,2.5,3.5,3.5,34.5,5.5,5.5};
        double[] unique1 = ArraysUtility.uniqueElement(array1);
        System.out.println(Arrays.toString(unique1));
        System.out.println(Arrays.toString(ArraysUtility.removeElement(array1,1)));

        char[] array2 = {'a', 'a', 'b', 'b', 'c', 'd'};
        char[] unique2 = ArraysUtility.uniqueElement(array2);
        System.out.println(Arrays.toString(unique2));
        System.out.println(Arrays.toString(ArraysUtility.removeElement(array2,1)));

        String[] array3 = {"can", "can", "java", "python","Ali"};
        String[] unique3 = ArraysUtility.uniqueElement(array3);
        System.out.println(Arrays.toString(unique3));
        System.out.println(Arrays.toString(ArraysUtility.removeElement(array3,1)));
    }
}
