/**
 * Write a program called FibonacciInt to list all the Fibonacci numbers, 
 * which can be expressed as an int (i.e., 32-bit signed integer 
 * in the range of [-2147483648, 2147483647]). The output shall look like:
 * 
 * F(0) = 1
 * F(1) = 1
 * F(2) = 2
 * ...
 * F(45) = 1836311903
 * F(46) is out of the range of int
 * 
 * Hints:
 * The maximum and minimum values of a 32-bit int are kept in constants Integer.MAX_VALUE 
 * and Integer.MIN_VALUE, respectively. 
 * 
 * Try these statements:
 * 
 * System.out.println(Integer.MAX_VALUE);
 * System.out.println(Integer.MIN_VALUE);
 * System.out.println(Integer.MAX_VALUE + 1);
 * 
 * Take note that in the third statement, Java Runtime does not flag out an overflow error,
 * but silently wraps the number around. Hence, you cannot use F(n-1) + F(n-2) > Integer.MAX_VALUE 
 * to check for overflow. Instead, overflow occurs for F(n) if (Integer.MAX_VALUE – F(n-1)) < F(n-2)
 * (i.e., no room for the next Fibonacci number).
 * 
 * Write a similar program for Tribonacci numbers.
 */

package javaexercises.difficult;

/**
 *
 * @author User
 */
public class FibonacciInt {
    
    public static void main(String[] args)
    {
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE + 1);
        
        FibonacciInt aFibonacciInt = new FibonacciInt();
        aFibonacciInt.printFibonacci();
    }
    
    private void printFibonacci()
    {
        int fb1 = 1;
        int fb2 = 1;
        int fbn = 0;
        int i   = 1;
        
        System.out.printf("F(%1$d) = %2$d\n", 0, fb2);
        System.out.printf("F(%1$d) = %2$d\n", 1, fb1);
        while (true)
        {
            i++;
            fbn = fb1 + fb2;
            if (Integer.MAX_VALUE - fb1 > fb2) {
                System.out.printf("F(%1$d) = %2$d\n", i, fbn);
            }
            else {
                System.out.printf("F(%1$d) is out of the range of int\n", i);
                break;
            }
            fb2 = fb1;
            fb1 = fbn;
        }
    }
    
}
