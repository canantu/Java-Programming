package week10_11_12_2022;

import java.util.Arrays;

public class FourOrLess {
    public static void main(String[] args) {
        String[] words = {"apples", "tree", "loop", "cat", "animal", "shortcut"};

        System.out.println(Arrays.toString(fourOrLess(words)));
    }

    // returns an array that contains words whose size is less than or equal to 4
    public static String[] fourOrLess(String[] words){
        int size = numberOfWords(words, 4);
        String[] array = new String[size];

        int i = 0;
        for (String word : words) {
            if (word.length() <= 4)
                array[i++] = word;

        }
        return array;
    }

    // finds the total number of words in a string array, whose size equals to num
    //in this example, we find number of words whose size 4 or less
    public static int numberOfWords(String[] str, int num){  //we use it to find the size of the array
        int count = 0;
        for (String each : str) {
            if (each.length() <= num)
                count++;
        }
        return count;
    }
}
