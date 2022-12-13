package Java_Core_Classes.day38_Inheritance.shapeTask;

public class Rectangle extends Shape{

    public double width;
    public double length;
    public Rectangle(double length, double width) {
        super("Rectangle");
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return width*length;
    }

    @Override
    public double perimeter() {
        return 2*(length + width);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "name='" + name + '\'' +
                ", width=" + width +
                ", length=" + length +
                ", area=" + area() +
                ", perimeter=" + perimeter() +
                '}';
    }
}
