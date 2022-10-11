package Java_Core_Classes.day17_While_DoWhile;

public class Frequency_WhileLoop {
    public static void main(String[] args) {

        String str = "Java Java python python".toLowerCase();

        int freq = 0;

        while(str.contains("java")){

            str = str.replaceFirst("java", "");
            freq++;
        }
        System.out.println("freq = " + freq);

        System.out.println("---------------------------------");

        String sentence = "cat car cat cat car dog dog cat dog".toLowerCase();
        int countCat = 0;

        while (sentence.contains("cat")){

            sentence = sentence.replaceFirst("cat", "");
            countCat++;
        }

        System.out.println("countCat = " + countCat);

        System.out.println("-----------------------------------");

        String s = "java java java python python".toLowerCase();
        int countJava = 0;
        int countPython = 0;

        while(s.contains("java") || s.contains("python")){

            if(s.contains("java")){
                s = s.replaceFirst("java", "");
                countJava++;
            }
            if(s.contains("python")){
                s = s.replaceFirst("python", "");
                countPython++;
            }

        }
        System.out.println("countJava = " + countJava);
        System.out.println("countPython = " + countPython);



    }
}
