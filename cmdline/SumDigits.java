/**
 * Write a program to sum up the individual digits of a positive integer,
 * given in the command line. The output shall look like:
 * 
 * > java SumDigits 12345
 * The sum of digits = 1 + 2 + 3 + 4 + 5 = 15
 */

package javaexercises.cmdline;

public class SumDigits {
    
    public static void main(String[] args) {
        SumDigits aSumDigits = new SumDigits();
        
        if (args.length == 0) {
            System.out.println("There are no arguments.");
            return;
        }
        
        try {
            int number = Integer.parseInt(args[0]);
            if (number < 0) {
                System.out.printf("Argument \"%1$s\" is not a positive integer \n", args[0]);
                return;
            }
            aSumDigits.run(number);
        }
        catch (NumberFormatException e) {
            System.out.printf("Argument \"%1$s\" is not an integer \n", args[0]);
        }
    }
    
    
    /**
     * 
     */
    private void run(int number)
    {
        String tmp = String.valueOf(number);
        int    sum = 0;
        
        System.out.print("The sum of digits = ");        
        for (int i = 0; i < tmp.length(); i++) {
            sum += Character.digit(tmp.charAt(i), 10);
            System.out.print( (i == 0 ? "" : " + ") + tmp.charAt(i));
        }
        System.out.print(" = " + sum + "\n");
    }
}
