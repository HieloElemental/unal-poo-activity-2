/*
 * Cap 4 - Ejercicio Resuelto No 13 
 */
package unal_poo_activity_2;

/**
 *
 * @author 1022003484
 */
public class Purchase {
    public double purchaseValue;
    public double[] discounts = {
        0,   // white
        10,  // green
        25,  // yellow
        50,  // blue
        100, // red
    };
    
    public static int getBallColorId (String ballColor) {
        return switch (ballColor.toLowerCase()) {
            case "blanco", "white" -> 0;
            case "verde", "green" -> 1;
            case "amarillo", "yellow" -> 2;
            case "azul", "blue" -> 3;
            case "rojo", "red" -> 4;
            default -> -1;
        };
    }
    
    public double getDiscountedPurchaseValue(int ballColorId) {
        double discountedPurchaseValue = this.purchaseValue * (this.discounts[ballColorId] / 100);
        return this.purchaseValue - discountedPurchaseValue;
    }
    
    public Purchase(double purchaseValue) {
        this.purchaseValue = purchaseValue;
    }
}
