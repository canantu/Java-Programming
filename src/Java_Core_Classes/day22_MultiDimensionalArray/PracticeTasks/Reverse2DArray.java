package Java_Core_Classes.day22_MultiDimensionalArray.PracticeTasks;

import java.util.Arrays;

public class Reverse2DArray {
    public static void main(String[] args) {

        int[][] array = { {1,2,3}, {4,5,6}};
        int[][] reverse = new int[array.length][];


        for (int i = array.length - 1, i1 = 0; i >= 0; i--, i1++) {
            reverse[i1] = new int[array[i].length];  // we have to define 1D arrays, otherwise nullpointerexception
            for (int j = array[i].length - 1, j1 = 0; j >= 0; j--, j1++) {
                reverse[i1][j1] = array[i][j];
            }
        }

        System.out.println(Arrays.deepToString(reverse));

    }
}
