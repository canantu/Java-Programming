package Java_Core_Classes.day41_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TryCatchBlock {
    public static void main(String[] args) {


        System.out.println("Test1 started");
        try{
            System.out.println(9/0);
            System.out.println("Try block");
        }catch (ArithmeticException e){
            System.out.println("Catch block");
            System.out.println(e + " was occurred");
        }

        System.out.println("Test1 completed");
        System.out.println("--------------------------");
        System.out.println("Test2 started");
        int[] numbers = {1,2,3,4,5};
        try{
            System.out.println(numbers[6]);
            System.out.println("Try block");
        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
            System.out.println("Exception is thrown >>> " + e);
            // System.out.printf(e.getMessage());
        }

        System.out.println("Test2 completed");

        System.out.println("--------------------------");

        System.out.println("Test3 started");

        try{
            System.out.println("Cydeo".substring(2,0));

        }catch (StringIndexOutOfBoundsException e){
            e.printStackTrace();
            System.out.println("Exception is thrown >>> " + e);
        }
        System.out.println("Test3 completed");

        System.out.println("-----------checked exception---------------");

        System.out.println("Hello");


        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Cydeo");

        System.out.println("-----------checked exception---------------");


        try {
            FileInputStream file = new FileInputStream("File Path");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}
