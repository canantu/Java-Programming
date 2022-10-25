package Java_Core_Classes.day20_Arrays;


import java.util.Arrays;

public class ArraysUtility {

    public static void main(String[] args) {

        int numbers[] = {10, 9, 0, 1, 2, 30, 4, 6, 7, 8};

        System.out.println(Arrays.toString(numbers));

        Arrays.sort(numbers);

        System.out.println(Arrays.toString(numbers));

    }
}
