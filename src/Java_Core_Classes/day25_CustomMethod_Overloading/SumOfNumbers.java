package Java_Core_Classes.day25_CustomMethod_Overloading;

public class SumOfNumbers {
    public static void main(String[] args) {
        System.out.println(sum(3,5));
        System.out.println(sum(3,4,5));
        System.out.println(sum(4.7, 5.6));
        System.out.println(sum(4.7, 5.6, 7.3));
    }
//parameters must be different each time for overloading
    public static int sum(int a, int b){
        return a +b;
    }

    public static int sum(int a, int b, int c){
        return a + b + c;
    }

    public static double sum(double a, double b){
        return a + b;
    }

    public static double sum(double a, double b, double c){
        return sum(a,b) + c;
    }

}
