package week17_12_31_2022;

public class CustomException {
    public static void main(String[] args) {
        try{
            System.out.println(3/0);
        }catch (Exception e){
            throw new CustomArithmeticException();
        }
    }
}
