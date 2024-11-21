/*
 * Cap 4 - Ejercicio Propuesto No 22
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
        Worker worker = new Worker(getString("insert worker name"),
                getDouble("insert worker hours"),
                getDouble("insert worked hour rate")
        );

        System.out.format("%15s %-35s%n", new Object[] {"name:", worker.name});
        if(worker.isSalaryGreat()) {
            System.out.format("%15s %-35s%n", new Object[] {"salary:", worker.getSalary()});
        }
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