package Java_Core_Classes.day39_Inheritance_Encapsulation.ShapeTask;

public class Circle extends Shape{

    private double radius;
    public static double pi = 3.14;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius<=0) {
            System.err.println("Radius can not be 0 or less than 0");
            System.exit(1);
        }
        this.radius = radius;
    }

    public Circle(double radius) {
        super("Circle");
        setRadius(radius);
    }

    @Override
    public double area() {
        return pi*radius*radius;
    }

    @Override
    public double perimeter() {
        return 2*pi*radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "name= 'Circle'" +
                ", radius=" + radius +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                '}';
    }
}
