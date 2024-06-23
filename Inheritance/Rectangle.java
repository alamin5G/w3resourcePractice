package Inheritance;

public class Rectangle extends Shape{
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    protected double getArea() {
        return length * width;
    }

}
