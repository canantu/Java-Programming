package Java_Core_Classes.day28_ArrayLists;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethods2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(100);
        list.add(200);
        list.add(200);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(500);

        System.out.println(list);

        list.remove(1);
        System.out.println(list);

        Integer num = 200;  //to pass object, we have to convert primitive into Integer object, otherwise IndexOutOfBound exception if index does not exist
        boolean r = list.remove(num );
        System.out.println(list);
        System.out.println("r = " + r);

        Integer num1 = 600; // there is no such element, returns false as a result
        boolean r2 = list.remove(num1);
        System.out.println("r2 = " + r2);

        System.out.println("----------------------------------------");

        System.out.println(list.size());
        list.clear();
        System.out.println(list.size());
        System.out.println(list);

        System.out.println("----------------------------------------");

        ArrayList<Character> characters = new ArrayList<>();
        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('A');

        int a = characters.indexOf('A');
        int b = characters.lastIndexOf('A');
        System.out.println(a);
        System.out.println(b);

        System.out.println("----------------------------------------");

        boolean r3 = characters.contains('A');
        boolean r4 = characters.contains('Z');

        System.out.println("r3 = " + r3);
        System.out.println("r4 = " + r4);

        System.out.println("----------------------------------------");

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(100);
        list1.add(100);
        list1.add(100);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(100);
        list2.add(100);
        list2.add(100);

        boolean r5 = list1.equals(list2);
        System.out.println(list1 == list2);
        System.out.println("r5 = " + r5);

        System.out.println("----------------------------------------");

        boolean r6 = list1.isEmpty();
        System.out.println("r6 = " + r6);
        list1.clear();
        boolean r7 = list1.isEmpty();
        System.out.println("r7 = " + r7);

        System.out.println("----------------------------------------");

        ArrayList<Integer> numbers = new ArrayList<>();
        // bulk operation: collection type
        numbers.addAll(Arrays.asList(1,2,3,4,5,6,7));
        System.out.println(numbers);


    }
}
