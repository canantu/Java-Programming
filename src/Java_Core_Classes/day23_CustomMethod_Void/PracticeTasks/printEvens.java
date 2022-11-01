package Java_Core_Classes.day23_CustomMethod_Void.PracticeTasks;

public class printEvens {
    public static void main(String[] args) {
        printEven1to100();
    }

    public static void printEven1to100(){
        for (int i = 2; i <= 100; i = i+2) {
            System.out.print(i + " ");
        }
    }
}
