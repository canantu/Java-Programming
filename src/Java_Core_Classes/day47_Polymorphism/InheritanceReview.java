package Java_Core_Classes.day47_Polymorphism;

public class InheritanceReview {
    int a;

    public InheritanceReview(int a) {
        System.out.println("Parent constructor");
        this.a = a;
    }
}


class A extends InheritanceReview{

    public A(int a) {
        super(a);
    }
}

class B extends InheritanceReview{

    public B(int a) {
        super(a);
    }
}

class C extends InheritanceReview{

    public C(int a) {
        super(a);
    }
}

class AA extends A{

    public AA(int a) {
        super(a);
    }
}

class BB extends B{

    public BB(int a) {
        super(a);
    }
}

class CC extends C{

    public CC(int a) {
        super(a);
    }
}







class D{

    void method(){
        super.toString(); // super is from Object class
    }
}