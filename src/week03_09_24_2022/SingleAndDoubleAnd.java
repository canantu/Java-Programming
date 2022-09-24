package week03_09_24_2022;

public class SingleAndDoubleAnd {

    public static void main(String[] args) {

        boolean result = false;

        int a = 10;

        if (result & a++ < 12) { }  // even if first condition is false, compiler check the second condition also

            System.out.println(a);


        int b = 10;

        if (result && b++ < 12) { }  //first condition is false, compiler does not check second condition
            System.out.println(b);

    }
}
