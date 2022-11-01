package Java_Core_Classes.day23_CustomMethod_Void;

public class CustomMethodWithParameters {

    public static void main(String[] args) {

        checkEvenOrOdd(10);
    }


    //create a method that can check if a number is odd or even

    public static void checkEvenOrOdd(int num){

        if (num % 2 == 0)
            System.out.println("it is even");
        else
            System.out.println("it is odd");
    }
}
