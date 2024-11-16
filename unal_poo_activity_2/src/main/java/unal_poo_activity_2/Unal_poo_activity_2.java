/*
 * Cap 4 - Ejercico Resuelto No 10 
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
        Student student = new Student(
                getString("insert inscription number"),
                getString("insert student names"),
                getInt("insert student's patrimony"),
                getInt("insert student's social stratum")
        );
        student.printRegistrationData();
    }
    
    public static String getString(String message) {
        System.out.print(message + ": ");
        return scanner.nextLine();
    }
    
    public static int getInt(String message) {
        System.out.print(message + ": ");
        return scanner.nextInt();
    }
}
