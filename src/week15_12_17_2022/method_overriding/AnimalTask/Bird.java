package week15_12_17_2022.method_overriding.AnimalTask;

public class Bird extends Animal{
    @Override
    public void move() {
        super.move();
        System.out.println("Birds are flying");
    }
}
