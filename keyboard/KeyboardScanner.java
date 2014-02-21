/**
 * Write a program called KeyboardScanner to prompt user for an int,
 * a double, and a String. The output shall look like (the inputs are shown in bold):
 * 
 * Enter an integer: 12
 * Enter a floating point number: 33.44
 * Enter your name: Peter
 * Hi! Peter, the sum of 12 and 33.44 is 45.44
 */

package javaexercises.keyboard;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class KeyboardScanner {
    
    public static void main(String[] args) {
        KeyboardScanner aKeyboardScanner = new KeyboardScanner();
        aKeyboardScanner.runScanner();
    }
    
    private void runScanner() {
        int    num1;
        double num2;
        double sum;
        String name;
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        num1 = in.nextInt();
        
        System.out.print("Enter a floating point number: ");
        num2 = in.nextDouble();
        
        System.out.print("Enter your name: ");
        name = in.next();
        
        sum = num1 + num2;
        System.out.printf("Hi! %1$s, the sum of %2$d and %3$.5f is %4$.5f \n"
                         , name, num1, num2, sum);
    }
}
