/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaexercises.difficult;

/**
 *
 * @author User
 */
public class TribonacciInt {
    
    public static void main(String[] args)
    {
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE + 1);
        
        TribonacciInt aTribonacciInt = new TribonacciInt();
        aTribonacciInt.printFibonacci();
    }
    
    private void printFibonacci()
    {
        int fb3 = 1;
        int fb2 = 1;
        int fb1 = 2;
        int fbn = 0;
        int i   = 2;
        
        System.out.printf("F(%1$d) = %2$d\n", 0, fb3);
        System.out.printf("F(%1$d) = %2$d\n", 1, fb2);
        System.out.printf("F(%1$d) = %2$d\n", 2, fb1);
        while (true)
        {
            i++;
            fbn = fb1 + fb2 + fb3;
            if (Integer.MAX_VALUE - fb1 > fb2) {
                System.out.printf("F(%1$d) = %2$d\n", i, fbn);
            }
            else {
                System.out.printf("F(%1$d) is out of the range of int\n", i);
                break;
            }
            fb3 = fb2;
            fb2 = fb1;
            fb1 = fbn;
        }
    }    
}
