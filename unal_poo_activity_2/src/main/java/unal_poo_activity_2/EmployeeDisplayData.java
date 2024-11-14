/*
 * Cap 3 - Ejercico Propuesto No 18
 */

package unal_poo_activity_2;

/**
 *
 * @author 1022003484
 */
public class EmployeeDisplayData {
    public String code, names;
    double grossSalary, netSalary;
    
    public EmployeeDisplayData(String code, String names, double grossSalary, double netSalary) {
        this.code = code;
        this.names = names;
        this.grossSalary = grossSalary;
        this.netSalary = netSalary;
    }
    
    public void printData() {
        System.out.format("%15s %-35s%n", new Object[] {"code:", this.code});
        System.out.format("%15s %-35s%n", new Object[] {"names:", this.names});
        System.out.format("%15s %-35s%n", new Object[] {"gross salary:", String.valueOf(this.grossSalary)});
        System.out.format("%15s %-35s%n", new Object[] {"net salary:", String.valueOf(this.netSalary)});
    }
}
