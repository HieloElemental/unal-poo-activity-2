package geometricFiguresClasses;

public class Rhombus extends Shape {
    private double diagonal1, diagonal2;

    public Rhombus(double diagonal1, double diagonal2) {
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
    }

    @Override
    public double getPerimeter() {
        double side = Math.sqrt(Math.pow(diagonal1 / 2, 2) + Math.pow(diagonal2 / 2, 2));
        return 4 * side;
    }

    @Override
    public double getArea() {
        return (diagonal1 * diagonal2) / 2;
    }
}
