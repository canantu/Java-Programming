package Java_Core_Classes.day23_CustomMethod_Void;

public class CustomMethodPractice {

    public static void main(String[] args) {

        helloWorld5Times();
        helloCydeo5Times();
        evenNumbers();
    }


    public static void helloWorld5Times(){

        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World!");
        }
    }

    public static void helloCydeo5Times(){

        for (int i = 0; i < 5; i++) {

            System.out.println("Hello Cydeo");
        }
    }
    //create a method that can print all the even numbers from 1-10
    public static void evenNumbers(){
        for (int i = 2; i <= 10; i= i+2) {
            System.out.print(i + " ");
        }
    }

}
