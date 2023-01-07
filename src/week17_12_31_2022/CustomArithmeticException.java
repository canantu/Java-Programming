package week17_12_31_2022;

public class CustomArithmeticException extends ArithmeticException {

    public CustomArithmeticException() {
        super("Invalid Divider: Can not divide by 0");
    }
}

