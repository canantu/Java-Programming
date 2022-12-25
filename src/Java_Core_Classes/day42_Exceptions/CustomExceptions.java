package Java_Core_Classes.day42_Exceptions;

// unchecked exception
class FadyException extends RuntimeException{
    public FadyException(String message) {
        super(message);
    }

    public FadyException() {
        super("Time for a short break");
    }

    // 2 constructors
}

// checked exception
class NoBreakException extends Exception{

}




public class CustomExceptions {
    public static void main(String[] args) {

       // throw new FadyException("It's time for lunch break");

        try {
            throw new NoBreakException();
        } catch (NoBreakException e) {
            e.printStackTrace();
        }
    }

}
