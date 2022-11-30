package Java_Core_Classes.day37_Inheritance;

class A{


    public A(int a){

        System.out.println("A");
    }
}

class B extends A{
    public B(){
        super(9); // if A constructor is not default, we have to call super() manually
        // super(): compiler calls the constructor implicitly if A has default constructor
        System.out.println("B");
    }

}


public class ConstructorPractice {
    public static void main(String[] args) {
        B objB = new B(); // first constructor A is called, then B
    }



}
