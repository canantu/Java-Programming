package Java_Core_Classes.day34_GarbageCollection_AccessModifiers;

public class AccessModifiers {

    public static int publicData = 100;
    static int defaultData = 200;   // no need to write default, no access modifier
    private static int privateData = 300;

    public static void main(String[] args) {

        System.out.println(publicData);
        System.out.println(defaultData);
        System.out.println(privateData);


    }
}
