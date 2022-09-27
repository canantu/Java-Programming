package Java_Core_Classes.day11_Switch_Scanner;

public class Calculator {
    public static void main(String[] args) {
        double n1 = 200.5, n2 = 10.5;
        double result = 0;
        char operator = 'ä';

        boolean validOperator = operator == '+' || operator == '-' || operator == '/' || operator == '*';

        if (validOperator){

            switch (operator){

                case '+':
                    result = n1 + n2;
                    break;
                case '-':
                    result = n1 - n2;
                    break;
                case '/':
                    result = n1 / n2;
                    break;
                default:
                    result = n1 * n2;
            }
            System.out.println(result);
        }else System.err.println("Invalid operator");









    }

}
