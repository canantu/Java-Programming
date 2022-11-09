package Java_Core_Classes.day27_WrapperClasses;

public class WrapperClassMethods {
    public static void main(String[] args) {
        String str = "123";

        //parse method converts String to primitive data


        int num = Integer.parseInt(str);

        System.out.println(num + 1);
        System.out.println(str + 1);

        String str2 = "10.5";
        double num2 = Double.parseDouble(str2);
        System.out.println(num2 + 1);

        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;

        System.out.println("min = " + min);
        System.out.println("max = " + max);

        long maxLong = Long.MAX_VALUE;
        long minLong = Long.MIN_VALUE;

        System.out.println("minLong = " + minLong);
        System.out.println("maxLong = " + maxLong);


        String str3 = "true";
        boolean b1 = Boolean.parseBoolean(str3);
        System.out.println(b1);


        String str4 = "maybe";
        boolean b2 = Boolean.parseBoolean(str4);
        System.out.println(b2);  //returns false


        System.out.println("-----------------------------------");

        //valueOf method convert the String into wrapper class
        String str5 = "123";
        Integer x = Integer.valueOf(str5);  //returns Integer Object
        int y = Integer.valueOf(str5);  //unboxing

        System.out.println(x);
        System.out.println(y);

        System.out.println("-----------------------------------");

        String str6 = "10.5";
        Double d1 = Double.valueOf(str6);
        double d2 = Double.valueOf(str6);  //unboxing

        System.out.println(d1);
        System.out.println(d2);

        System.out.println("-----------------------------------");


        //isDigit()
        char ch1 = '1';
        boolean bool1 = Character.isDigit(ch1);
        System.out.println(bool1);

        char ch2 = 'A';
        boolean bool2 = Character.isLetter(ch2);
        System.out.println(bool2);

        char ch3 = '!';  //special character
        boolean bool3 = Character.isLetterOrDigit(ch3);
        System.out.println(bool3);

        char ch4 = 'C';
        boolean bool4 = Character.isUpperCase(ch4);
        System.out.println(bool4);

        char ch5 = 'c';
        boolean bool5 = Character.isLowerCase(ch5);
        System.out.println(bool5);

        System.out.println("--------------------------------------");

        String f = "12e3edfr45";
        int sum = 0;

        for(char each : f.toCharArray()){
            if (Character.isDigit(each)){
                sum += Integer.parseInt(each+"");
            }
        }
        System.out.println(sum);
    }
}
