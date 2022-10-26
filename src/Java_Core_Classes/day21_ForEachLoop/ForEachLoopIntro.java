package Java_Core_Classes.day21_ForEachLoop;

public class ForEachLoopIntro {

    public static void main(String[] args) {

        int[] numbers = {10,20,30,40, 50, 60, 70};

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        System.out.println();
        for (int each: numbers) { //foreach loop is fastest in terms of reaching the elements of arra
            System.out.print(each + " ");
        }









    }
}
