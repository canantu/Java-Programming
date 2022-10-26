package Java_Core_Classes.day21_ForEachLoop.PracticeTasks;

public class CommonElements {
    public static void main(String[] args) {

        int[] arr1 =  {1,2,3,4,5};
        int[] arr2=  {4,5,6,7,8};

        String result = "";

        for (int num1 : arr1) {
            for (int num2 : arr2) {
                if (num1 == num2)
                    System.out.print(num1 + " ");
            }
        }


    }
}
