package Java_Core_Classes.day17_While_DoWhile;

public class FrequencyWord {

    public static void main(String[] args) {
        String str = "JavaJavaJava";

        int frequency = 0;
        for (int i = 0; i <= str.length()-4; i++) {
            String eachSub = str.substring(i, i+4);
            if(eachSub.equals("Java"))
                frequency++;

        }
        System.out.println("frequency = " + frequency);
    }
}
