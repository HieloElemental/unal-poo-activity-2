/*
 * Cap 4 - Ejercicio Resuelto No 13 
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
        Purchase purchase = new Purchase(getDouble("Insert purchase value"));
        
        int ballColorId = Purchase.getBallColorId(getString("Insert ball color"));
        double purchaseValue = purchase.getDiscountedPurchaseValue(ballColorId);
        
        System.out.print("the final price with the discount (" + purchase.discounts[ballColorId] + "%) of the ball is " + String.valueOf(purchaseValue));
    }
    
    public static String getString(String message) {
        System.out.print(message + ": ");
        return scanner.next();
    }
    
    public static double getDouble(String message) {
        System.out.print(message + ": ");
        return scanner.nextDouble();
    }
}
