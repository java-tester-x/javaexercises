/**
 * Write a program called Bin2Dec to convert an input binary string 
 * into its equivalent decimal number. Your output shall look like:
 * 
 * Enter a Binary string: 1011
 * The equivalent decimal number for binary "1011" is 11
 * 
 * Enter a Binary string: 1234
 * Error: Invalid Binary String "1234"
 */

package javaexercises.keyboard;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Bin2Dec {
    
    public static void main(String[] args) {
        Bin2Dec aBin2Dec = new Bin2Dec();
        aBin2Dec.runTest("1011");
        aBin2Dec.runTest("0011");
        aBin2Dec.runTest("1010");
        aBin2Dec.runTest("1234");
        
//        Scanner in = new Scanner(System.in);
//        System.out.print("\nEnter a Binary string: ");
//        String bin = in.next();
//        aBin2Dec.runTest(bin);        
    }
    
    /**
     * Test.
     * 
     * @param binStr 
     */
    private void runTest(String binStr)
    {
        if ( ! isBin(binStr)) {
            System.out.printf("Error: Invalid Binary String \"%1$s\"\n", binStr);
            return;
        }        
        System.out.printf("The equivalent decimal number for binary \"%1$s\" is %2$d\n"
                         , binStr, convertBin2Dec(binStr));
    }
    
    /**
     * Check if string represent a binary value.
     * 
     * @param binStr
     * @return 
     */
    private static boolean isBin(String binStr)
    {
        for(int i = 0; i < binStr.length(); i++)
        {
            if (binStr.charAt(i) == '0') {
                continue;
            }
            if (binStr.charAt(i) == '1') {
                continue;
            }
            return false;
        }
        return true;
    }
    
    /**
     * Convert bin to decimal.
     * 
     * @param  bin
     * @return int
     */
    private int convertBin2Dec(String binStr)
    {
        int number = 0;
        for(int i = 0; i < binStr.length(); i++)
        {
            if (binStr.charAt(i) == '0') {
                continue;
            }
            number += Math.pow(2, (binStr.length() - 1 - i));
        }
        return number;
    }
    
}
