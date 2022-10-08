package Java_Core_Classes.day15_ForLoop.Practice_Tasks;

public class PrimeNumber {

    public static void main(String[] args) {

        int number = 119;
        int count =0;

        for (int i =2; i<number/2;i++){
            if(number % i == 0  ) {
                count = 1;
                break;
            }

        }
        if (count != 0)
            System.out.println("It is not prime");
        else System.out.println("It is prime");


    }
}
