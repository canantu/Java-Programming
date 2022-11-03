package Java_Core_Classes.day24_CustomMethod_Return.PracticeTasks;

public class FrequencyNumberArray {
    public static void main(String[] args) {
        int[] array ={1,1,1,1,1,2,2};
        System.out.println(freqOfNumArray(array, 1));
    }

    public static int freqOfNumArray(int[] arr, int num){
        int freq = 0;
        for (int i : arr) {
            if (i == num)
                freq++;
        }
        return freq;
    }
}
