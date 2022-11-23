package utilities;

import Java_Core_Classes.day34_GarbageCollection_AccessModifiers.AccessModifiers;

public class AccessModifiersTest2 {

    public static void main(String[] args) {

        int num1 = AccessModifiers.publicData;
        System.out.println(num1);
        //int num2 = AccessModifiers.privateData;
        //int num3 = AccessModifiers.defaultData;

        // private and default are not accessible outside the package
        // only public data is accessible outside the package
    }
}
