/**
 * A positive integer is called a perfect number if the sum of all its factors 
 * (excluding the number itself, i.e., proper divisor) is equal to its value.
 * 
 * For example, the number 6 is perfect because its proper divisors 
 * are 1, 2, and 3, and 6=1+2+3; but the number 10 is not perfect 
 * because its proper divisors are 1, 2, and 5, and 10≠1+2+5.
 * 
 * A positive integer is called a deficient number if the sum of all its proper divisors 
 * is less than its value. For example, 10 is a deficient number because 1+2+5 < 10;
 * while 12 is not because 1+2+3+4+6>12.
 * 
 * Write a method called isPerfect(int posInt) that takes a positive integer,
 * and return true if the number is perfect. Similarly, write a method called
 * isDeficient(int posInt) to check for deficient numbers.
 * 
 * Using the methods, write a program called PerfectNumberList that prompts user
 * for an upper bound (a positive integer), and lists all the perfect numbers 
 * less than or equal to this upper bound. It shall also list all the numbers 
 * that are neither deficient nor perfect. The output shall look like:
 * 
 * Enter the upper bound: 1000
 * These numbers are perfect:
 * 6 28 496
 * [3 perfect numbers found (0.30%)]
 * 
 * These numbers are neither deficient nor perfect:
 * 12 18 20 24 30 36 40 42 48 54 56 60 66 70 72 78 80 ......
 * [246 numbers found (24.60%)]
 * 
 */

package javaexercises.numbertheory;

import java.util.Scanner;

public class PerfectNumberList {
    
    public static void main(String[] args)
    {
        PerfectNumberList aNumberTheoryUtil = new PerfectNumberList();
                
        System.out.print("Enter the upper bound (positive integer): ");
        Scanner in = new Scanner(System.in);
        if ( ! in.hasNextInt()) {
            System.out.println("Upper bound not valid. Please try again.");
            return;
        }
        int upperBound = in.nextInt();
        
        if (upperBound < 0) {
            System.out.println("Upper bound is not positive. Please try again.");
            return;
        }
        
        System.out.println("These numbers are perfect:");
        int countPerfectNumbers   = 0;
        for (int i = 1; i <= upperBound; i++) {
            if ( ! aNumberTheoryUtil.isPerfect(i)) {
                continue;
            }
            System.out.printf("%d ", i);
            countPerfectNumbers++;
        }
        System.out.printf("\n[%1$d perfect numbers found (%2$.2f%%)]\n",
                countPerfectNumbers, ((double)100 * countPerfectNumbers/upperBound)
        );
        
        System.out.println();
        
        System.out.println("These numbers are neither deficient nor perfect:");
        int countDeficientNumbers = 0;
        for (int i = 1; i <= upperBound; i++) {
            if ( aNumberTheoryUtil.isDeficient(i) || aNumberTheoryUtil.isPerfect(i)) {
                continue;
            }
            System.out.printf("%d ", i);
            countDeficientNumbers++;
        }
        System.out.printf("\n[%1$d numbers found (%2$.2f%%)]\n",
                countDeficientNumbers, ((double)100 * countDeficientNumbers/upperBound)
        );     
    }
    
    // return true if the number is perfect
    private boolean isPerfect(int posInt)
    {
        int sumDivisors = 0;
        for (int i = 1 ; i < posInt; i++) {
            sumDivisors += (posInt%i == 0) ? i : 0;
        }
        return (sumDivisors == posInt);
    }
    
    // return true if the number is deficient
    private boolean isDeficient(int posInt)
    {
        int sumDivisors = 0;
        for (int i = 1 ; i < posInt; i++) {
            sumDivisors += (posInt%i == 0) ? i : 0;
        }
        return (sumDivisors < posInt);
    }     
}
