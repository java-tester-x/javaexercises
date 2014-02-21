/**
 * Write a program called Factorial1to10, to compute the factorial of n, 
 * for 1 ≤ n ≤ 10. Your output shall look like:
 * 
 * The factorial of 1 is 1
 * The factorial of 2 is 2
 * ...
 * The factorial of 10 is 3628800
 * 
 * Modify your program (called FactorialInt), to list all the factorials, 
 * that can be expressed as an int (i.e., 32-bit signed integer). Your output 
 * shall look like:
 * 
 * The factorial of 1 is 1
 * The factorial of 2 is 2
 * ...
 * The factorial of 12 is 479001600
 * The factorial of 13 is out of range
 * 
 * Hints: Overflow occurs for Factorial(n+1) if (Integer.MAX_VALUE / Factorial(n)) < (n+1).
 * Modify your program again (called FactorialLong) to list all the factorial 
 * that can be expressed as a long (64-bit signed integer). The maximum value 
 * for long is kept in a constant called Long.MAX_VALUE.
 */

package javaexercises.difficult;

public class FactorialInt {
    
    public static void main(String[] args)
    {
        FactorialInt aFactorialInt = new FactorialInt();
        
        System.out.println("Int factorials:");
        aFactorialInt.printIntFactorials();
        
        System.out.println("Long factorials:");
        aFactorialInt.printLongFactorials();
    }
    
    private void printIntFactorials()
    {
        int i  = 1;
        int fn = 1;
        while (true)
        {
            System.out.printf("The factorial of %1$d is is %2$d.\n", i, fn);
            if (Integer.MAX_VALUE / fn < (i+1)) {
                System.out.printf("The factorial of %d is out of range.\n", (i+1));
                break;
            }
            i++;
            fn *= i;
        }
         
    }
    
    private void printLongFactorials()
    {
        long i  = 1L;
        long fn = 1L;
        while (true)
        {
            System.out.printf("The factorial of %1$d is is %2$d.\n", i, fn);
            if (Long.MAX_VALUE / fn < (i+1)) {
                System.out.printf("The factorial of %d is out of range.\n", (i+1));
                break;
            }
            i++;
            fn *= i;
        }
         
    }
}
