package Java_Core_Classes.day34_GarbageCollection_AccessModifiers;

public class StaticMembers {

    public static int num = 100;

    public static void method(){

    }

    static {

    }


}

// if the class is nested class, we can define a static class
// inner class can be static, outer class can not be static
// to be static, it must be a member of a class
// statics are reached through the class name

class outerClass{  // has default access modifier

    static class innerClass{

        public static void method1(){

        }

    }

}
