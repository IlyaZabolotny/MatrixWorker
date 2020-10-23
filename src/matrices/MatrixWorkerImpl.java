package matrices;

/**
 * This class provides opportunity to perform base matrix operations:
 *  *add, subtract and multiply matrices.
 * @version 1.0
 * @author Ilya Zabolotny
 */
public class MatrixWorkerImpl implements IMatrixWorker{

    /**
     *Prints the matrix to console.
     * @param m
     */
    public void print(double[][] m){
        for (int i=0; i < m.length; i++){
            for (int j = 0; j < m[0].length; j++){
                System.out.print(m[i][j]+" ");
            }
            System.out.println();
        }
    }

    /**
     * Checks whether matrix m1 has same dimension as matrix m2
     * @param m1
     * @param m2
     */
    public boolean haveSameDimension(double[][] m1, double[][] m2){
        return ((m1.length == m2.length) && (m1[0].length == m2[0].length));
    }



}
