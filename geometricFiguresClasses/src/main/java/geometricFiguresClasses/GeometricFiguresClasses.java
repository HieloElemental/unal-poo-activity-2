/*
 * Geometric Figures Classes - Exercise
 */

package geometricFiguresClasses;

import java.util.Scanner;

public class GeometricFiguresClasses {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Circle");
        Shape circle = new Circle(getDouble("Circle radius"));
        System.out.println("");
        
        System.out.println("Rectangle");
        Shape rectangle = new Rectangle(
                getDouble("Rectangle base"),
                getDouble("Rectangle height")
        );
        System.out.println("");
        
        System.out.println("Square");
        Shape square = new Square(getDouble("Square side"));
        System.out.println("");
        
        System.out.println("Right Triangle");
        RightTriangle rightTriangle = new RightTriangle(
                getDouble("Right triangle base"), 
                getDouble("Right triangle height")
        );
        System.out.println("");
        
        System.out.println("Rhombus");
        Shape rhombus = new Rhombus(
                getDouble("Rhombus diagonal 1"),
                getDouble("Rhombus diagonal 2")
        );
        System.out.println("");
        
        System.out.println("Trapezoid");
        Shape trapezoid = new Trapezoid(
                getDouble("Trapezoid base 1"),
                getDouble("Trapezoid base 2"),
                getDouble("Trapezoid side 1"),
                getDouble("Trapezoid side 2"),
                getDouble("Trapezoid height")
        );
        System.out.println("");
        System.out.println("");
        
        System.out.println("Circle");
        System.out.println("Area: " + String.valueOf(circle.getArea()));
        System.out.println("Perimeter: " + String.valueOf(circle.getPerimeter()));
        System.out.println("");
        
        System.out.println("Rectangle");
        System.out.println("Area: " + String.valueOf(rectangle.getArea()));
        System.out.println("Perimeter: " + String.valueOf(rectangle.getPerimeter()));
        System.out.println("");
        
        System.out.println("Square");
        System.out.println("Area: " + String.valueOf(square.getArea()));
        System.out.println("Perimeter: " + String.valueOf(square.getPerimeter()));
        System.out.println("");
        
        System.out.println("Right Triangle");
        System.out.println("Area: " + String.valueOf(rightTriangle.getArea()));
        System.out.println("Perimeter: " + String.valueOf(rightTriangle.getPerimeter()));
        System.out.println("Type: " + rightTriangle.getTriangleType());
        System.out.println("");
        
        System.out.println("Rhombus");
        System.out.println("Area: " + String.valueOf(rhombus.getArea()));
        System.out.println("Perimeter: " + String.valueOf(rhombus.getPerimeter()));
        System.out.println("");
        
        System.out.println("Trapezoid");
        System.out.println("Area: " + String.valueOf(trapezoid.getArea()));
        System.out.println("Perimeter: " + String.valueOf(trapezoid.getPerimeter()));
        System.out.println("");
    }

    public static double getDouble(String message){
        System.out.print(message + ": ");
        return scanner.nextDouble();
    }
}
