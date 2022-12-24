package Java_Core_Classes.day42_Exceptions;

public class DisadvantageOfThrowsKeyword {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("Hello");
        sleep(1);
        System.out.println("Hello World");

        System.out.println("---------------------------------");

        System.out.println("Hello");
        MorningWorkOut.sleep(1);
        System.out.println("Cydeo");


    }

    // if the method uses throws keyword, every method that calls this method should handle the exception
    // if main method uses throws keyword, no problem. because it is not callable.
    // if custom method uses throws keyword, the method that calls custom method should deal with exception
    // it is best to use try-catch block in a custom method

    public static void sleep(double seconds) throws InterruptedException {

            Thread.sleep( (long)(1000 * seconds) );  // explicit casting double to long


    }


}
