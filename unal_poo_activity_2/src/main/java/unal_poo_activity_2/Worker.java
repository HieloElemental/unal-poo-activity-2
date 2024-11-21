/*
 * Cap 4 - Ejercicio Propuesto No 22
 */
package unal_poo_activity_2;

/**
 *
 * @author 1022003484
 */

public class Worker {
    public String name;
    private double workedHours, workedHourRate;

    public double getSalary() {
        return workedHours * workedHourRate;
    }

    public boolean isSalaryGreat (){
        return this.getSalary() > 450000;
    }
    
    public Worker(String name, double workedHours, double workedHourRate) {
        this.name = name;
        this.workedHours = workedHours;
        this.workedHourRate = workedHourRate;
    }
}