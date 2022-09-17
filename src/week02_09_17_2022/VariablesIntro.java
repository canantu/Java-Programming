package week02_09_17_2022;

public class VariablesIntro {

    public static void main(String[] args) {


        /*

        Variable Types:
        1- primitives
            - numerical primitives
                double > float > long > int > short > byte
            - boolean
            - char  (we declare char in single quote 'a' )

        2- non-primitives
        String  ( we declare string in double quote "adam")

        How to declare variables:
        int age = 12
        char gender = 'F'

        byte = 1 byte, short = 2 bytes, int = 4 bytes, long = 8 bytes
        1 byte = 8 bits
        1 bit is 0 or 1

       */

        int age = 38; // default data type for compiler ist integer
        short myShort = 12;  //implicit casting, automatically done by compiler
        long myLong = 12_345_678_931L;
        double myDouble = 25.5;
        double myDouble1 = 25;
        float myFloat = 12.5F; // default data type for compiler is double
        //float myFloat = (float) 12.5 //explicit casting done by developer manually
        // casting is about data types

        System.out.println(myDouble1);
        System.out.println(myFloat);
        System.out.println(myLong);

        long l = 20;
        int i = (int) l;

        double d = 20;
        float f = (float) d;

        double d1 = l; //implicit casting

        // addition
        /*
        int + int  = int
        double + int = double
        int + short = int

        */
        //concatenation
        /*
            String + anything = String
            123 + Adam = 123Adam ---> String

        */
        System.out.println(12+23+"Adam");
        System.out.println("12+23+Adam");
    }

}
