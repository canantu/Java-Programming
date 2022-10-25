package Java_Core_Classes.day20_Arrays;

public class AppearedTwice {

    public static void main(String[] args) {

        char[] chars = {'A', 'B', 'A', 'B', 'A', 'B', 'C', 'C', 'D', 'D'};

        for (int i = 0; i < chars.length; i++) {
            char ch = chars[i];
            int count = 0;

            for (int j = 0; j < chars.length; j++) {
                if (chars[j] == ch)
                    count++;
            }

            if (count == 2)
                System.out.println(ch);
        }
    }
}
