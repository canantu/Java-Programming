package Java_Core_Classes.day20_Arrays;

public class HighestFrequency {

    public static void main(String[] args) {

        char[] chars = {'A', 'A', 'B', 'A', 'B', 'A', 'B', 'C', 'C', 'D', 'D'};
        int max = 0;
        for (int i = 0; i < chars.length; i++) {
            char element = chars[i];
            int count = 0;

            for (int j = 0; j < chars.length; j++) {
                if (chars[j] == element)
                    count++;
            }

            if (count > max)
                max = count;
        }
        String result = "";

        for (int i = 0; i < chars.length; i++) {
            char element = chars[i];
            int count = 0;

            for (int j = 0; j < chars.length; j++) {
                if (chars[j] == element)
                    count++;
            }
            if (count == max && (!result.contains(""+element))){
                System.out.println(result += element);
            }

        }

    }
}
