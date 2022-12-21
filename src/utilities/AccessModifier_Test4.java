package utilities;

import Java_Core_Classes.day40_FinalKeyword.ProtectedAccessModifier;

public class AccessModifier_Test4 extends ProtectedAccessModifier {

    public static void main(String[] args) {

        System.out.println(name2);
        // System.out.println(ProtectedAccessModifier.name1);
        // default is not visible outside the package

       // AccessModifier_Test4.method1();  not visible because default
        AccessModifier_Test4.method2();
    }
}
