package Java_Core_Classes.day15_ForLoop;

public class StringMethods1 {

    public static void main(String[] args) {

        String s1 = "Cydeo";
        String s2 = "";
        String s3 = "    ";
        String s4 = "Cydeo     ";

        System.out.println("is empty: " + s1.isEmpty());
        System.out.println("is empty: " + s2.isEmpty());
        System.out.println("is blank: " + s3.isBlank());

        System.out.println("----------------------".repeat(10));

        System.out.println(s2.isBlank());
        System.out.println(s4.isBlank());
        System.out.println("----------------------".repeat(10));

        boolean r1 = s1.equalsIgnoreCase("cydeo");
        System.out.println("ignore case: " + r1);
        boolean r2 = s1.equals("cydeo");
        System.out.println(r2);

        //YES, yes, Yes, yES, YEs

        System.out.println("yEs".equals("Yes"));
        System.out.println("yEs".equalsIgnoreCase("Yes"));
        System.out.println("---------------".repeat(5));
        String sentence = "My favorite programming language is Java.";

        boolean hasPython = sentence.toLowerCase().contains("python");
        boolean hasJava = sentence.toLowerCase().contains("java");

        System.out.println("Python: " + hasPython);
        System.out.println("Java: " + hasJava);

        System.out.println("------------------------------------");

        String a = "Wooden Spoon";
        boolean result = a.startsWith("Woo");
        boolean result2 = a.startsWith("oo");
        boolean result3 = a.endsWith("Spoon");
        boolean result4 = a.toLowerCase().endsWith("oon");



        System.out.println("result = " + result);
        System.out.println("result2 = " + result2);
        System.out.println("result3 = " + result3);
        System.out.println("result4 = " + result4);


    }
}
