package week05_10_08_2022;

public class StringMethods3 {

    public static void main(String[] args) {

        String emptyWord = " ";
        System.out.println(emptyWord.isEmpty());
        System.out.println("----------------------------------");

        String str = "Adam";
        System.out.println(str.repeat(4));
        System.out.println("----------------------------------");

        String blankWord = "  ";
        System.out.println(blankWord.isBlank());
        System.out.println("----------------------------------");

        String str1 = "Canan";
        String str2 = "canan";
        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println("----------------------------------");

        String str3 = "Java is a good language.";
        System.out.println(str3.startsWith("Java"));
        System.out.println(str3.endsWith("ge."));

        System.out.println(str3.contains("good"));


    }
}
