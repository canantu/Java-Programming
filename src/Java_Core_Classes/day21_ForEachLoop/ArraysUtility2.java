package Java_Core_Classes.day21_ForEachLoop;

import java.util.Arrays;

public class ArraysUtility2 {

    public static void main(String[] args) {

        String[] students = {"Elif", "Sinem", "Gunny", "Cihad", " David", "James", "Aaron", "Daniel"};
        String[] earlyBirds = Arrays.copyOf(students, 5);
        String[] earlyBirds2 = Arrays.copyOf(students, 30);
        String[] lateBirds = Arrays.copyOfRange(students, (3) ,(7));

        System.out.println(Arrays.toString(earlyBirds));
        System.out.println(Arrays.toString(earlyBirds2));
        System.out.println(Arrays.toString(lateBirds));

        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        numbers = Arrays.copyOf(numbers, 5);

        System.out.println(Arrays.toString(numbers));

        numbers = Arrays.copyOfRange(numbers, 1,3);

        System.out.println(Arrays.toString(numbers));
        System.out.println("--------------------------------------");

        char[] ch1 = {'A', 'B', 'C', 'D', 'E', 'F','G', 'H', 'I'};
        char[] ch2 = Arrays.copyOfRange(ch1, 3,7);
        // index values start from 0, not included ending index

        System.out.println(Arrays.toString(ch1));
        System.out.println(Arrays.toString(ch2));

        System.out.println("----------------------------------");

        int[] scores = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
             //index =  0   1    2   3   4   5   6   7   8   9

        int[] result = Arrays.copyOfRange(scores, 5,8);

        System.out.println(Arrays.toString(scores));
        System.out.println(Arrays.toString(result));


    }
}
