package Java_Core_Classes.day29_ArrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueCharacters {
    public static void main(String[] args) {

        String str = "aaabcccdeefgggghiiijkkkl";
        //str.toCharArray() char primitive array is not converted into arraylist

        ArrayList<String> list = new ArrayList<>(Arrays.asList(str.split(""))); //str.split creates string array

        System.out.println(list);
        String unique = "";
        for (String each : list) {
            int freq = Collections.frequency(list, each);
            if (freq == 1)
                unique += each;
        }

        System.out.println("unique = " + unique);


    }
}
