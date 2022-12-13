package Java_Core_Classes.day38_Inheritance.shapeTask;

public class ShapeObjects {
    public static void main(String[] args) {
        Circle circle = new Circle(4);
        Rectangle rectangle = new Rectangle(4, 4);
        Square square = new Square(4);

        System.out.println(circle);
        System.out.println(rectangle);
        System.out.println(square);
    }
}
