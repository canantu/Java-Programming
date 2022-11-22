package Java_Core_Classes.day34_GarbageCollection_AccessModifiers;

// with static import specific members can be reached
import static Java_Core_Classes.day33_Statics.Employee.*;
import static Java_Core_Classes.day33_Statics.Iphone.*;

public class StaticImport {

    public static void main(String[] args) {
        System.out.println(brand);
        System.out.println(hasBattery);
        System.out.println(isHuman);
        System.out.println(hasFaceTime);

        // static variables can be directly called with static import
    }
}
