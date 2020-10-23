package matrices;

public interface IMatrixWorker {

    /**
     *Prints the matrix to console.
     * @param m
     */
    public void print(double[][] m);

    /**
     * Checks whether the matrix m1 has same dimension as the matrix m2
     * @param m1
     * @param m2
     */
    public boolean haveSameDimension(double[][] m1, double[][] m2);

    /**
     *Adds the matrices m1 and m2 if their dimensions are the same.
     * @param m1
     * @param m2
     * @return the sum of the matrices
     * @throws IllegalArgumentException if dimensions are not the same.
     */
    public double[][] add(double[][] m1, double[][] m2);

    /**
     *Subtracts the matrix m2 from the matrix m1 if their dimensions are the same.
     * @param m1
     * @param m2
     * @return the subtraction of matrices m1 and m2
     * @throws IllegalArgumentException if dimensions are not the same.
     */
    public double[][] subtract(double[][] m1, double[][] m2);

    /**
     *Multiplies two matrices m1 and m2 if m1 and m2 are set properly.
     * @param m1
     * @param m2
     * @return the matrix product.
     * @throws IllegalArgumentException if the number of columns of m1 doesn't equal to the number of rows of m2.
     */
    public double[][] multiply(double[][] m1, double[][] m2);
}