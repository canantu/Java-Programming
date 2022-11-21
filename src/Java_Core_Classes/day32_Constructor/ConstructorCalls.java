package Java_Core_Classes.day32_Constructor;

public class ConstructorCalls {

    public ConstructorCalls(){
        System.out.println("Default Constructor");
    }

    public ConstructorCalls(int a){
        this();  // calls default constructor, constructor call must be first statement
        System.out.println("Constructor with int argument");
    }

    public ConstructorCalls(String str){
        this(10);  //two constructor call is not possible
        System.out.println("Constructor with string argument");
    }

    public static void main(String[] args) {
        ConstructorCalls obj1 = new ConstructorCalls();
        System.out.println("----------------------------------");

        ConstructorCalls obj2 = new ConstructorCalls(10);
        System.out.println("----------------------------------");

        ConstructorCalls obj3 = new ConstructorCalls("Java");
        System.out.println("----------------------------------");

    }
}
