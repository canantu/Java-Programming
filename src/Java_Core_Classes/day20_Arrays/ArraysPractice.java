package Java_Core_Classes.day20_Arrays;

import java.util.Arrays;

public class ArraysPractice {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 50, 70};  //size:4
        System.out.println(Arrays.toString(numbers));

        System.out.println("-------------------------------");
        //create a variable that can contain 5 scores
        // if we don't know yet what are  the elements are, initialization
        int[] scores = new int[5];  //default integer value is 0 [0, 0, 0, 0, 0]

        System.out.println(Arrays.toString(scores));
        // second score is 85

        scores[1] = 85;
        scores[scores.length -1] = 95;
        scores[3] = 75;
        scores[0] = 65;
        scores[2] = 55;

        System.out.println(Arrays.toString(scores));

        System.out.println("-------------------------------------");
        String months[] = {"january", "february", "march", "april", "may", "june", "july", "august",
                "september", "october", "november", "december"};

        /*
        System.out.println(months[0]);
        System.out.println(months[1]);
        System.out.println(months[2]);
        System.out.println(months[3]);
        System.out.println(months[4]);
        */


        System.out.println("------------------------------");

        for (int i = 0; i < months.length; i++) {
            System.out.print(months[i] + ", ");
        }
        System.out.println();
        for (int j = months.length-1; j >= 0; j--) {
            System.out.print(months[j] + ", ");
        }


    }
}
