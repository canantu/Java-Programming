package Java_Core_Classes.day25_CustomMethod_Overloading;

import java.util.Arrays;

public class MethodOverloading {
    public static void main(String[] args) {

        int[] intArray = {5,6,0,-1,3,4};
        double[] doubleArray = {4.5, 2.5, 6.4, 3.1};
        char[] charArray = {'B', 'D', 'A', 'K', 'G'};

        Arrays.sort(intArray);
        Arrays.sort(doubleArray);
        Arrays.sort(charArray);

        System.out.println(Arrays.toString(intArray));
        System.out.println(Arrays.toString(doubleArray));
        System.out.println(Arrays.toString(charArray));
    }


}
