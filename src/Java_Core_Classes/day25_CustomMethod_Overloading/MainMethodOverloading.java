package Java_Core_Classes.day25_CustomMethod_Overloading;

public class MainMethodOverloading {
    public static void main(String[] args) {
        System.out.println("String");
    }
    public static void main(int[] args) {
        System.out.println("int");
    }
    public static void main(double[] args) {
        System.out.println("double");
    }
    public static void main(char[] args) {
        System.out.println("char");
    }
//even if main method can also be overloaded, jvm only executes build in main method with String argument
}
