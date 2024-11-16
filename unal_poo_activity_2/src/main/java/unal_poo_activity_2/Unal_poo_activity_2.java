/*
 * Cap 4 - Ejercico Resuelto No 7
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
        double numberA = getDouble("insert number A");
        double numberB = getDouble("insert number B");
        
        if(numberA > numberB){
            System.out.println("A is greater than B");
        } else {
            if(numberA == numberB) {
                System.out.println("A is equal than B");
            } else {
                System.out.println("A is lesser than B");
            }
        }
    }
    
    public static double getDouble(String message) {
        System.out.print(message + ": ");
        return scanner.nextDouble();
    }
}
