package Java_Core_Classes.day44_Abstraction_InterfaceIntro.AnimalTask;

public interface Playable {

    boolean isFriendly = true;  // always static and final by default

    //how to prove that a variable is static: by using it in a static method
    /*
    static void method(){
        System.out.println(isFriendly);
    }
    */

    void play(); // always abstract

}
