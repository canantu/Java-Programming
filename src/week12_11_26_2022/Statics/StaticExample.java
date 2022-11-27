package week12_11_26_2022.Statics;

public class StaticExample {

    static {
        System.out.println("first static");
    }

    static {
        System.out.println("second static");
    }

    public static void main(String[] args) {
        System.out.println("main method");
        staticMethod();
    }

    public static void staticMethod(){
        System.out.println("static method");
    }
    static {
        System.out.println("third static");
    }
}
