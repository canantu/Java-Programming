package Java_Core_Classes.day45_Abstraction_Interface.shape;

public class Triangle extends Shape{

    private double side1;
    private double side2;
    private double side3;
    private double height1;
    private double height2;
    private double height3;

    public Triangle(String name, double side1, double side2, double side3, double height1, double height2, double height3) {
        super(name);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.height1 = height1;
        this.height2 = height2;
        this.height3 = height3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getHeight1() {
        return height1;
    }

    public void setHeight1(double height1) {
        this.height1 = height1;
    }

    public double getHeight2() {
        return height2;
    }

    public void setHeight2(double height2) {
        this.height2 = height2;
    }

    public double getHeight3() {
        return height3;
    }

    public void setHeight3(double height3) {
        this.height3 = height3;
    }

    @Override
    public double area() {
        return height1*side1/2;
    }

    @Override
    public double perimeter() {
        return 0;
    }
}
