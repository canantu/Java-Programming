package week10_11_12_2022;

import java.util.Arrays;

public class CountTargetWord {
    public static void main(String[] args) {
        String[] array = {"java", "html", "css", "java", "javascript", "selenium"};
        System.out.println(countTargetWord(array, "java"));
    }

    public static int countTargetWord(String[] array, String target){
        int count = 0;
        for (String each : array) {
            if (each.equals(target))
                count++;
        }
        return count;
    }
}
/*
Task 5 : Target Words

                    Given an Array of Strings and a target word (String) print how many times the target word is in the Array
                    Ex: 
                    Input: 
                        "java", "html", "css", "java", "javascript", "selenium"
                        Target: java 

                        Output: 2
 */