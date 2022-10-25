package Java_Core_Classes.day20_Arrays;

public class FindMin {
    public static void main(String[] args) {

        int numbers[] = {10,2,3,4,5};
        int min = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (min > numbers[i])
                min = numbers[i];
        }

        System.out.println(min);
    }
}
