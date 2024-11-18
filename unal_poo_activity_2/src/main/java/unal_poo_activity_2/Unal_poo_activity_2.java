/*
 * Cap 4 - Ejercico Resuelto No 11 
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
        double[] numbers = new double[3];
        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = getDouble("insert number " + String.valueOf(i + 1));
        }
        
        double maxValue = Math.max(Math.max(numbers[0], numbers[1]), numbers[2]);
        
        System.out.print("El valor mayor entre " + 
                String.valueOf(numbers[0]) + 
                ", " +
                String.valueOf(numbers[1]) +
                " y " + 
                String.valueOf(numbers[2]) + 
                " es " +
                String.valueOf(maxValue)
        );
    }
    
    public static double getDouble(String message) {
        System.out.print(message + ": ");
        return scanner.nextDouble();
    }
}
