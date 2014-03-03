/**
 * One of the earlier known algorithms is the Euclid algorithm to find 
 * the GCD of two integers (developed by the Greek Mathematician Euclid around 300BC).
 * 
 * By definition, GCD(a, b) is the greatest factor that divides both a and b.
 * Assume that a and b are positive integers, and a≥b, the Euclid algorithm 
 * is based on these two properties:
 * 
 * GCD(a, 0) = a
 * GCD(a, b) = GCD(b, a mod b), where (a mod b) denotes the remainder of a divides by b.
 * 
 * For example,
 * GCD(15, 5) = GCD(5, 0) = 5
 * GCD(99,88) = GCD(88,11) = GCD(11,0) = 11
 * GCD(3456,1233) = GCD(1233,990) = GCD(990,243) = GCD(243,18) = GCD(18,9) = GCD(9,0) = 9
 * The pseudocode for the Euclid algorithm is as follows:
 * GCD(a, b)    // assume that a ≥ b
 * while (b != 0) {
 *    // Change the value of a and b: a ← b, b ← a mod b, and repeat until b is 0
 *    temp ← b
 *    b ← a mod b
 *    a ← temp
 * }
 * // after the loop completes, i.e., b is 0, we have GCD(a, 0)
 * GCD is a
 * 
 * 1. Write a method called gcd() with the following signature:
 * public static int gcd(int a, int b)
 * 
 * 2. Your methods shall handle arbitrary values of a and b, and check for validity.
 * 
 * 3. TRY: Write a recursive version called gcdRecursive() to find the GCD.
 */

package javaexercises.numbertheory;

public class GreatestCommonDivisor {
    
    public static void main(String[] args)
    {
        GreatestCommonDivisor aGCD = new GreatestCommonDivisor();
        
        System.out.println("gcd(15, 5)     = " + aGCD.gcd(15, 5));
        System.out.println("gcd(99, 88)    = " + aGCD.gcd(99, 88));
        System.out.println("gcd(3456,1233) = " + aGCD.gcd(3456, 1233));

        System.out.println("gcd(15, 5)     = " + aGCD.gcdRecursive(15, 5));
        System.out.println("gcd(99, 88)    = " + aGCD.gcdRecursive(99, 88));
        System.out.println("gcd(3456,1233) = " + aGCD.gcdRecursive(3456, 1233));        
    }
    
    private int gcd(int a, int b)
    {
        int temp;
        if (a < b) {
            temp = a;
            a    = b;
            b    = temp;
        }
        
        while (b != 0) {
            temp = b;
            b    = a % b;
            a    = temp;
        }
                
        return a;
    }
    
    private int gcdRecursive(int a, int b)
    {
        if (b == 0) {
            return a;
        }

        int temp;
        if (a < b) {
            temp = a;
            a    = b;
            b    = temp;
        }
        
        temp = b;
        b    = a % b;
        a    = temp;
        return gcdRecursive(a, b);
    }
}
