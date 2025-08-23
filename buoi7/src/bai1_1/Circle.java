package bai1_1;

public class Circle extends Shape{
    private double r;
    @Override
    public double area() {
        return 3.14*r*r;
    }

    public Circle(double r ) {
        this.r = r;
    }
}
