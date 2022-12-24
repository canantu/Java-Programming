package week16_12_24_2022.Exceptions;

import week15_12_17_2022.method_overriding.EmployeeTask.Employee;

public class RunTimeExceptionsExample {

    static Employee employee; // (either declare as static or move it inside the main method)

    public static void main(String[] args) {


        try {
            for (int i = 5; i >=0; i--) {
                System.out.println(60/i);  //java.lang.ArithmeticException
            }
        } catch (Exception e) {
           // System.out.println(e.getMessage());
            e.printStackTrace();
        }

        try {
            System.out.println(employee.salary());  //java.lang.NullPointerException
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // before initialize the object, this give null pointer exception

        // inside the static methods or blocks, we can not reach instance variables


        try {
            String str = "Adam 123.";
            String s = str.substring(str.indexOf(" ") + 1); //java.lang.NumberFormatException
            System.out.println(Integer.parseInt(s));
        } catch (NumberFormatException e) {
            //System.out.println(e.getMessage());
            e.printStackTrace();
        }

        int[] arr = {1,2,3,4,5};
        try {
            System.out.println(arr[6]);  //java.lang.ArrayIndexOutOfBoundsException
        } catch (Exception e) {
           // e.printStackTrace();
            System.out.println(e.getMessage());
        }

        // StringIndexOutOfBoundsException


        System.out.println("End of test");


    }
}
