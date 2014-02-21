package javaexercises.flowcontrol;

/**
 * Write a program called HarmonicSum to compute the sum of a harmonic series,
 * as shown below, where n=50000. The program shall compute the sum 
 * from left-to-right as well as from the right-to-left.
 * Obtain the difference between these two sums and explain the difference. 
 * 
 * Harmonic(n) = 1 + 1/2 + 1/3 + ... 1/n
 */

/**
 *
 * @author User
 */
public class HarmonicSum {
    
    public static void main(String[] args) {
        
        int n = 50000;
        HarmonicSum aHarmonicSum = new HarmonicSum();
        double sumL2R = aHarmonicSum.printLeftToRightSum(n);
        double sumR2L = aHarmonicSum.printRightToLeftSum(n);
        System.out.printf("Difference: %.15f", (sumL2R - sumR2L));
        System.out.println();
    }
    
    /**
     * Left-to-right harmonic sum.
     * 
     * @param int n 
     */
    private double printLeftToRightSum(int n)
    {
        double sum = 0.0;
        for (int i = 1; i <= n; i++) {
            sum += (double) 1/i;
        }
        System.out.printf("Left-to-right harmonic sum %.15f", sum);
        System.out.println();
        
        return sum;
    }
    
    private double printRightToLeftSum(int n)
    {
        double sum = 0.0;
        for (int i = n; i >= 1; i--) {
            sum += (double) 1/i;
        }
        System.out.printf("Right-to-left harmonic sum %.15f", sum);
        System.out.println();
        
        return sum;
    }
}
