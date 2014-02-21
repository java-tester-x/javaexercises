/**
 * Write a method to compute the sum of the series in a class called SpecialSeries.
 * 
 * sum = x + [1/2] * (x<3>/3) +  [(1*3)/(2*4)] * (x<5>/5) + [(1*3*5)/(2*4*6)] * (x<7>/7) + ...
 * 
 * The signature of the method is:
 * public static double sumOfSeries(double x, int numTerms)
 */

package javaexercises.difficult;

/**
 *
 * @author User
 */
public class SpecialSeries {
    
    public static void main(String[] args)
    {
        SpecialSeries aSpecialSeries = new SpecialSeries();
        
        double x = 0.1D;
        System.out.printf("Sum of the series: %.9f \n"
                , aSpecialSeries.sumOfSeries(x, 5));
    }
    
    private double calculateTerm(double x, int numTerms)
    {
        double term = 1D;
        for (int i = (2*numTerms+1); i > 0; i--) {
            term *= x*(i%2 == 0 ? 1 : i)/(i%2 == 0 ? i : 1);
        }
        term /= 2*(2*numTerms+1);
        return term; 
    }
        
    private double sumOfSeries(double x, int numTerms)
    {
        if (x < -1D || x > 1D) {
            System.out.println("Please ensure what x value in range [-1; 1] and try again.");
            return 0D;
        }
        
        double result = 0D;        
        for (int i = 0; i < numTerms; i++) {
            result += calculateTerm(x, i);
        }        
        return result;
    }
}
