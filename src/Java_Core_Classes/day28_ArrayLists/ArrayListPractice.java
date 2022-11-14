package Java_Core_Classes.day28_ArrayLists;

import java.util.ArrayList;

public class ArrayListPractice {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10); //autoboxing
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        numbers.add(60);

        System.out.println(numbers);

        for (int i = 0; i < numbers.size(); i++) {
         numbers.set(i, numbers.get(i) * 2);
        }

        System.out.println(numbers);
    }
}
