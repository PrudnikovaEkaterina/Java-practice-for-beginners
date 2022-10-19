package day9.Task2;

public class Circle extends Figure{
    private double radius;
    public Circle (double radius, String color){
        super(color);
        this.radius=radius;
    }

    public double area() {
        double area = Math.pow(this.radius, 2.0) * Math.PI;
        return area;
    }

    public double perimeter() {
        double perimeter = 2.0 * this.radius * Math.PI;
        return perimeter;
    }
}
