/**
 * A word that reads the same backward as forward is called a palindrome, 
 * e.g., "mom", "dad", "racecar", "madam", and "Radar" (case-insensitive).
 * 
 * Write a program called TestPalindromicWord, that prompts user for a word 
 * and prints ""xxx" is|is not a palindrome".
 * 
 * Hints: Read in a word and convert to lowercase via in.next().toLowercase().
 */

package javaexercises.keyboard;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class TestPalindromicWord {
    
    public static void main(String[] args) {
        TestPalindromicWord aTestPalindromicWord = new TestPalindromicWord();
        //aTestPalindromicWord.run("Madam");
        //aTestPalindromicWord.run("raDar");
        //aTestPalindromicWord.run("DaD");
        //aTestPalindromicWord.run("maM");
        
        Scanner in = new Scanner(System.in);
        String  word;
        System.out.print("Please enter a word to test it for palindromic: ");
        word = in.next();
        aTestPalindromicWord.run(word);
    }
    
    private void run(String word)
    {
        String reverseWord = "";
        for(int i = word.length() - 1; i >= 0 ; i--) {
            reverseWord += word.toLowerCase().charAt(i);
        }
        
        if (word.toLowerCase().equals(reverseWord.toLowerCase())) {
            System.out.printf("%1$s is a palindrome.\n", word);
        } else {
            System.out.printf("%1$s is not a palindrome.\n", word);
        }
    }
    
}
