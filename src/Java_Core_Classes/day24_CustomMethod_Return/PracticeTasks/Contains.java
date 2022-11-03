package Java_Core_Classes.day24_CustomMethod_Return.PracticeTasks;

public class Contains {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int num = 7;
        System.out.println(contains(arr, num));
    }

    public static boolean contains(int[] arr, int num){
        int count = 0;
        boolean result = true;
        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];
            if (temp == num)
                count++;
        }
        if (count == 0)
            result = false;

        return result;

    }
}
