package Java_Core_Classes.day14_String;

public class StringMethod2 {
    public static void main(String[] args) {

        String str = "Java is fun. I love learning Java";
        String str2 = str.replace("Java", "Python");

        System.out.println("str = " + str);
        System.out.println("str2 = " + str2);
        System.out.println("--------------------------------");
        String email = "JohnSmith@yahoo.com";
        String email2 = email.replace("yahoo", "gmail");

        System.out.println("email = " + email);
        System.out.println("email2 = " + email2);

        String sentence = "Java Java Python Python C# C# C# C++ C++ Python Python Python Python";
        sentence = sentence.replace("Python", "");
        sentence = sentence.replace("   ", " ").trim();
            //replace(" Python", "")
        System.out.println("sentence = " + sentence);


        String s1 = "Java";
        s1 = s1.replace("a", "e");
        System.out.println("s1 = " + s1);

        System.out.println("----------------------------------");

        String s2 = "Java Java Java";
        System.out.println(s2.replace("Java", "Python"));

        System.out.println(s2.replaceFirst("Java", "Python"));

        System.out.println(s2.replace("va", "vo"));


    }
}
