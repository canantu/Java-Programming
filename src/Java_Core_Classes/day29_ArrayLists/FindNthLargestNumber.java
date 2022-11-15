package Java_Core_Classes.day29_ArrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FindNthLargestNumber {  //interview question
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,7,8,8,9));

        int n = 3;
        for (int i = 1; i < n; i++) {
            list.removeIf(p-> p == Collections.max(list));
        }

        int max = Collections.max(list);
        System.out.println(max);




    }
}
