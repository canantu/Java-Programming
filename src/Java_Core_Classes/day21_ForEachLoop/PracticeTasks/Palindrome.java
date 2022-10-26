package Java_Core_Classes.day21_ForEachLoop.PracticeTasks;

public class Palindrome {

    public static void main(String[] args) {

        String[] words = {"anna", "level", "Java", "elle", "kavak", "ulu", "cydeo"};

        int count = 0;
        for (String word : words) {

            String reversed = "";
            for (int i = word.length() -1; i >= 0; i--) {
                reversed += word.charAt(i);
            }

            if (word.equals(reversed))
                count++;
        }

        System.out.println("count = " + count);


    }
}
