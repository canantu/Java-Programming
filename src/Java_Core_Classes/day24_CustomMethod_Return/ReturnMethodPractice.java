package Java_Core_Classes.day24_CustomMethod_Return;

public class ReturnMethodPractice {

    public static void main(String[] args) {
        int result = max(4,8);
        System.out.println(result * 2);
    }

    public static int max(int num1, int num2){
        int max = num1;
        if (num1 < num2)
            max = num2;
        return max;
    }


}
