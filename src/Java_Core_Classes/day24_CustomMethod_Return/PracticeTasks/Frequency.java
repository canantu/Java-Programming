package Java_Core_Classes.day24_CustomMethod_Return.PracticeTasks;

public class Frequency {
    public static void main(String[] args) {
        String str = "Java java java python python java";
        String word = "java";
        int freq = frequencyOfWord(str, word);

        System.out.println("freq = " + freq);
    }

    public static int frequencyOfWord(String str, String word){
        str = str.toLowerCase();
        int count = 0;
        for (int i = 0; i < str.length() - word.length() + 1; i++) {
            String temp = str.substring(i, i + word.length());
            if (temp.equals(word))
                count++;
        }

        return count;
    }
}
