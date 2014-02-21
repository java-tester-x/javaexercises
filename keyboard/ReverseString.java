/**
 * Write a program, which prompts user for a String, 
 * and prints the reverse of the String.
 * 
 * The output shall look like:
 * 
 * Enter a String: abcdef
 * The reverse of String "abcdef" is "fedcba".
 * 
 */

package javaexercises.keyboard;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class ReverseString {
   
    public static void main(String[] args) {
        ReverseString aReverseString = new ReverseString();
        aReverseString.run();
    }
    
    private void run()
    {
        Scanner in = new Scanner(System.in);
        
        String str;
        System.out.print("Enter a String: ");
        str = in.next();
        
        for(int i = str.length()-1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
        System.out.println();
    }
    
}
