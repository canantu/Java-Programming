package Java_Core_Classes.day21_ForEachLoop.PracticeTasks;

public class CountEvenAndOdd {

    public static void main(String[] args) {

        int[] numbers = {12,51,23,72,85,63,30,92,33,47};

        int countEven = 0;
        int countOdd = 0;

        for (int number : numbers) {
            if (number % 2 == 0)
                countEven++;
            else countOdd++;
        }

        System.out.println("countOdd = " + countOdd);
        System.out.println("countEven = " + countEven);
    }
}
