package Java_Core_Classes.day34_GarbageCollection_AccessModifiers;

public class AccessModifiersTest {
    public static void main(String[] args) {

        System.out.println(AccessModifiers.defaultData);
        System.out.println(AccessModifiers.publicData);
        //System.out.println(AccessModifiers.privateData);
        // private is not reachable outside the class

        AccessModifiers.method1(); // public is visible
        AccessModifiers.method2(); // default is visible outside the class
       // AccessModifiers.method3(); // private is not visible outside the class
    }
}
