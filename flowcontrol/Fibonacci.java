/**
 * Write a program called Fibonacci to display the first 20 Fibonacci numbers F(n),
 * where F(n) = F(n–1) + F(n–2) and F(1) = F(2) =1. Also compute their average.
 * 
 * The output shall look like:
 * 
 *   The first 20 Fibonacci numbers are:
 *   1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584 4181 6765
 *   The average is 885.5
 */

package javaexercises.flowcontrol;

/**
 *
 * @author User
 */
public class Fibonacci {
    
    public static void main(String[] args) {
        Fibonacci aFibonacci = new Fibonacci();
        aFibonacci.printFiboacciAndAverage(20);
    }
    
    private void printFiboacciAndAverage(int n) {
        long   fb1 = 1;
        long   fb2 = 1;
        long   fbn = 0;
        long   sum = 0;
        
        if (n <= 0) {
            System.out.println("Please correct number of items and try again.");
            return;
        }
        
        System.out.println("The first " + n + " Fibonacci numbers are:");        
        for(int i = 1; i <= n; i++) {
            switch (i) {
                case 1: fbn = fb1; break;
                case 2: fbn = fb2; break;    
                default:
                    fbn = fb1 + fb2;
                    fb1 = fb2;
                    fb2 = fbn;
            }
            sum += fbn;
            System.out.print(fbn + " ");
        }
        System.out.println(); 
        System.out.printf("The sum is %1$d \n", sum);
        System.out.printf("The average is %.4f \n", (double)sum / n);
    }
    
}
