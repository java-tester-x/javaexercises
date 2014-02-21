/**
 * Write a method to compute sin(x) and cos(x) using the following series expansion,
 * in a class called TrigonometricSeries. The headers of the methods are:
 * 
 * public static double sin(double x, int numTerms)   // x in radians
 * public static double cos(double x, int numTerms)
 * 
 * ExerciseBasics_TrigonometricSeries.png
 * 
 * Compare the values computed using the series with the JDK methods 
 * Math.sin(), Math.cos() at x=0, π/6, π/4, π/3, π/2 using various numbers of terms.
 * 
 * Hints: Avoid generating large numerator and denominator (which may cause 
 * arithmetic overflow, e.g., 13! is out of int range). Compute the terms as:
 * 
 * ExerciseBasics_TrigonometricSeriesHint.png
 */

package javaexercises.difficult;

public class TrigonometricSeries {
    
    public static void main(String[] args)
    {
        double  x = Math.PI/6;
        int     numTerms = 10;
        
        TrigonometricSeries aTrigonometricSeries = new TrigonometricSeries();
        
        System.out.println("Calculated values:");
        System.out.printf("sin(%1$d) = %2$f \n", (int)Math.round(x*180/Math.PI)
                , aTrigonometricSeries.sin(x, numTerms));        
        System.out.printf("cos(%1$d) = %2$f \n", (int)Math.round(x*180/Math.PI)
                , aTrigonometricSeries.cos(x, numTerms));
        
        System.out.println("java.lang.Math values:");
        System.out.printf("sin(%1$d) = %2$f \n", (int)Math.round(x*180/Math.PI)
                , Math.sin(x));        
        System.out.printf("cos(%1$d) = %2$f \n", (int)Math.round(x*180/Math.PI)
                , Math.cos(x));
    }
    
    private double calculateTerm(double x, int numTerms)
    {
        double term = 1D;
        for (int i = numTerms; i > 0; i--) {
            term *= x/i;
        }        
        return term;
    }
    
    private double sin(double x, int numTerms)
    {
        double result = 0D;
        for (int i = 0; i < numTerms; i++) {
            result += (i%2 == 0 ? 1 : -1) * calculateTerm(x, (2*i+1));
        }
        return result;
    }
    
    private double cos(double x, int numTerms)
    {
        double result = 0D;
        for (int i = 0; i < numTerms; i++) {
            result += (i%2 == 0 ? 1 : -1) * calculateTerm(x, 2*i);
        }
        return result;
    }
    
}
