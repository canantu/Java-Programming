package Java_Core_Classes.day23_CustomMethod_Void.PracticeTasks;

public class printOdds {

    public static void main(String[] args) {
        printOdd1to100();
    }

    public static void printOdd1to100(){
        for (int i = 1; i < 100; i = i+2) {
            System.out.print(i + " ");
        }
    }



}
