/*
 * Cap 3 - Ejercico Propuesto No 21
 */

package unal_poo_activity_2;

import java.util.Scanner;

/**
 *
 * @author 1022003484
 */
public class Unal_poo_activity_2 {
    public static Scanner scanner = new Scanner(System.in);
  
    public static void main(String[] args){
        double[] sides = new double[3];
        for(int i = 0; i < sides.length; i++) {
            sides[i] = getDouble("Side " + String.valueOf(i + 1));
        }

        Triangle triangle = new Triangle(sides);

        triangle.printTriangleMeasures();
    }

    public static double getDouble(String message) {
        System.out.print(message + ": ");
        return scanner.nextDouble();
    }
}
