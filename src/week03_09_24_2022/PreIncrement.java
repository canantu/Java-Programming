package week03_09_24_2022;

public class PreIncrement {

    public static void main(String[] args) {

        int x = 10;

        int number1 = x++ + 100 + x;

        System.out.println("number1 = " + number1);

        int number2 = ++x + 100;

        System.out.println("number2 = " + number2);


    }
}
