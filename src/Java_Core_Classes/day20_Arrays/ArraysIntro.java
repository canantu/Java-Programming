package Java_Core_Classes.day20_Arrays;

import java.util.Arrays;

public class ArraysIntro {
    public static void main(String[] args) {

        //String[] names1;  // String names[];
        String[] names = new String[5];    //class name: Arrays, package: java.util
        names[0] = "Canan";
        names[1] = "Neira";
        names[2] = "Hulya";
        names[3] = "Suat";
        names[4] = "Muhtar";
        // names[5] = "Mikael";  out of bounds error

        System.out.println(Arrays.toString(names));

        String myGroup[] = new String[5];
        for (int i = 0; i < 5; i++) {

            myGroup[i] = "*";

        }
        System.out.println(Arrays.toString(myGroup));

        System.out.println("--------------------------------");

        int[] numbers = {1,2,3,4,5};
        String[] days = {"monday", "tuesday", "wednesday", "thursday", "friday", "saturday", "sunday"};
        System.out.println(Arrays.toString(days));

        int num = 5;
        if (num < 1 || num > 7 ){
            System.err.println("invalid input");
            System.exit(0);
        }

        System.out.println(days[num - 1]);

        System.out.println("-------------------------------------");

        String months[] = {"jan", "feb", "march", "ap", "may", "june", "july", "aug", "sep", "oct", "nov", "dec"};

        int monthNumber = 12;

        if (monthNumber < 1 || monthNumber > 12){
            System.err.println("invalid input");
            System.exit(0);
        }

        System.out.println(months[monthNumber - 1]);


    }
}
