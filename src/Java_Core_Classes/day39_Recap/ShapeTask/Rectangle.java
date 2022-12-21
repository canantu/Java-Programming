package Java_Core_Classes.day39_Recap.ShapeTask;

public class Rectangle extends Shape {

    private double length;
    private double width;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length<=0) {
            System.err.println("Length can not be 0 or less than 0");
            System.exit(1);
        }
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width<=0) {
            System.err.println("Width can not be 0 or less than 0");
            System.exit(1);
        }
        this.width = width;
    }

    public Rectangle(double length, double width) {
        super("Rectangle");
        setLength(length);
        setWidth(width);
    }

    @Override
    public double area() {
        return width*length;
    }

    @Override
    public double perimeter() {
        return 2*(length+width);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "name= 'Rectangle'" +
                ", length=" + length +
                ", width=" + width +
                ", area=" + area() +
                ", perimeter=" + perimeter() +
                '}';
    }
}
