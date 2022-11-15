package Java_Core_Classes.day29_ArrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtility {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10,9,8,7,6,5,4,3,2,1));

        Collections.sort(list);
        System.out.println(list);

        System.out.println("--------------------------------------");
        ArrayList<Character> list2 = new ArrayList<>(Arrays.asList('A', 'B', 'C', 'D', 'E'));

        System.out.println(list2);
        Collections.reverse(list2);
        System.out.println(list2);

        System.out.println("--------------------------------------");

        ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50, 60, 70));

        System.out.println(list3);
        Collections.swap(list3, 1,4);
        System.out.println(list3);

        System.out.println("--------------------------------------");

        int max = Collections.max(list3);
        System.out.println("max = " + max);

        int min = Collections.min(list3);
        System.out.println("min = " + min);

        System.out.println("--------------------------------------");

        ArrayList<Integer> list4 = new ArrayList<>(Arrays.asList(10,10,20,30,40,50,10,10,10));

        Collections.replaceAll(list4, 10, 100);
        System.out.println(list4);
        System.out.println("--------------------------------------");

        int freq = Collections.frequency(list4, 1000);
        System.out.println("freq = " + freq);
        System.out.println("--------------------------------------");

        ArrayList<String> words = new ArrayList<>(Arrays.asList("Java", "Java", "Python", "Python", "Ruby", "C#"));

        int freqJava = Collections.frequency(words, "Java");
        int freqPython = Collections.frequency(words, "Python");

        System.out.println("freqJava = " + freqJava);
        System.out.println("freqPython = " + freqPython);

        boolean isFreqEqual = freqJava == freqPython;
        System.out.println("isFreqEqual = " + isFreqEqual);






    }
}
