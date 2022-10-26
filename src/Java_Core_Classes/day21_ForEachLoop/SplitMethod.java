package Java_Core_Classes.day21_ForEachLoop;

import java.util.Arrays;

public class SplitMethod {

    public static void main(String[] args) {

        String sentence = "Wooden Spoon";
        String[] words = sentence.split(" ");

        System.out.println(Arrays.toString(words));

        System.out.println("-----------------------------------------");
        String email = "WoodenSpoon@cydeo.com";

        String[] arr = email.split("@");

        System.out.println(Arrays.toString(arr));



    }
}
