package Java_Core_Classes.day28_ArrayLists;

import java.util.ArrayList;

public class ArrayListMethods1 {
    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();
        System.out.println(students);
        students.add("canan");
        System.out.println(students);
        students.add("ali");
        System.out.println(students);

        System.out.println("--------------------------------");

        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println(numbers);

        numbers.add(10); // autoboxing, type converted implicitly
        System.out.println(numbers);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        System.out.println(numbers);

        numbers.add(2, 25); // the other elements are shifted, like inserting a new element
        //if index number is false, IndexOutOfBoundsException
        System.out.println(numbers);

        System.out.println("size" + numbers.size());

        int length = numbers.size();
        int lastIndex = numbers.size() - 1;

        System.out.println("length = " + length);
        System.out.println("lastIndex = " + lastIndex);

        System.out.println("-----------------------------");

        Integer num1 = numbers.get(3);
        System.out.println("num1 = " + num1);
        int num2 = numbers.get(0); //unboxing
        System.out.println("num2 = " + num2);

        System.out.println("-----------------------------");

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

        System.out.println("-------------------------------");

        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("Java");
        list.add("C#");
        list.add("Ruby");

        System.out.println(list);

        list.set(2, "Javascript");
        list.set(3, "C++"); //replace the element, does not change the size
        System.out.println(list);

    }
}
