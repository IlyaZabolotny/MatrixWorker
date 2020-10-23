package matrices;

/**
 * This class provides opportunity to perform base matrix operations:
 *  *add, subtract and multiply matrices.
 * @version 1.0
 * @author Ilya Zabolotny
 */
public class MatrixWorkerImpl implements IMatrixWorker{

    @Override
    public void print(double[][] m){
        for (int i=0; i < m.length; i++){
            for (int j = 0; j < m[0].length; j++){
                System.out.print(m[i][j]+" ");
            }
            System.out.println();
        }
    }

    @Override
    public boolean haveSameDimension(double[][] m1, double[][] m2){
        return ((m1.length == m2.length) && (m1[0].length == m2[0].length));
    }

    @Override
    public double[][] add(double[][] m1, double[][] m2) {
        MatrixWorkerImpl matrixWorker = new MatrixWorkerImpl();
        if (matrixWorker.haveSameDimension(m1, m2)){
            double[][] m = new double[m1.length][m1[0].length];
            for (int i = 0; i < m1.length; i++){
                for (int j = 0; j < m1[0].length; j++){
                    m[i][j] = m1[i][j] + m2[i][j];
                }
            }
            return m;
        } else {
            throw new IllegalArgumentException("Dimensions should be the same.");
        }
    }

    @Override
    public double[][] subtract(double[][] m1, double[][] m2) {
        MatrixWorkerImpl matrixWorker = new MatrixWorkerImpl();
        if (matrixWorker.haveSameDimension(m1, m2)){
            double[][] m = new double[m1[0].length][m1[0].length];
            for (int i = 0; i < m1.length; i++){
                for (int j = 0; j < m1[0].length; j++){
                    m[i][j] = m1[i][j] - m2[i][j];
                }
            }
            return m;
        } else {
            throw new IllegalArgumentException("Dimensions should be the same.");
        }
    }

    @Override
    public double[][] multiply(double[][] m1, double[][] m2){
        if (m1[0].length == m2.length){
            double[][] m = new double[m1.length][m2[0].length];
            for (int i = 0; i < m1.length; i++){
                for (int j = 0; j < m2[0].length; j++){
                    double temp = 0;
                    for (int k = 0; k < m1.length; k++){
                        temp += m1[k][i] * m2[j][k];
                    }
                    m[i][j] = temp;
                }
            }
            return m;
        } else {
            throw new IllegalArgumentException ("Matrix m1's columns amount must be same as m2's rows amount");
        }
    }
}
