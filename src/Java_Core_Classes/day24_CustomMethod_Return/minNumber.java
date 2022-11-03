package Java_Core_Classes.day24_CustomMethod_Return;

public class minNumber {
    public static void main(String[] args) {
        int[] num = {1,3,5,2,9,6,4};
        int min = min(num);
        System.out.println("min = " + min);
    }

    public static int min(int[] num){
        int min = num[0];
        for (int i : num) {
            if (min > i)
                min = i;
        }

        return min;
    }
}
