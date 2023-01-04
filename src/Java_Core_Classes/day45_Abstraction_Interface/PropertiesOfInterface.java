package Java_Core_Classes.day45_Abstraction_Interface;

public interface  PropertiesOfInterface {

  //  private int a = 100;  // can not be private

    static int b = 100;  // should be initialized


/*   no constructor
    public PropertiesOfInterface(int a) {
        this.a = a;
    }

 */

    /*  static blocks belong to classes

    static {
        b = 100;
    }

     */

/*  instance methods are not available

    public void method1(){
        System.out.println("instance method");
    }

 */

    public static void method2() {
        System.out.println("static method");   //no need to implement in child class
    }

    void method3();   //should be implemented

    // if the implementation is same for all subclasses,
    // we introduce default method, because interface can not have instance methods
    default void method4(){
        System.out.println("default method");   //called by its subclasses' object, there is no object of interface
    }
}
// since interface is not a class, we can not create objects from it
// multiple inheritance is possible with interfaces

class Test implements PropertiesOfInterface{


    @Override
    public void method3() {

    }

    public static void main(String[] args) {

        new Test().method4();
    }
}