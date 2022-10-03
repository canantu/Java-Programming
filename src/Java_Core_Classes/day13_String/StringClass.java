package Java_Core_Classes.day13_String;

public class StringClass {

    public static void main(String[] args) {

        String name1 = "Wooden Spoon";
        String name2 = "Wooden Spoon";
        String name3 = "Wooden Spoon";
        String name4 = "Wooden Spoon";

        System.out.println(name1 == name2);
        System.out.println(name2 == name3);
        System.out.println(name3 == name4);

        System.out.println("--------------------");

        String s1 = "Java";
        String s2 = new String("Java");

        System.out.println(s1 == s2);  //False

        System.out.println(s1.equals(s2));  //True

        System.out.println("----------------------");

        String s3 = "Java";
        String s4 = new String("java");

        System.out.println(s3.equals(s4));  //false


    }
}
