package Java_Core_Classes.day42_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class DisadvantageOfThrowsKeyword2 {
    public static void method1() throws FileNotFoundException {

        //new FileInputStream((""));
        // if not handled with try-catch, it will throw exception anyway
        // throws keyword only delegate the responsibility of handling exception to the caller method
        // throws keyword is used to prevent compile time exception
    }

    public static void method2() throws FileNotFoundException, InterruptedException {
        method1();
        Thread.sleep(1000);
    }
    public static void method3() throws FileNotFoundException, InterruptedException {
        method2();
    }

    public static void main(String[] args) throws FileNotFoundException, InterruptedException {

        method3();
    }



}
