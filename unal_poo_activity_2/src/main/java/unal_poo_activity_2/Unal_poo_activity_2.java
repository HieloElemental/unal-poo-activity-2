/*
 * Cap 4 - Ejercicio Propuesto No 15
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
        String[] spheresNames = {"A", "B", "C", "D"};

        Spheres spheres = new Spheres(new double[] {
            getDouble("weight of the sphere " + spheresNames[0]),
            getDouble("weight of the sphere " + spheresNames[1]),
            getDouble("weight of the sphere " + spheresNames[2]),
            getDouble("weight of the sphere " + spheresNames[3])
        });

        System.out.print(
            "The different sphere is the sphere " + 
            spheresNames[spheres.indexOfDifferentSphere] + 
            " with a weight of " + 
            spheres.spheresWeights[spheres.indexOfDifferentSphere] + 
            " which is " +
            spheres.getGreaterOrLesserText() + 
            " than the others"
        );
    }

    public static double getDouble(String message) {
        System.out.print(message + ": ");
        return scanner.nextDouble();
    }
}
