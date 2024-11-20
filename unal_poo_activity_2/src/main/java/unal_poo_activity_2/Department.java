/*
 * Ejercicio Resuelto No 14 
 */

package unal_poo_activity_2;

/**
 *
 * @author 1022003484
 */
public class Department {
    public double salary, sales;
    
    public double getSalary(boolean isIncentiveApplied) {
        if(isIncentiveApplied){
            return salary + salary * 0.2;
        }
        return salary;
    }
    
    public Department(double salary, double sales) {
        this.salary = salary;
        this.sales = sales;
    }
}
