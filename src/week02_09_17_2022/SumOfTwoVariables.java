package week02_09_17_2022;

public class SumOfTwoVariables {

    public static void main(String[] args) {

        int firstNum = 12;
        int secondNum = 23;

        int sum = firstNum + secondNum;

        System.out.println("firstNum + secondNum = " + sum); //concatenation
        System.out.println("firstNum + secondNum = " + firstNum + secondNum); //concatenation left to right
        // compiler works up to bottom, left to right
        System.out.println("firstNum + secondNum = " + (firstNum + secondNum)); //parenthesis has priority
        System.out.println(firstNum + " + " + secondNum + " = " + sum); //concatenation
        System.out.println(sum);
        System.out.println("sum = " + sum);  //soutv

        int a = 30;
        String s = "30";

        String s2 = s + a;  // option (alt) + enter

        String s1 = s + a;

        // cmd + alt + L   --- formatting code

    }
}
