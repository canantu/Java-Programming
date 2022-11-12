package week10_11_12_2022;

public class WrapperIntro {
    public static void main(String[] args) {

        Integer num = 100;  //autoboxing
        int num1 = num;  //unboxing
        System.out.println(num1);

        String s1 = "100";
        int n1 = Integer.parseInt(s1);
        System.out.println(n1);

        Integer integer = Integer.valueOf("123"); //option + enter

        //what is the difference between valueOf and parseInt:
        // parseInt : string to primitive
        // valueOf: string to object



    }
}
