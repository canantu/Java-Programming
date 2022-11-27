package week12_11_26_2022.homework;

public class MyCalculator {

    public int a;
    public int b;

    public MyCalculator() {
    }

    public MyCalculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int add(int a, int b){
        return a+b;
    }

    public int add(){
        return a+b;
    }

    public int sub(int a, int b){
        return a - b;
    }

    public int multiply(int a, int b){
        return a * b;
    }

    public double divide(int a, int b){
        return a / b;
    }


}
