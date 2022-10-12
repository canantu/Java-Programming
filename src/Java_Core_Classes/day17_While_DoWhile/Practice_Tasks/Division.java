package Java_Core_Classes.day17_While_DoWhile.Practice_Tasks;

public class Division {
    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 3;
        int count = 0;

        while(num1 >= num2){

            num1 = num1 - num2;
            count++;
        }
        System.out.println("Division is " + count);
        System.out.println("Remainder is " + num1);



    }
}
