package week16_12_24_2022.Exceptions;

import javax.naming.PartialResultException;

public class MultiCatchBlock {
    public static void main(String[] args) {


        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("checked exception");
        }


        try{
            System.out.println(9/0);  // first throw arithmetic exception
            Integer.parseInt("123 .");
        }catch (ArithmeticException e){
            e.printStackTrace();
        }catch (NumberFormatException e){
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }

        try{
            Integer.parseInt("123 ."); //first throw number format exception
            System.out.println(9/0);
        }catch (NumberFormatException e){
            e.printStackTrace();
        }catch (ArithmeticException e){
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }

        System.out.println("End of test");

    }
}
