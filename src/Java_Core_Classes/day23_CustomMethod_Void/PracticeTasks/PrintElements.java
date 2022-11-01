package Java_Core_Classes.day23_CustomMethod_Void.PracticeTasks;

public class PrintElements {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,0};
        printEachElement(array);
    }

    public static void printEachElement(int[] array){

        for (int each : array) {
            System.out.print(each + " ");
        }
    }
}
