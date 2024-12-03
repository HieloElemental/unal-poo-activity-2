package geometricFiguresClasses;

public class Rectangle extends Shape {
    public double base, height;

    public Rectangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (base + height);
    }

    @Override
    public double getArea() {
        return base * height;
    }
}