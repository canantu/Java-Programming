package Java_Core_Classes.day42_Exceptions;

public class MorningWorkOut {

    public static void main(String[] args) {

        System.out.println("--------Push up started-----------");

        for (int i = 1; i <= 30; i++) {
            System.out.print("\rPush up " + i);
            sleep(0.5);
        }

        System.out.println("\n--------Push up completed---------");

        System.out.println("--------Pull up started-----------");

        for (int i = 1; i <= 20; i++) {
            System.out.print("\rPull up " + i);
            sleep(0.5);
        }

        System.out.println("\n--------Pull up completed---------");

    }


    // custom sleep method to handle exceptions in method definition
    public static void sleep(double seconds){
        try {
            Thread.sleep( (long)(1000 * seconds) );  // explicit casting double to long
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
