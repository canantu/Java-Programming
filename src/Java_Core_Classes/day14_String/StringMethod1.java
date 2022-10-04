package Java_Core_Classes.day14_String;



public class StringMethod1 {
    public static void main(String[] args) {



        String str1 = "   batch    25   ";
        str1 = str1.trim();// trim() method only removes white spaces that are not between characters

        System.out.println("str1 = " + str1);
        System.out.println("-------------------");


        String str2 = "Cydeo School";
        int index1 = str2.indexOf('h');
        System.out.println("index1 = " + index1);

        int index2 = str2.indexOf("o");
        System.out.println("index2 = " + index2);

        int index3 = str2.indexOf("ool");//index of first o
        System.out.println("index3 = " + index3);

        String str3 = "Java Programming Language";
        int index4 = str3.indexOf("amm");  //unique occurrence combinations as argument
        System.out.println("index4 = " + index4);

        int index5 = str3.indexOf("gua");//to make it unique, add the character in the order
        System.out.println("index5 = " + index5);

        int index6 = str3.lastIndexOf("g"); //starts to search from the end
        System.out.println("index6 = " + index6);

        System.out.println("-------------------");

        String s = "Java Nova Cava Wawa orange";
        int firstA = s.indexOf("a");
        int lastA = s.lastIndexOf("a");
        int secondA = s.indexOf("a ");
        int thirdA = s.indexOf("a C");
        //int fourthA = s.indexOf("ava W");
        //int fourthA = s.lastIndexOf("av");
        int fourthA = s.indexOf("Ca") +1;
        //int fifthA = s.lastIndexOf("a W");
        int fifthA = s.lastIndexOf("va") +1;

        int sixthA = s.lastIndexOf("aw");
        int seventhA = s.lastIndexOf("a ");
        //int seventhA = s.indexOf("a o");

        System.out.println("firstA = " + firstA);
        System.out.println("lastA = " + lastA);
        System.out.println("secondA = " + secondA);
        System.out.println("thirdA = " + thirdA);
        System.out.println("fourthA = " + fourthA);
        System.out.println("fifthA = " + fifthA);
        System.out.println("sixthA = " + sixthA);
        System.out.println("seventhA = " + seventhA);









    }
}
