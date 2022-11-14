package Java_Core_Classes.day28_ArrayLists.PracticeTasks;

import java.util.ArrayList;
import java.util.Arrays;

public class MultiplyOddElement {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5));
        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 != 0)
                list.set(i, list.get(i)*2);
        }

        System.out.println(list);
    }
}
