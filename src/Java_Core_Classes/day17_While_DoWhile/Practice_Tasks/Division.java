package Java_Core_Classes.day17_While_DoWhile.Practice_Tasks;

public class Division {
    public static void main(String[] args) {

        int num1 = 5;
        int num2 = 31;
        int count = 0;

        int max = num1;
        int min = num2;

        if(num2 > num1){
            max= num2;
            min = num1;
        }
        while(max >= min){

            max = max - min;
            count++;
        }
        System.out.println("Division is " + count);
        System.out.println("Remainder is " + max);



    }
}
