package week05_10_08_2022;

public class StringIntro {
    public static void main(String[] args) {

        String str1 = "Kazim";
        String str2 = "Kazim";
        System.out.println( str1 == str2);

        String str3 = new String("Kazim");
        String str4 = new String("Kazim");
        System.out.println( str3 == str4);

        System.out.println( str1 == str3);
     }
}
