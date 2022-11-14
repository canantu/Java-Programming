package Java_Core_Classes.day28_ArrayLists;

import java.util.ArrayList;

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
    }
}
