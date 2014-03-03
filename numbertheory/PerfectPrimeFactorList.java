/**
 * Write a method isProductOfPrimeFactors(int posInt) that takes a positive integer,
 * and return true if the product of all its prime factors (excluding 1 and the number itself)
 * is equal to its value. For example, the method returns true for 30 (30=2×3×5)
 * and false for 20 (20≠2×5).
 * Write a program called PerfectPrimeFactorList that prompts user for an upper bound.
 * The program shall display all the numbers (less than or equal to the upper bound) 
 * that meets the above criteria. The output shall look like:
 * 
 * Enter the upper bound: 100
 * These numbers are equal to the product of prime factors: 
 * 1 6 10 14 15 21 22 26 30 33 34 35 38 39 42 46 51 55 57 58 62 65 66 69 70 74 77 78 82 85 86 87 91 93 94 95 
 * [36 numbers found (36.00%)]
 * 
 */

package javaexercises.numbertheory;

import java.util.Scanner;

public class PerfectPrimeFactorList {
    
    public static void main(String[] args)
    {
        System.out.print("Enter the upper bound (positive integer): ");
        Scanner in = new Scanner(System.in);
        if ( ! in.hasNextInt()) {
            System.out.println("Upper bound not valid. Please try again.");
            return;
        }
        int upperBound = in.nextInt();
        
        PerfectPrimeFactorList aPerfectPrimeFactorList = new PerfectPrimeFactorList();
        
        System.out.println(aPerfectPrimeFactorList.isProductOfPrimeFactors(30));
        System.out.println(aPerfectPrimeFactorList.isProductOfPrimeFactors(20));
        
        aPerfectPrimeFactorList.printPerfectPrimeFactors(upperBound);
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
    
    private boolean isProductOfPrimeFactors(int posInt)
    {
        int prod = 1;
        for (int i = 2; i < posInt; i++) {
            prod *= isPrime(i) && (posInt%i == 0) ? i : 1;
        }
        return (prod == posInt);
    }
    
    private void printPerfectPrimeFactors(int upperBound)
    {
        System.out.println("These numbers are equal to the product of prime factors: ");
        
        int countProductOfPrimeFactors = 0;
        for (int i = 1; i <= upperBound; i++) {
            if (! isProductOfPrimeFactors(i)) {
                continue;
            }
            System.out.printf("%1$d ", i);
            countProductOfPrimeFactors++;
        }
        System.out.printf("\n[%1$d numbers found (%2$.2f%%)]\n"
                , countProductOfPrimeFactors, ((double) 100 * countProductOfPrimeFactors/upperBound));
    }
    
}
