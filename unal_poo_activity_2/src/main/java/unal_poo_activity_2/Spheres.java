/*
 * Cap 4 - Ejercicio Propuesto No 24
 */

package unal_poo_activity_2;

/**
 *
 * @author 1022003484
 */
public class Spheres {
    public double[] spheresWeights = new double[3];

    public int getIndexOfHeaviestSphere() {
        int indexOfHeaviestSphere = 0;
        for(int i = 0; i < this.spheresWeights.length; i++) {
            if(this.spheresWeights[i] > this.spheresWeights[indexOfHeaviestSphere]){
                indexOfHeaviestSphere = i;
            }
        }
        return indexOfHeaviestSphere;
    }
    
    public Spheres(double[] spheresWeights) {
        for(int i = 0; i < spheresWeights.length; i++) {
            this.spheresWeights[i] = spheresWeights[i];
        }
    }
}
