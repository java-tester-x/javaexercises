/**
 * Write a program called ComputePI to compute the value of π, 
 * using the following series expansion. You have to decide on the termination 
 * criterion used in the computation (such as the number of terms used 
 * or the magnitude of an additional term). 
 * 
 * PI = 4 * (1 -1/3 + 1/5 - 1/7 + 1/9 - 1/11 + 1/13 - 1/15 ...)
 */

package javaexercises.flowcontrol;

/**
 *
 * @author User
 */
public class ComputePI {

    public static void main(String[] args) {
        double precision = 0.0000001;
        ComputePI aComputePI = new ComputePI();
        double pi = aComputePI.getPI(precision);
        System.out.printf("Difference between the values obtained and the Math.PI: %.10f \n", (double)(Math.PI - pi));
    }
    
    /**
     * Compute PI value with precision.
     * 
     * @param double precision
     * @return double
     */
    private double getPI(double precision) {
        double sumOld;
        double sumNew = 0.0;
        long   i = 0;
        do {
            sumOld = sumNew;
            sumNew += ((i % 2 == 0) ? 1 : -1) * (double) 4/(2*i + 1); 
            ++i;
        } while( (double) Math.abs(sumNew - sumOld) >= precision);
        
        System.out.printf("Calculated items %d, PI = %.10f", i, sumOld);
        System.out.println();
        return sumOld;    
    }
    
}
