package Java_Core_Classes.day28_ArrayLists.PracticeTasks;

import java.util.ArrayList;
import java.util.Arrays;

public class FindMax {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5));

        Integer max = list.get(0);
        for (Integer each : list) {
            if (each > max)
                max = each;
        }

        System.out.println("max = " + max);
    }
}
