package week11_11_19_2022;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListIntro {
    public static void main(String[] args) {

        ArrayList<String> cities = new ArrayList<>();
        //ArrayList<String> cities = new ArrayList<String>();

        cities.add("Istanbul");   //returns boolean
        cities.add("Berlin");
        cities.add("New York");
        cities.add("London");  //cities.add(int index, element)

        System.out.println(cities);
        //[Istanbul, Berlin, New York, London]
        //Arrays.toString()  to print arrays

        //how to add an element to the specific index

        cities.add(0, "Paris");
        System.out.println(cities);
        // [Paris, Istanbul, Berlin, New York, London]  inserting the element
        System.out.println(cities.get(0)); //get method returns the element in the specified index

        // to update an element in the specified index number
        System.out.println("--------set method return set(0, Rome)---------");
        System.out.println(cities.set(0, "Rome"));  //returns the old element, that is updated
        System.out.println(cities);

        //index of element
        System.out.println("--------if city does not exists---------");
        System.out.println(cities.indexOf("Paris")); //if element does not exist, returns -1
        System.out.println("---------indexOf and lastIndexOf Istanbul------------");
        System.out.println(cities.indexOf("Istanbul")); //starts to search from beginning of the list
        System.out.println(cities.lastIndexOf("Istanbul")); //starts to search from end of the list

        System.out.println("--------contains method-------");
        System.out.println(cities.contains("Berlin"));

        System.out.println("----------numbers---------------");

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(1);

        System.out.println(numbers);

        numbers.remove(1);
        System.out.println(numbers);
        Integer num = 2;
        numbers.remove(num );
        System.out.println(numbers);
        numbers.remove(new Integer(4)); //Integer.valueOf(int); returns an object
        System.out.println(numbers);

        //Bulk operations- addAll - removeAll, retainAll, containsAll
        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Mesut", "Osman", "Seyma"));

        //removeIf
        System.out.println("----------removeIf--------------");
        System.out.println(numbers.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9)));

        numbers.removeIf(p-> p<3);  //we cannot use remove method in a loop, because everytime size of the index changes
        System.out.println(numbers);

        System.out.println("...................................");

        ArrayList<Integer> numbers1 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8));







    }
}

//how to create an array list
