package Java_Core_Classes.day22_MultiDimensionalArray;

import java.util.Arrays;

public class MultiDimensionalArray2 {
    public static void main(String[] args) {

        int[] arr1 = {1,2,3};
        int[] arr2 = {4,5,6};
        int[] arr3 = {7,8,9};

        int[][] arr2D = {arr1, arr2, arr3};
        //3 dimensional array
        //                      0           1       2           0           1           2
        int[][][] arr3D = { { {1,2,3}, {4,5,6}, {7,8,9} }, { {10,20,30}, {40,50,60}, {70,80,90} } };
       //                                   0                               1

        System.out.println(Arrays.deepToString(arr3D));

        for (int i = 0; i < arr3D.length; i++) {
            System.out.print(Arrays.deepToString(arr3D[i]));
            System.out.println();
        }

        System.out.println("-----------------------------------");
        for (int i = 0; i < arr3D.length; i++) {
            for (int j = 0; j < arr3D[i].length; j++) {
                System.out.print(Arrays.toString(arr3D[i][j]) + " ");
            }
            System.out.println();
        }

        System.out.println("------------------------------------");
        for (int i = 0; i < arr3D.length; i++) {
            for (int j = 0; j < arr3D[i].length; j++) {
                for (int k = 0; k < arr3D[i][j].length; k++) {
                    System.out.print(arr3D[i][j][k] + " ");
                }
                System.out.println();
            }
        }

        System.out.println("------------------------------------------");
        //foreach loop

        for (int[][] each2D : arr3D) {
            for (int[] each1D : each2D) {
                for (int eachElement : each1D) {
                    System.out.print(eachElement + " ");
                }
                System.out.println();
            }

        }

        System.out.println("----------------------------------------------");
        int[][][][] arr4D = { { { {1,2,3}, {4,5,6}, {7,8,9} }, { {10,20,30}, {40,50,60}, {70,80,90} } } };

        //[3d][2d][1d][element]

        for (int[][][] each3D : arr4D) {
            System.out.println(Arrays.deepToString(each3D));
            for (int[][] each2D : each3D) {
                System.out.println(Arrays.deepToString(each2D));
                for (int[] each1D : each2D) {
                    System.out.println(Arrays.toString(each1D));
                    for (int eachElement : each1D) {
                        System.out.print(eachElement + " ");
                    }
                    System.out.println();
                }
            }
        }


    }
}
