package Java_Core_Classes.day31_Constructors.PracticeTasks;

import java.util.ArrayList;
import java.util.Arrays;

public class MainMovie {
    public static void main(String[] args) {

        ArrayList<String> casts = new ArrayList<>(Arrays.asList("Canan", "Ali", "Alim", "Can"));
        Movie movie1 = new Movie("Germany", "Hello World", "horror", "2020",
                "Benjamin Franklin", casts);

        movie1.addCast("Caner");
        System.out.println(movie1);
        String[] castArr = {"Cafer", "Alp"};
        movie1.addCasts(castArr);
        System.out.println(movie1);
    }
}
