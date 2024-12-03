package geometricFiguresClasses;

public class RightTriangle extends Shape {
    private double base, height, hypotenuse;

    public RightTriangle(double base, double height) {
        this.base = base;
        this.height = height;

        this.hypotenuse = Math.sqrt(Math.pow(base, 2) + Math.pow(height, 2));
    }

    @Override
    public double getPerimeter() {
        return base + height + hypotenuse;
    }

    @Override
    public double getArea() {
        return 0.5 * base * height;
    }

    public double getHypotenuse() {
        return hypotenuse;
    }

    public String getTriangleType() {
        if(base == height && base == hypotenuse) {
            return "equilateral";
        } else if(base == height || base == hypotenuse || height == hypotenuse) {
            return "isosceles";
        } else {
            return "scalene";
        }
    }
}