package Java_Core_Classes.day41_Exceptions;

public class FinallyBlock {
    public static void main(String[] args) {
        int arr[]  = {1,2,3};
        try{
            System.out.println(arr[4]);
            System.out.println("Try block");
        }catch (RuntimeException e){
            System.out.println("Catch block");
            e.printStackTrace();
            //System.exit(0); // to prevent finally block to execute
        }finally{ //always get executed
            System.out.println("finally block");
        }


    }
}
