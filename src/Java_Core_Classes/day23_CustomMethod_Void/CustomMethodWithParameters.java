package Java_Core_Classes.day23_CustomMethod_Void;

public class CustomMethodWithParameters {

    public static void main(String[] args) {

        checkEvenOrOdd(10);
        ageOfPerson(1996);
        printNumbers(8, 3);
    }


    //create a method that can check if a number is odd or even

    public static void checkEvenOrOdd(int num){

        if (num % 2 == 0)
            System.out.println("it is even");
        else
            System.out.println("it is odd");
    }

    public static void ageOfPerson(int birthYear){
        int age = 2022 - birthYear;
        System.out.println("Your age is " + age);
    }

    public static void printNumbers(int x, int y){
        int max = x;
        int min = y;
        if (x < y){
            max = y;
            min = x;
        }
        for (int i = min; i <= max; i++) {
            System.out.print(i + " ");
        }
    }




}
