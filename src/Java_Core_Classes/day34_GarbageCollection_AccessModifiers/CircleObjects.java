package Java_Core_Classes.day34_GarbageCollection_AccessModifiers;

public class CircleObjects {
    public static void main(String[] args) {
        Circle circle1 = new Circle(2.5);
        System.out.println(circle1);

        System.out.println(Circle.pi);
        System.out.println(Circle.name);
        System.out.println(Circle.numbers);

    }

}
