package week13_12_03_2022;

public class GarbageCollection {

    public static void main(String[] args) {

        // making objects unreferenced
        String str = "Mesut";
        str = null;  //"Mesut" object is now unreferenced

        String str1 = "Osman";  // now this is unreferenced, str1 points another object
        str1 = "Adam";



    }
}
