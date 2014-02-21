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

public class WordGuess {
    
    public static void main(String[] args)
    {
        WordGuess aWordGuess = new WordGuess();
    }
    
}
