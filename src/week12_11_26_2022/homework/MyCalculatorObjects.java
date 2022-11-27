package week12_11_26_2022.homework;

public class MyCalculatorObjects {
    public static void main(String[] args) {

        MyCalculator calc1 = new MyCalculator();

        System.out.println(calc1.add(1, 2));

        MyCalculator calc2 = new MyCalculator(1,2);
        System.out.println(calc2.add());
    }
}
