package Java_Core_Classes.day22_MultiDimensionalArray.PracticeTasks;

import java.util.Arrays;

public class PrintingArrays {
    public static void main(String[] args) {

        String[][] items = { {"Apple", "Banana", "Grape", "Avocado"},
                {"Paper Towels", "Toilet Papers", "Tissues", "Diapers"},
                {"Coke", "Fanta", "Arizona Tea", "Pepsi", "Water"} };

        for (String[] item : items) {
            for (String each : item) {
                System.out.print(each + "\t");
            }
            System.out.println();
        }

        for (String[] item : items) {
            for (int i = item.length - 1; i >= 0; i--) {
                System.out.print(item[i] + "\t");
            }
            System.out.println();
        }

        for (int i = items.length - 1; i >= 0; i--) {
            for (String each : items[i]) {
                System.out.print(each + "\t");
            }
            System.out.println();
        }

    }

}
