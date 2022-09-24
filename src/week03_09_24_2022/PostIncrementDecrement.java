package week03_09_24_2022;

public class PostIncrementDecrement {

    public static void main(String[] args) {

        int a =5;
        System.out.println("a = " + a);
        System.out.println("a++ = " + (a++));
        System.out.println("a = " + a);
        System.out.println("++a = " + (++a));

        int b = 10;
        int x;
        System.out.println("b-- = " + (b-=1));
        System.out.println("b-- = " + b--);
        System.out.println("b-- = " + b--);
        System.out.println("b-- = " + (b-=1));
    }
}
