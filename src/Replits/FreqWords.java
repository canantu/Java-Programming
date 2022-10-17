package Replits;

import java.util.Scanner;

public class FreqWords {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine().toLowerCase();

        //WRITE YOUR CODE BELOW
        int javaCount = 0;
        int pythonCount = 0;

        while(true){

            if(sentence.contains("java")){
                sentence = sentence.replaceFirst("java", "");
                javaCount++;
            }
            if(sentence.contains("python")){
                sentence = sentence.replaceFirst("python", "");
                pythonCount++;
            }

            if(!(sentence.contains("java") || sentence.contains("python")))
                break;

        }
        if(javaCount == pythonCount)
            System.out.println("true");
        else System.out.println("false");

        scan.close();



    }
}
