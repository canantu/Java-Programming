package Java_Core_Classes.day21_ForEachLoop;

public class MaxNumber {

    public static void main(String[] args) {

        int[] numbers = {80,10,20,30,40, 50, 60, 70};

        int max = numbers[0];

        for (int number : numbers) {
            if (max < number)
                max = number;
        }

        System.out.println(max);


    }
}
