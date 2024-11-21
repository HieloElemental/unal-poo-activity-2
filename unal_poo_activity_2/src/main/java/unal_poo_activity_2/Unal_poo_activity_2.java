/*
 * Cap 4 - Ejercicio Propuesto No 24
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
        String[] spheresNames = new String[] {"A", "B", "C"};
        double[] spheresWeights = new double[3];

        for(int i = 0; i < spheresNames.length; i++) {
            spheresWeights[i] = getDouble("insert weight of the sphere " + spheresNames[i]);
        }
        
        Spheres spheres = new Spheres(spheresWeights);

        int indexOfHeaviestSphere = spheres.getIndexOfHeaviestSphere();
        
        System.out.print(
                "The heavier sphere is the sphere " + 
                        spheresNames[indexOfHeaviestSphere] + 
                        " with a weight of " + 
                        spheres.spheresWeights[indexOfHeaviestSphere]
        );
    }

    public static double getDouble(String message) {
        System.out.print(message + ": ");
        return scanner.nextDouble();
    }
}
