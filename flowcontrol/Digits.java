/**
 * Write a program to extract each digit from an int, in the reverse order.
 * 
 * For example, if the int is 1542, the output shall be "2,4,5,1", 
 * with a comma separating the digits
 */

package javaexercises.flowcontrol;

/**
 *
 * @author User
 */
public class Digits {
    
    public static void main(String[] args) {
        Digits aDigits = new Digits();
        aDigits.printDigits(1542, ',');
    }
    
    private void printDigits(long number, char separator)
    {
        long digit;
        
        System.out.printf("Digits from number %1$d in the reverse order are:\n", number);
        do{
            digit  = number % 10;
            number = number / 10;
            System.out.print(digit);
            if (number > 0) {
                System.out.print(separator);
            }            
        } while(number > 0);
        System.out.println();
    }
}
