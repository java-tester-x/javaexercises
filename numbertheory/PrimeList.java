/**
 * A positive integer is a prime if it is divisible by 1 and itself only.
 * 
 * Write a method called isPrime(int posInt) that takes a positive integer and 
 * returns true if the number is a prime. Write a program called PrimeList that 
 * prompts the user for an upper bound (a positive integer), and lists all 
 * the primes less than or equal to it. Also display the percentage of prime 
 * (up to 2 decimal places). The output shall look like:
 * 
 * Please enter the upper bound: 10000
 * 1
 * 2
 * 3
 * ......
 * ......
 * 9967
 * 9973
 * [1230 primes found (12.30%)]
 * 
 * Hints: To check if a number n is a prime, the simplest way is try dividing n by 2 to √n.
 */

package javaexercises.numbertheory;

import java.util.Scanner;

public class PrimeList {
    
    public static void main(String[] args)
    {
        System.out.print("Enter the upper bound (positive integer): ");
        Scanner in = new Scanner(System.in);
        if ( ! in.hasNextInt()) {
            System.out.println("Upper bound not valid. Please try again.");
            return;
        }
        int upperBound = in.nextInt();

        PrimeList aPrimeList = new PrimeList();
        aPrimeList.printPrimes(upperBound);
    }
    
    
    private boolean isPrime(int posInt)
    {
        for (int i = 2; i <= Math.sqrt(posInt); i++)
        {
            if (posInt%i != 0) {
                continue;
            }
            return false;
        }
        return true;
    }
    
    private void printPrimes(int upperBound)
    {
        int countPrimes = 0;
        for (int i = 1; i <= upperBound; i++) {
            if (! isPrime(i)) {
                continue;
            }
            System.out.println(i);
            countPrimes++;
        }
        System.out.printf("\n[%1$d primes found (%2$.2f%%)]\n"
                , countPrimes, ((double)100* countPrimes/upperBound)
        );
    }
    
}
