package week08_10_29_2022;

import java.util.Arrays;

public class ArraysIntro {
    public static void main(String[] args) {

        //if we know the elements of the array
        int[] numbers1 = {1, 2, 3, 4, 5, 6};

        //if we don't know the elements of the array, but we have to know the size
        int[] numbers2 = new int[30];

        int[] numbers3 = new int[] {1,2,3,4,5,6,7,8,9,0};

        System.out.println(numbers1.length);
        System.out.println(numbers2.length);
        System.out.println(numbers3.length);

        for (int i = 0; i < numbers2.length; i++) {

            numbers2[i] = 10;

        }

        System.out.println(Arrays.toString(numbers2));

        char[] chars = {'A', 'B', 'C', 'D', 'E'};
        System.out.println(Arrays.toString(chars));

        System.out.println("Adam");

        System.out.println("=====================================");

        System.out.println(chars[1]);



    }
}
