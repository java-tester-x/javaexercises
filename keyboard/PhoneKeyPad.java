/**
 * On your phone keypad, the alphabets are mapped to digits as follows:
 * ABC(2), DEF(3), GHI(4), JKL(5), MNO(6), PQRS(7), TUV(8), WXYZ(9). 
 * 
 * Write a program, which prompts user for a String (case insensitive),
 * and converts to a sequence of Keypad digits. Use a nested-if (or switch-case)
 * in this exercise. Modify your program to use an array for table look-up later.
 */

package javaexercises.keyboard;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class PhoneKeyPad {
    
    public static void main(String[] args) {
        PhoneKeyPad aPhoneKeyPad = new PhoneKeyPad();
        aPhoneKeyPad.run();
    }
    
    private void run()
    {
        Scanner in = new Scanner(System.in);
        
        String str;
        System.out.print("Please enter a String: ");
        str = in.next();
        
        int digit = 0;
        for(int i = 0; i < str.length(); i++)
        {
            switch (str.toUpperCase().charAt(i))
            {
                case 'A': case 'B': case 'C': digit = 2; break;
                case 'D': case 'E': case 'F': digit = 3; break;    
                case 'G': case 'H': case 'I': digit = 4; break;
                case 'J': case 'K': case 'L': digit = 5; break;
                case 'M': case 'N': case 'O': digit = 6; break;
                case 'P': case 'Q': case 'R': case 'S': digit = 7; break;
                case 'T': case 'U': case 'V': digit = 8; break;
                case 'W': case 'X': case 'Y': case 'Z': digit = 9; break;
            }
            System.out.print(digit);
        }
        System.out.println();
    }
    
}
