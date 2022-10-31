package Java_Core_Classes.day22_MultiDimensionalArray;

import java.util.Arrays;

public class MultiDimensionalArrayIntro {

    public static void main(String[] args) {

        String[][] groups = new String[3][];


        String[] group1 = {"John", "Joe", "James"};
        String[] group2 = {"Aaron", "Samuel", "Jacob"};
        String[] group3 = {"Ali", "Abraham", "Jonas"};


        groups[0] = group1;
        groups[1] = group2;
        groups[2] = group3;

        System.out.println(Arrays.toString(groups)); //toString method is for single dimensional arrays
        System.out.println(Arrays.deepToString(groups));
        System.out.println("------------------------------------------------");
        /*
        {1,2,3}
        {4,5,6,7}
        {7,8,0,8,7,5}
         */

        int[][] arr2D = {{1,2,3}, {4,5,6,7}, {7,8,9,0,1}};

        System.out.println(Arrays.toString(arr2D[1]));
        System.out.println(arr2D[2][4]);





    }
}
