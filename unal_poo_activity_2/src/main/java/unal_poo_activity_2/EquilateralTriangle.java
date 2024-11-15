/*
 * Cap 3 - Ejercico Propuesto No 19
 */

package unal_poo_activity_2;

/**
 *
 * @author 1022003484
 */
public class EquilateralTriangle {
    public double side;
    public double perimeter, height, area;

    public double getPerimeter() {
        return 3 * this.side; 
    }

    public double getHeight() {
        double heightSquare = Math.pow(this.side, 2) + Math.pow(this.side / 2, 2);
        double height = Math.sqrt(heightSquare);
        return height;
    }

    public double getArea() {
        double areaTwice = this.side * this.getHeight();
        double area = areaTwice / 2;
        return area;
    }

    public void printTriangleMeasures() {
        System.out.format("%15s %-35s%n", new Object[] {"Perimeter:", String.valueOf(this.perimeter)});
        System.out.format("%15s %-35s%n", new Object[] {"Height:", String.valueOf(this.height)});
        System.out.format("%15s %-35s%n", new Object[] {"Area:", String.valueOf(this.area)});
    }

    public EquilateralTriangle(double side) {
        this.side = side;
        this.perimeter = this.getPerimeter();
        this.height = this.getHeight();
        this.area = this.getArea();
    }
}
