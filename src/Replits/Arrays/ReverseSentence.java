package Replits.Arrays;

import java.util.Scanner;

public class ReverseSentence {
    public static void main(String[] args) {
        // DO NOT TOUCH BELOW:
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        // TYPE YOUR CODE BELOW:

        String[] arr = sentence.split(" ");
        String result = "";
        for(int i = arr.length - 1; i >= 0; i--){
            result += arr[i] + " ";
        }

        System.out.print(result.trim());

        input.close();


    }
}
