/*
 * Cap 4 - Ejercico Resuelto No 12
 */

package unal_poo_activity_2;

/**
 *
 * @author 1022003484
 */
public class Worker {
    public String names;
    public double workedHours;
    private double workedHourRate;
    
    public double getSalary() {
        double salary = 0;
        
        if(workedHours > 40) {
            double overtimeWorkedHours = this.workedHours - 40;
            if(overtimeWorkedHours > 8) {
                double overtimeWorkedHoursExceesOfEight = overtimeWorkedHours - 8;
                salary += 40 * this.workedHourRate;
                salary += 16 * this.workedHourRate;
                salary += overtimeWorkedHoursExceesOfEight * this.workedHourRate * 3;
            } else {
                salary += 40 * this.workedHourRate;
                salary += overtimeWorkedHours * this.workedHourRate * 2;
            }
        } else {
            salary = this.workedHours * this.workedHourRate;
        }
        
        return salary;
    }
    
    public Worker(String names, double workedHours, double workedHourRate) {
        this.names = names;
        this.workedHours = workedHours;
        this.workedHourRate = workedHourRate;
    }
}
