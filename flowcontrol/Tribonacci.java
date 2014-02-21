/**
 * Write a program called Tribonacci to display the first 20 Tribonacci numbers
 * F(n), where F(n) = F(n–1) + F(n–2) + F(n–3) and T(1) = T(2) = 1, and T(3)=2.
 * Also compute their average.
 */

package javaexercises.flowcontrol;

/**
 *
 * @author User
 */
public class Tribonacci {
    
    public static void main(String[] args) {
        Tribonacci aTribonacci = new Tribonacci();
        aTribonacci.printTribonacciAndAverage(20);
    }
    
    public void printTribonacciAndAverage(int n)
    {
        long   fb1 = 1;
        long   fb2 = 1;
        long   fb3 = 2;
        long   fbn = 0;
        long   sum = 0;
        
        if (n <= 0) {
            System.out.println("Please correct number of items and try again.");
            return;
        }
        
        System.out.println("The first " + n + " Tribonacci numbers are:");        
        for(int i = 1; i <= n; i++) {
            switch (i) {
                case 1: fbn = fb1; break;
                case 2: fbn = fb2; break;
                case 3: fbn = fb3; break;    
                default:
                    fbn = fb1 + fb2 + fb3;
                    fb1 = fb2;
                    fb2 = fb3;
                    fb3 = fbn;
            }
            sum += fbn;
            System.out.print(fbn + " ");
        }
        System.out.println(); 
        System.out.printf("The sum is %1$d \n", sum);
        System.out.printf("The average is %.4f \n", (double)sum / n);
    }
}
