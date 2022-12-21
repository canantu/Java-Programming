package Java_Core_Classes.day39_Recap.ShapeTask;

public class Square extends Shape{

    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if (side<=0) {
            System.err.println("Side can not be 0 or less than 0");
            System.exit(1);
        }
        this.side = side;
    }

    public Square(double side) {
        super("Square");
        setSide(side);
    }

    @Override
    public double area() {
        return side*side;
    }

    @Override
    public double perimeter() {
        return 4*side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "name= 'Square'" +
                ", side=" + side +
                ", area=" + area() +
                ", perimeter=" + perimeter() +
                '}';
    }
}
