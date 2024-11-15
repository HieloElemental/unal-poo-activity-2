/*
 * Cap 3 - Ejercicio Propuesto No 21
 */

package unal_poo_activity_2;

/**
 *
 * @author 1022003484
 */
public class Triangle {
    public double[] sides = new double[3];
    public double perimeter, semiperimeter, area;

    public double getPerimeter() {
        double perimeter = 0;
        for(double side : this.sides) {
            perimeter += side;
        }
        return perimeter;
    }

    public double getSemiperimeter() {
        double semiperimeter = this.perimeter/2;
        return semiperimeter;
    }

    public double getArea() {
        double[] semiperimeterSides = new double[3];
    
        for(int i = 0 ; i < semiperimeterSides.length; i++) {
            semiperimeterSides[i] = this.semiperimeter - this.sides[i];
        }

        double areaSquare = this.semiperimeter;
    
        for(double semiperimeterSide : semiperimeterSides) {
            areaSquare *= semiperimeterSide;
        }

        double area = Math.sqrt(areaSquare);
        return area;
    }

    public void printTriangleMeasures() {
        System.out.format("%15s %-35s%n", new Object[] {"perimeter:", String.valueOf(this.perimeter)});
        System.out.format("%15s %-35s%n", new Object[] {"semiperimeter:", String.valueOf(this.semiperimeter)});
        System.out.format("%15s %-35s%n", new Object[] {"area:", String.valueOf(this.area)});
    }
  
    public Triangle(double[] sides) {
        for(int i = 0; i < sides.length; i++) {
            this.sides[i] = sides[i];
        }

        this.perimeter = this.getPerimeter();
        this.semiperimeter = this.getSemiperimeter();
        this.area = this.getArea();
    }
}
