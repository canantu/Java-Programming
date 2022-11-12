package week10_11_12_2022;

public class MethodOverloadingIntro {
    public static void main(String[] args) {

        int i = 23;
        double d = 24.5;
        float f = 23.5f;

        System.out.println(sum(i, d));
        sum(d, i);
        sum(d, f);

    }
    private static void sum(double d, float f){
        System.out.println(d + f);
    }

    public static void sum(double d, int i){
        System.out.println(i + d);
    }

    public static double sum(int i, double d){
        return d+i;
    }

    //compile error, because we should change parameters, changing only return type is not enough
    /*
    public static void sum(int i, double d){
        System.out.println(d + i);
    }
    */



}
