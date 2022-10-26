package Java_Core_Classes.day21_ForEachLoop.PracticeTasks;

public class NumberOfAppearances {

    public static void main(String[] args) {

        String[] words = {"java", "java", "python", "python", "python", "C#", "javascript"};
        String result = "";

        for (String each : words) {
            int count = 0;
            for (String word : words) {
                if (each.equals(word))
                    count++;
            }
            if (!result.contains(each)){
                result += each;
                System.out.println(each + " appears " + count + " times.");
            }

        }
    }

}
