package Java_Core_Classes.day21_ForEachLoop;

public class MinNumber {
    public static void main(String[] args) {

        int[] numbers = {80,10,20,30,40, 50, 60, 70};

        int min = numbers[0];
        for (int number : numbers) {
            if (min > number)
                min = number;
        }

        System.out.println(min);



    }
}
