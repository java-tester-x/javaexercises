/**
 * Write a program called Hex2Dec to convert an input hexadecimal string 
 * into its equivalent decimal number. Your output shall look like:
 * 
 * Enter a Hexadecimal string: 1a
 * The equivalent decimal number for hexadecimal "1a" is 26
 * 
 * Enter a Hexadecimal string: 1y3
 * Error: Invalid Hexadecimal String "1y3"
 */

package javaexercises.keyboard;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Hex2Dec {
    
    private static final int HEX_RADIX = 16;
    
    public static void main(String[] args) {
        Hex2Dec aHex2Dec = new Hex2Dec();
        aHex2Dec.runTest("1a");
        aHex2Dec.runTest("1A");
        aHex2Dec.runTest("Aa");
        aHex2Dec.runTest("1y3");

//        Scanner in = new Scanner(System.in);
//        System.out.print("\nEnter a Hexadecimal string: ");
//        String hex = in.next();
//        aHex2Dec.runTest(hex);                
    } 
    
    /**
     * Test.
     * 
     * @param binStr 
     */
    private void runTest(String hexStr)
    {
        if ( ! isHex(hexStr)) {
            System.out.printf("Error: Invalid Hexadecimal String \"%1$s\"\n", hexStr);
            return;
        }        
        System.out.printf("The equivalent decimal number for hexadecimal \"%1$s\" is %2$d\n"
                         , hexStr, convertHex2Dec(hexStr));
    }
    
    /**
     * Check if string represent a binary value.
     * 
     * @param binStr
     * @return 
     */
    private static boolean isHex(String hexStr)
    {
        for(int i = 0; i < hexStr.length(); i++)
        {
            if (Character.digit(hexStr.toLowerCase().charAt(i), HEX_RADIX) > 0 ) {
                continue;
            }
            return false;
        }
        return true;
    }
    
    private long convertHex2Dec(String hexStr) 
    {
        long number = 0;
        int  digit;
        for(int i = 0; i < hexStr.length(); i++) {
            digit = Character.digit(hexStr.toLowerCase().charAt(i), HEX_RADIX);
            number += digit * Math.pow(HEX_RADIX, (hexStr.length() - 1 - i));
        }
        return number;
    }
}
