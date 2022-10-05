package Java_Core_Classes.day15_ForLoop.Practice_Tasks;

public class EvenNumbers {
    public static void main(String[] args) {

        int sum  = 0 ;

        for(int i=2; i<=100; i += 2){
            System.out.print(i + " ");
            sum += i;
        }


        System.out.println("\nsum = " + sum);
    }
}
