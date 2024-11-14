/*
 * Cap 3 - Ejercico Propuesto No 18
 */

package unal_poo_activity_2;

/**
 *
 * @author 1022003484
 */
public class Employee {
    public String code, name;
    public double hoursWorkedPerWeek, hourlyValueWorked, percentageWithholdingTax;
    
    public double getGrossSalary() {
        double grossSalary = this.hoursWorkedPerWeek * this.hourlyValueWorked;
        return grossSalary;
    }
    
    public double getNetSalary() {
        double rawPercentageRemaining = (100 - this.percentageWithholdingTax) / 100;
        double netSalary = getGrossSalary() * rawPercentageRemaining;
        return netSalary;
    }
    
    public EmployeeDisplayData getEmployeeDisplayData() {
        EmployeeDisplayData employeeDisplayData = new EmployeeDisplayData(this.code, this.name, this.getGrossSalary(), this.getNetSalary());
        return employeeDisplayData;
    }
    
    public Employee (String code, String name, double hoursWorkedPerWeek, double hourlyValueWorked, double percentageWithholdingTax) {
        this.code = code;
        this.name = name;
        this.hoursWorkedPerWeek = hoursWorkedPerWeek;
        this.hourlyValueWorked = hourlyValueWorked;
        this.percentageWithholdingTax = percentageWithholdingTax;
    }
}
