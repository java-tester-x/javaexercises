/**
 * Similar to Math class, write a library that supports matrix operations
 * (such as addition, subtraction, multiplication) via 2D arrays.
 * 
 * 1. The operations shall support both doubles and ints.
 * 2. Also write a test class to exercise all the operations programmed.
 * 
 * Hints:
 * public class Matrix {
 *    public static void printMatrix(int[][] m) { ...... }
 *    public static void printMatrix(double[][] m) { ...... }
 *    public static boolean haveSameDimension(int[][] m1, int[][] m2) { ...... }
 *    public static boolean haveSameDimension(double[][] m1, double[][] m2) { ...... }
 *    public static int[][] add(int[][] m1, int[][] m2) { ...... }
 *    public static double[][] add(double[][] m1, double[][] m2) { ...... }
 *    ......
 * }
 */

package javaexercises.difficult;

public class Matrix {

    public static void main(String[] args) {
        Matrix aMatrix = new Matrix();
        
        int[][] a = new int[][] {{1, 2, 3}, {4, 5, 6}};
        int[][] b = new int[][] {{0, 1}, {2, 3}, {3, 5}};
        
        //
        System.out.println("Matrix A:");
        aMatrix.printMatrix(a);
        System.out.println("Matrix B:");
        aMatrix.printMatrix(b);

        if (aMatrix.haveSameDimension(a, a)) {
            System.out.println("Add matrix A to A:");
            aMatrix.printMatrix(aMatrix.add(a, a));
        }
              
        //
        System.out.println();
        if (aMatrix.haveAllowedDimension(a, b)) {
            System.out.println("Multiply matrix A and B:");
            aMatrix.printMatrix(aMatrix.multiply(a, b));
        }                
    }

    /**
     * 
     * @param m 
     */
    public void printMatrix(int[][] m)
    {
        for (int[] row : m)
        {
            for (int aInt: row) {
                System.out.printf("%4d ", aInt);
            }
            System.out.println();
        }
    }

    /**
     * 
     * @param m 
     */
    public void printMatrix(double[][] m)
    {
        for (double[] row : m)
        {
            for (double aDouble : row) {
                System.out.printf("%.2f ", aDouble);
            }
            System.out.println();
        }
    }
    
    /**
     * 
     * @param m1
     * @param m2
     * @return 
     */
    public boolean haveSameDimension(int[][] m1, int[][] m2) {
        if (m1.length != m2.length) {
            return false;
        }        
        for(int i = 0; i < m1.length; i++) {
            if (m1[i].length == m2[i].length) {
                continue;
            }
            return false;
        }
        return true;
    }
    
    /**
     * 
     * @param m1
     * @param m2
     * @return 
     */
    public boolean haveSameDimension(double[][] m1, double[][] m2) {
        if (m1.length != m2.length) {
            return false;
        }        
        for(int i = 0; i < m1.length; i++) {
            if (m1[i].length == m2[i].length) {
                continue;
            }
            return false;
        }
        return true;
    }
    
    /**
     * Add two int matrix.
     * 
     * @param m1
     * @param m2
     * @return 
     */
    public int[][] add(int[][] m1, int[][] m2) {
        int[][] result = new int[m1.length][];
        for(int i = 0; i < result.length; i++) {
            result[i] = m1[i].clone();
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] += m2[i][j];
            }
            
        }
        return result;
    }
    
    /**
     * Add two double matrix.
     * 
     * @param m1
     * @param m2
     * @return 
     */
    public double[][] add(double[][] m1, double[][] m2) {
        double[][] result = new double[m1.length][];
        for(int i = 0; i < result.length; i++) {
            result[i] = m1[i].clone();
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] += m2[i][j];
            }
            
        }
        return result;
    }

    public boolean haveAllowedDimension(int[][] m1, int[][] m2)
    {
        // check first matrix deminsion
        int maxLengthM1 = 0;
        for (int[] a : m1) {
            maxLengthM1 = (maxLengthM1 <= a.length) ? a.length : maxLengthM1;
        }
        for (int[] a : m1) {
            if (maxLengthM1 == a.length) {
                continue;
            }
            return false;
        }
        
        // check first matrix deminsion
        int maxLengthM2 = 0;
        for (int[] b : m2) {
            maxLengthM2 = (maxLengthM2 <= b.length) ? b.length : maxLengthM2;
        }
        for (int[] b : m2) {
            if (maxLengthM2 == b.length) {
                continue;
            }
            return false;
        }
        
        // check dimenion
        return m1[0].length == m2.length;
    }
    
    /**
     * 
     * @param m1
     * @param m2
     * @return 
     */
    public int[][] multiply(int[][] m1, int[][] m2)
    {
        int[][] c = new int[m1.length][m2[0].length];
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {
                c[i][j] = 0;
                for (int k = 0; k < m1[0].length; k++) {
                    c[i][j] += m1[i][k] * m2[k][j];
                }
            }
        }
        return c;                
    }
}
