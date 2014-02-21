/**
 * Write a program called Product1ToN to compute the product of integers 
 * 1 to 10 (i.e., 1×2×3×...×10).
 * Try computing the product from 1 to 11, 1 to 12, 1 to 13 and 1 to 14. 
 * Write down the product obtained and explain the results.
 * 
 * Hints: Declares an int variable called product (to accumulate the product)
 * and initialize to 1.
 */

package javaexercises.flowcontrol;

/**
 *
 * @author User
 */
public class Product1ToN {
    
    public static void main(String[] args)
    {
        Product1ToN aProduct1ToN = new Product1ToN();
        aProduct1ToN.printProduct1ToN(10);
        aProduct1ToN.printProduct1ToN(11);
        aProduct1ToN.printProduct1ToN(12);
        aProduct1ToN.printProduct1ToN(13);
        aProduct1ToN.printProduct1ToN(14);
    }
    
    private void printProduct1ToN(int n)
    {
        long prod = 1L;
        for(int i=1; i <= n; i++) {
            prod *= i;
        }
        System.out.println("8. Product of integers 1 to " + n + ".");
        System.out.println(prod);
    }
}
