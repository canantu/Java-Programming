package Java_Core_Classes.day42_Exceptions;

import Java_Core_Classes.day39_Recap.ShapeTask.Rectangle;

import java.util.NoSuchElementException;

public class ThrowKeyword2 {
    public static void main(String[] args) {

      //  throw new InterruptedException();
        // checked exception must be handled at compile time

        // unchecked exception
        throw new NoSuchElementException("There is no such element as break");
        // we can give a string message as an argument for exception constructor

       // throw new Rectangle(5, 6);
        // we should use a Throwable constructor with throw keyword

     //   System.out.println("Hello world!");  // this is unreachable because of the exception



    }
}
