package Java_Core_Classes.day27_WrapperClasses;

public class WrapperClassIntro {
    public static void main(String[] args) {
        int n1 = 100;
        Integer num1 = n1; //autoboxing -> primitive to object
        //Long num2 = n1; compile error, accepts only its primitive data type
        int n2 = num1; //unboxing -> object to primitive

        System.out.println("----------------------------------------");

        Integer integerValue = 100;
        long longValue = integerValue;

        int intNum = 100;
        //Long longNum = intNum; compile error
        //Double doubleNum = intNum;  compile error
        Integer integerN = intNum;

        System.out.println("--------------------------------------------");

        Byte b1 = 25;
        byte a1 = b1;
        short a2 = b1;
        int a3 = b1;
        long a4 = b1;

        System.out.println("--------------------------------------------");

        Integer i1 = 200;
        Integer i2 = i1;

        System.out.println("--------------------------------------------");

        int[] arr1 = {1,2,3,4,5};
        Integer[] arr2 = {1,2,3,4,5};





    }
}
