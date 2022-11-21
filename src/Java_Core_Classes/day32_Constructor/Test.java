package Java_Core_Classes.day32_Constructor;

public class Test {

    public Test(){ // A
        System.out.println("A");
    }
    public Test(int a){ // A  B
        this();
        System.out.println("B");
    }
    public Test(double a){ // A B C
        this(10);
        System.out.println("C");
    }

    public Test(String str){ // A B C D
        this(10.0);
        System.out.println("D");
    }

    public static void main(String[] args) {

        System.out.println("------------- int argument ----------------");
        new Test(10);
        System.out.println("--------------double argument ---------------");
        new Test(2.5);
        System.out.println("--------------string argument ---------------");
        new Test("Java");

    }


}
