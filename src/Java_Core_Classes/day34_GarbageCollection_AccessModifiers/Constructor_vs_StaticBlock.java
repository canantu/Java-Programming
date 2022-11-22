package Java_Core_Classes.day34_GarbageCollection_AccessModifiers;

public class Constructor_vs_StaticBlock {

    static {
        System.out.println("Static block");
    }

    // when there is not an object, constructor is not executed
    public Constructor_vs_StaticBlock(){
        System.out.println("Constructor block");
    }

    // main method can not be run outside the class
    public static void main(String[] args) {
        System.out.println("Main method");

        // constructor is executed five times
        new Constructor_vs_StaticBlock();
        new Constructor_vs_StaticBlock();
        new Constructor_vs_StaticBlock();
        new Constructor_vs_StaticBlock();
        new Constructor_vs_StaticBlock();
    }
}
// instance: each object has its own copy