/*
 * Cap 3 - Ejercico Propuesto No 19
 */

package unal_poo_activity_2;

import java.util.Scanner;

/**
 *
 * @author 1022003484
 */
public class Unal_poo_activity_2 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        EquilateralTriangle equilateralTriangle = new EquilateralTriangle(getDouble("Triangle's side")); 
        equilateralTriangle.printTriangleMeasures();
    }

    public static double getDouble(String message) {
        System.out.print(message + ": ");
        return scanner.nextDouble();
    }

}
