package Java_Core_Classes.day26_CustomMethodsPractice;

public class FrequencyOfElement {

    public static void main(String[] args) {
        int[] arr = { 1,1,1,11,1,2,2,2,33,4,5,6,5,4,2,1};

        int n = frequencyOfElement(arr, 1);
        System.out.println(n);
    }

    //returns the frequency of a given element in an array
    public static int frequencyOfElement(int[] array, int element){
        int freq = 0;
        for (int each : array) {
            if (each == element)
                freq++;
        }
        return freq;
    }

    //returns the frequency of a given element in an array
    public static int frequencyOfElement(double[] array, double element){
        int freq = 0;
        for (double each : array) {
            if (each == element)
                freq++;
        }
        return freq;
    }

    //returns the frequency of a given element in an array
    public static int frequencyOfElement(char[] array, char element){
        int freq = 0;
        for (char each : array) {
            if (each == element)
                freq++;
        }
        return freq;
    }

    //returns the frequency of a given element in an array
    public static int frequencyOfElement(String[] array, String element){
        int freq = 0;
        for (String each : array) {
            if (each.equals(element))
                freq++;
        }
        return freq;
    }

}
