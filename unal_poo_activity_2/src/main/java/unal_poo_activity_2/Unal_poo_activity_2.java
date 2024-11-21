/*
 * Cap 4 - Ejercicio Propuesto No 23 
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
        QuadraticEquation quadraticEquation = new QuadraticEquation(
            new double[] {
                getDouble("term a"), 
                getDouble("term b"), 
                getDouble("term c")
            }
        );
        
        double[] roots = quadraticEquation.getRoots();
        
        if (roots.length == 0) {
            System.out.print("the system has no solution");
        } else {
            System.out.println("The sistem has " + String.valueOf(roots.length) + " solution(s)");
            System.out.format("%15s %1s %-35s%n", new Object[] {"x1", "=", String.valueOf(roots[0])});
            if (roots.length >1){
                System.out.format("%15s %1s %-35s%n", new Object[] {"x2", "=", String.valueOf(roots[1])});
            }
        }
    }
    
    public static double getDouble(String message) {
        System.out.print(message + ": ");
        return scanner.nextDouble();
    }
}