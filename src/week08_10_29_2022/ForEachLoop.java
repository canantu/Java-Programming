package week08_10_29_2022;

import java.util.Arrays;

public class ForEachLoop {

    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,5,6};

        for (int number : numbers) {
            System.out.print(number + " ");
        }
        //toCharArray  String to char Array
        System.out.println();
        System.out.println(Arrays.toString("Adam".toCharArray()));
        String str = "Canan";
        char[] letters = str.toCharArray();

        System.out.println(Arrays.toString(letters));

        //split(regex)

        String sentence = "Java is a good language.";

        String[] words = sentence.split(" ");
        for (String each: words) {
            System.out.println(each.replace(".", ""));
        }










    }
}
