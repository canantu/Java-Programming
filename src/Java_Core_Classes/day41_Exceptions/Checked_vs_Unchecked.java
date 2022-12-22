package Java_Core_Classes.day41_Exceptions;

import Java_Core_Classes.day39_Recap.ShapeTask.Circle;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Checked_vs_Unchecked {
    public static void main(String[] args)  {

        // unchecked exception
        int a = 10;
        int b = 0;

       // System.out.println(a/b);
      //  System.out.println("Wooden Spoon");

        char[] characters = {'a', 'b', 'c'};
        // System.out.println(characters[4]);

        Circle circle = null;
        // System.out.println(circle.getRadius());

        String str = "Wooden Spoon";
       // str = null;
        // System.out.println(str.toUpperCase());

       //checked exception

        System.out.println("Hello");
        //Thread.sleep(1000);
        System.out.println("Cydeo");
       // FileInputStream file = new FileInputStream("path of the file");


    }
}
