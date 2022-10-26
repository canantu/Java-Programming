package Java_Core_Classes.day21_ForEachLoop;

public class AverageNumber {

    public static void main(String[] args) {

        int[] numbers = {80,10,20,30,40, 50, 60, 70};

        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }

        double average = sum / numbers.length;

        System.out.println(average);
    }


}
