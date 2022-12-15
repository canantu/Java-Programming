package Java_Core_Classes.day39_Inheritance_Encapsulation.ShapeTask;

public class ShapeObjects {
    public static void main(String[] args) {
        Square square = new Square(4);
        Rectangle rectangle = new Rectangle(4,3);
        Circle circle = new Circle(4);

        System.out.println(rectangle);
        System.out.println(circle);
        System.out.println(square);

    }
}
