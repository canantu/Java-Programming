package week02_09_17_2022;

public class BasicCalculator {

    public static void main(String[] args) {

        int num1, num2;
        num1 = 20;
        num2 = 50;

        int sum = num1 + num2;
        int subtract = num1 - num2;
        int multiply = num1 * num2;
        double division = (double) num1 / num2;
        int remainder = num1 % num2;

        System.out.println("sum = " + sum);
        System.out.println("subtract = " + subtract);
        System.out.println("multiply = " + multiply);
        System.out.println("division = " + division);
        System.out.println("remainder = " + remainder);



    }
}
