/*
 * Ejercicio Resuelto No 14 
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
        double totalSales, salesMinimumPercentage;
        double salary = getDouble("insert salary");
        
        Department[] departments = new Department[3];
        
        totalSales = 0;
        for(int i = 0; i < departments.length; i++) {
            departments[i] = new Department(salary, getDouble("sales of department " + String.valueOf(i + 1)));
            totalSales += departments[i].sales;
        }
        
        salesMinimumPercentage = totalSales * 0.33;
        for(int i = 0; i < departments.length; i++) {
            boolean isIncentiveApplied = departments[i].sales > salesMinimumPercentage;
            System.out.format("%15s: %-35s%n", 
                    new Object[] {
                        "department " + String.valueOf(i + 1),
                        String.valueOf(departments[i].getSalary(isIncentiveApplied))
                    }
            );
        }
        
        
    }
    
    public static double getDouble(String message) {
        System.out.print(message + ": ");
        return scanner.nextDouble();
    }
}
