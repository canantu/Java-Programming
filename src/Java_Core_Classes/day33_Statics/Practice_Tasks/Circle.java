package Java_Core_Classes.day33_Statics.Practice_Tasks;

public class Circle {

    public double radius;
    public double diameter;
    public static double pi = 3.14;

    public Circle(double radius) {
        this.radius = radius;
        this.diameter = 2*radius;
    }

    public double calcArea(){
        return radius*radius*pi;
    }

    public double calcPerimeter(){
        return 2*pi*radius;
    }

    public static void printPi(){
        System.out.println("pi = " + pi);
    }

    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", diameter=" + diameter +
                ", pi=" + pi +
                ", area=" + calcArea() +
                ", perimeter=" + calcPerimeter() +
                '}';
    }
}
