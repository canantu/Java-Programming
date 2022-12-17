package week15_12_17_2022.method_overriding.AnimalTask;

public class Cow extends Animal{

    @Override
    public void move() {
        super.move();
        System.out.println(getClass().getSimpleName() +  "s are walking");
    }
}
