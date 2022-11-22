package Java_Core_Classes.day34_GarbageCollection_AccessModifiers;

public class StaticBlock {

    public static void main(String[] args) {
        System.out.println("main method");
    }
    // if there is a static block, it is executed first by compiler as soon as the class is loaded
    // static is used for initialization static variables, that have only one copy
    // one static block is enough to initialize all static variables, no need to define more static blocks
    // static block is not called more than one time
    // constructor is called more than one time
    // constructor is not for static variables, not efficient, consumes memory, only for instances
    static {
        System.out.println("Static block 1");
    }

    static {
        System.out.println("Static block 2");
    }
}
