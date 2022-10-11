package Java_Core_Classes.day17_While_DoWhile;

public class LoopPractices {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) { //if we know how many times to repeat loop, it is best to use for loop
            System.out.print(i);
        }
        System.out.println();
        int count = 1;
        while (count<=10){
            System.out.print(count);
            count++;
        }
        System.out.println();
        int num = 1;
        do {
            System.out.print(num);
            num++;
        }while (num<=10);


    }
}
