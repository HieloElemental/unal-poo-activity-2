package geometricFiguresClasses;

public class Trapezoid extends Shape {
    private double base1, base2, side1, side2, height;

    public Trapezoid(double base1, double base2, double side1, double side2, double height) {
        this.base1 = base1;
        this.base2 = base2;
        this.side1 = side1;
        this.side2 = side2;
        this.height = height;
    }

    @Override
    public double getPerimeter() {
        return base1 + base2 + side1 + side2;
    }

    @Override
    public double getArea() {
        return ((base1 + base2) / 2) * height;
    }
}
