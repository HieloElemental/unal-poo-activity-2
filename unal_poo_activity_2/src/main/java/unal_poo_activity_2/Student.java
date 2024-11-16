/*
 * Cap 4 - Ejercico Resuelto No 10 
 */

package unal_poo_activity_2;

/**
 *
 * @author 1022003484
 */
public class Student {
    public String inscriptionNumber, names;
    private int patrimony, socialStratum;
    
    public double getTuitionPayment() {
        double tuitionPayment = 50000;
        if(patrimony > 2000000 && socialStratum > 3){
            tuitionPayment += 0.03 * patrimony;
        }
        return tuitionPayment;
    }
    
    public void printRegistrationData() {
        System.out.println(
                "The student with inscription number " + 
                        this.inscriptionNumber + 
                        " and name " + 
                        this.names + 
                        " has to pay " + 
                        String.valueOf(this.getTuitionPayment())
        );
    }
    
    public Student(String inscriptionNumber, String names, int patrimony, int socialStratum) {
        this.inscriptionNumber = inscriptionNumber;
        this.names = names;
        this.patrimony = patrimony;
        this.socialStratum = socialStratum;
    }
}
