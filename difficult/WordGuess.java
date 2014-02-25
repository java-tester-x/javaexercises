/**
 * Write a program to guess a word by trying to guess the individual characters.
 * The word to be guessed shall be provided using the command-line argument.
 * 
 * Your program shall look like:
 * > java WordGuess testing
 * Key in one character or your guess word: t
 * Trail 1: t__t___
 * Key in one character or your guess word: g
 * Trail 2: t__t__g
 * Key in one character or your guess word: e
 * Trail 3: te_t__g
 * Key in one character or your guess word: testing
 * Trail 4: Congratulation!
 * You got in 4 trials
 * 
 * Hints:
 * 1. Set up a boolean array to indicate the positions of the word
 * that have been guessed correctly.
 * 2. Check the length of the input String to determine whether the player enters 
 * a single character or a guessed word. If the player enters a single character,
 * check it against the word to be guessed, and update the boolean array that 
 * keeping the result so far.
 * 3. Try retrieving the word to be guessed from a text file (or a dictionary) randomly.
 */

package javaexercises.difficult;

import java.util.Random;
import java.util.Scanner;

public class WordGuess {
    
    private final String[] words = {
        "testing", "hello", "world", "template", "java"
    ,   "maining", "computer", "processor", "univercity"
    ,   "boolean", "string", "integer", "character"
    ,   "indicator", "controller", "model", "view"
    };
    
    private String secretWord;
    
    private boolean[] secretWordMatches;
    
    public static void main(String[] args)
    {
        WordGuess aWordGuess = new WordGuess();
        aWordGuess.setSecretWord();
        aWordGuess.runGame();
    }

    private void setSecretWord(String word) {
        secretWord = word;
    }
    
    private void setSecretWord() {
        Random rand = new Random();        
        secretWord = words[rand.nextInt(words.length-1)];
    }
    
    private String getSecretWord() {
        return secretWord;
    }
    
    private String getTrialWordWithMatches()
    {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < secretWord.length(); i++) {
           str.append( (secretWordMatches[i] ? secretWord.charAt(i) : '_') );
        }
        return str.toString();
    }
    
    
    private void checkTrialWord(char ch)
    {
        for (int i = 0; i < secretWord.length(); i++)
        {
            if (secretWordMatches[i]) {
                continue;
            }
            secretWordMatches[i] = secretWord.charAt(i) == ch;
        }        
    }
    
    private void runGame()
    {
        Scanner in = new Scanner(System.in);        
        secretWordMatches = new boolean[secretWord.length()];                
        int trials = 0;
        while (true) {
            System.out.print("Key in one character or your guess word: ");
            String trialWord = (in.hasNext()) ? in.next() : "";
            
            trials++;
            
            if (trialWord.length() < 1) {
                continue;
            }
            
            if (trialWord.length() == 1) {                
                checkTrialWord(trialWord.charAt(0));
                trialWord = getTrialWordWithMatches();
                System.out.printf("Trail %1$d: %2$s\n", trials, trialWord);
                
            }
                        
            if (trialWord.equals(secretWord)) {
                System.out.printf("Trail %d: Congratulation!\n", trials);
                break;
            }
        }
        System.out.printf("You got in %d trials\n", trials);
    }
}
