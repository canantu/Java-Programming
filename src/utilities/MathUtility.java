package utilities;

public class MathUtility {

    //returns sum of two numbers
    public static int sum(int num1, int num2){
        return num1 + num2;
    }

    //returns sum of two numbers
    public static double sum(double num1, double num2){
        return num1 + num2;
    }

    //returns the maximum of two numbers
    public static int max(int num1, int num2){
        int max = num1;
        if (num1 < num2)
            max= num2;
        return max;
    }

    //returns the maximum of two numbers
    public static double max(double num1, double num2){
        double max = num1;
        if (num1 < num2)
            max= num2;
        return max;
    }

    //returns the minimum of two numbers
    public static int min(int num1, int num2){
        int min = num1;
        if (num1 > num2)
            min= num2;
        return min;
    }

    //returns the minimum of two numbers
    public static double min(double num1, double num2){
        double min = num1;
        if (num1 > num2)
            min= num2;
        return min;
    }

    //returns subtraction of two numbers
    public static int subtract(int num1, int num2){
        int max = max(num1, num2);
        int min = min(num1, num2);
        return max - min;
    }

    //returns subtraction of two numbers
    public static double subtract(double num1, double num2){
        double max = max(num1, num2);
        double min = min(num1, num2);
        return max - min;
    }

    //returns the multiplication of two numbers
    public static int multiply(int num1, int num2){
        return num1 * num2;
    }

    //returns the multiplication of two numbers
    public static double multiply(double num1, double num2){
        return num1 * num2;
    }

    //returns the division of two numbers
    public static int divide(int num1, int num2){
        return num1 / num2;
    }

    //checks if an integer is even and returns boolean
    public static boolean isEven(int num1){

        return (num1 % 2 == 0);
    }

    //checks if an integer is odd and returns boolean
    public static boolean isOdd(int num1){

        return (num1 % 2 != 0);
    }

    //returns the square of a number
    public static int square(int num1){
        return num1*num1;
    }

    //returns the square of a number
    public static double square(double num1){
        return num1*num1;
    }

    //returns the cube of a number
    public static int cube(int num1){
        return num1*num1*num1;
    }

    //returns the cube of a number
    public static double cube(double num1){
        return num1*num1*num1;
    }

}
