/*
 * Cap 4 - Ejercicio Propuesto No 23
 */

package unal_poo_activity_2;

/**
 *
 * @author 1022003484
 */
class QuadraticEquation {
    public double[] terms = new double[3];
    public double discriminant;
    
    public double getDiscriminant() {
        double discriminant = Math.pow(this.terms[1], 2) - 4 * (this.terms[0] * this.terms[2]);
        return discriminant;
    }
    
    public double[] getRoots() {
        if(this.discriminant < 0 ) {
            return new double[0];
        } else {
            double twoA = 2 * this.terms[0];
            if(this.discriminant > 0) {
                double[] roots = new double[] {
                    ((-1 * this.terms[1]) + Math.sqrt(this.discriminant)) / twoA,
                    ((-1 * this.terms[1]) - Math.sqrt(this.discriminant)) / twoA
                };
                return roots;
            }
            return new double[] {(-1 * this.terms[1]) / twoA};
        }
    }
    
    public QuadraticEquation(double[] terms) {
        for(int i = 0; i < terms.length; i++) {
            this.terms[i] = terms[i];
        }
        this.discriminant = this.getDiscriminant();
    }
}
