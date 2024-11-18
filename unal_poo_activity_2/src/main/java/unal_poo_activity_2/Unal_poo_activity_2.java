/*
 * Cap 4 - Ejercico Resuelto No 12
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
        Worker worker = new Worker(getString("insert names"),
                getDouble("insert worked hours"),
                getDouble("insert worked hour rate")
        );
        
        System.out.print("The worker " + worker.names + " earned " + String.valueOf(worker.getSalary()));
    }
    
    public static String getString(String message) {
        System.out.print(message + ": ");
        return scanner.nextLine();
    }
    
    public static double getDouble(String message) {
        System.out.print(message + ": ");
        return scanner.nextDouble();
    }
}
