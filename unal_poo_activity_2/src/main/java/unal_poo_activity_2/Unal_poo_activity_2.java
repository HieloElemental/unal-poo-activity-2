/*
 * Cap 3 - Ejercico Propuesto No 18
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
        Employee employee = new Employee(
                getString("code"),
                getString("name"),
                getDouble("hours worked per week"),
                getDouble("value of worked hours"),
                getDouble("withholding tax percentage")
        );
        
        employee.getEmployeeDisplayData().printData();
    }
    
    public static String getString (String message) {
        System.out.print(message + ": ");
        return scanner.nextLine();
    }
    
    public static double getDouble (String message) {
        System.out.print(message + ": ");
        return scanner.nextDouble();
    }
}
