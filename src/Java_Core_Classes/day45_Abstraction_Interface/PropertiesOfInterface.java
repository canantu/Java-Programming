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

    public static void method2(){
        System.out.println("static method");
    }

    public abstract void method3();

    // if the implementation is same for all subclasses, we introduce default method
    public default void method4(){
        System.out.println("default method");
    }
}
