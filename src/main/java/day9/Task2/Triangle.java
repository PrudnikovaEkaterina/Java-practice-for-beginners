package day9.Task2;

public class Triangle extends Figure{
    private double a, b, c;

    public Triangle(double a, double b, double c, String color){
        super(color);
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public double area() {
        double p = (a + b + c) / 2.0;
        double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return area;
    }

    public double perimeter() {
        double perimeter = a + b + c;
        return perimeter;
    }
}
