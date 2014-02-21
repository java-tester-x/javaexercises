/**
 * Write a program to play the number guessing game. The program shall 
 * generate a random number between 0 and 99. The player inputs his/her guess,
 * and the program shall response with "Try higher", "Try lower" or 
 * "You got it in n trials" accordingly. For example:
 * 
 * > java NumberGuess
 * Key in your guess:
 * 50
 * Try higher
 * 70
 * Try lower
 * 65
 * Try lower
 * "You got it in 4 trials!"
 * 
 * Hints: Use Math.random() to produce a random number in double between 0.0 
 * and (less than) 1.0. To produce an int between 0 and 99, use:
 * 
 * int secretNumber = (int)(Math.random()*100);
 */

package javaexercises.difficult;

import java.util.Random;
import java.util.Scanner;

public class NumberGuess {
    
    private int secretNumber;
    
    public static void main(String[] args)
    {
        NumberGuess aNumberGuess = new NumberGuess();
        aNumberGuess.generateSecretNumber(99);
        aNumberGuess.runGame();
    }

    private void generateSecretNumber(int maxValue) {
        Random rand = new Random();
        secretNumber = rand.nextInt(maxValue);
    }

    private void setSecretNumber(int secretNumber) {
        this.secretNumber = secretNumber;
    }
    
    private int getSecretNumber() {
        return secretNumber;
    }
    
    private void runGame()
    {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Key in your guess:");
        int trials = 0;
        while (true) {
            int trialNumber = (in.hasNextInt()) ? in.nextInt() : -1;

            trials++;
            if (secretNumber == trialNumber) {
                System.out.printf("You got it in %d trials!\n", trials);
                break;
            }
            else if (secretNumber > trialNumber) {
                System.out.printf("Try higher\n");
            }
            else if (secretNumber < trialNumber) {
                System.out.printf("Try lower\n");
            }
        }
    }
    
}
