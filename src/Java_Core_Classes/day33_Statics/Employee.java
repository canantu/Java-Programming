package Java_Core_Classes.day33_Statics;

public class Employee {

    // if one copy of that variable is enough for all the objects

    public String name;  // it can not be static since all objects can have different names
    public double salary; // also not static
    public static boolean isHuman = true;  // it can be static as there is one company name for all employees



}
