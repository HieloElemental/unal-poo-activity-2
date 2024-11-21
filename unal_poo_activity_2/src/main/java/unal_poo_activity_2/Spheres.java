/*
 * Cap 4 - Ejercicio Propuesto No 15
 */

package unal_poo_activity_2;

/**
 *
 * @author GAMER
 */
public class Spheres {
    public double[] spheresWeights = new double[4];
    public int[] indexOfEqualSpheres = new int[3];
    public int indexOfDifferentSphere;
    public boolean isDifferentSphereGreater;

    public void setIndexes() {
        for(int i = 0; i < this.spheresWeights.length; i++) {
            int matchFails = 0;
            for(int j = 0; j < this.spheresWeights.length; j++) {
                if(this.spheresWeights[i] != this.spheresWeights[j]) {
                    matchFails++;
                }
            }

            if(matchFails > 1) {
                this.indexOfDifferentSphere = i;
                break;
            }
        }

        int indexOfEqualSphere = 0;
        for(int i = 0; i < this.indexOfEqualSpheres.length; i++) {
            if(indexOfEqualSphere == this.indexOfDifferentSphere) {
                indexOfEqualSphere++;
                continue;
            }
            this.indexOfEqualSpheres[i] = indexOfEqualSphere;
            indexOfEqualSphere++;
        }

        this.isDifferentSphereGreater = this.spheresWeights[this.indexOfDifferentSphere] > this.spheresWeights[this.indexOfEqualSpheres[0]];
    }

    public String getGreaterOrLesserText() {
        if(this.isDifferentSphereGreater) {
            return "greater";
        }
        return "less";
    }

    public Spheres(double[] spheresWeights) {
        for(int i = 0; i < spheresWeights.length; i++) {
            this.spheresWeights[i] = spheresWeights[i];
        }
        this.setIndexes();
    }
}
