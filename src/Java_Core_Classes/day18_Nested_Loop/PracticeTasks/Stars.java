package Java_Core_Classes.day18_Nested_Loop.PracticeTasks;

public class Stars {
    public static void main(String[] args) {

        int k=1;

        for (int i = 0; i < 10; i++) {

            for (int j = 0; j < k; j++) {
                System.out.print("* ");

            }
            k++;
            System.out.println();

        }
    }
}
