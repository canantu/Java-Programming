package Java_Core_Classes.day28_ArrayLists.PracticeTasks;

import java.util.ArrayList;
import java.util.Arrays;

public class SwapElements {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5));
        System.out.println(list);

        Integer firstElement = list.get(0);
        list.set(0, list.get(list.size()-1));
        list.set(list.size()-1, firstElement);

        System.out.println(list);

    }
}
