/**
 * Exercise PrintDayInWord (nested-if, switch-case): 
 * Write a program called PrintDayInWord which prints “Sunday”, “Monday”, ... “Saturday” 
 * if the int variable "day" is 0, 1, ..., 6, respectively.  Otherwise, it shall 
 * print  “Not a valid day”.
 * Use (a) a "nested-if" statement; (b) a "switch-case" statement.
 */

package javaexercises.flowcontrol;

/**
 *
 * @author User
 */
public class PrintDayInWord {
    
    public static void main(String[] args) {
        int number = 5;
        
        PrintDayInWord aPrintDayInWord = new PrintDayInWord();        
        aPrintDayInWord.useNestedIf(number);
        aPrintDayInWord.useSwitchCase(number);
    }
    
    // -- ----------------------------------------------------------------------
    private void useNestedIf(int number) 
    {
        String numberStr = null;
        if (0 == number) {
            numberStr = "Sunday";
        } else if (1 == number) {
            numberStr = "Monday";
        } else if (2 == number) {
            numberStr = "Tuesday";
        } else if (3 == number) {
            numberStr = "Wednesday";
        } else if (4 == number) {
            numberStr = "Thursday";
        } else if (5 == number) {
            numberStr = "Friday";
        } else if (6 == number) {
            numberStr = "Saturday";
        } else {
            numberStr = "Not a valid day";
        }
        System.out.println("(a) Use a \"nested-if\" statement: " + numberStr);
    }
    
    
    // -- ----------------------------------------------------------------------
    private void useSwitchCase(int number)
    {
        String numberStr = null;
        switch (number) {
            case 0:  numberStr = "Sunday";    break;
            case 1:  numberStr = "Monday";    break;
            case 2:  numberStr = "Tuesday";   break;
            case 3:  numberStr = "Wednesday"; break;
            case 4:  numberStr = "Thursday";  break;
            case 5:  numberStr = "Friday";    break;
            case 6:  numberStr = "Saturday";  break;
            default: numberStr = "Not a valid day"; break;
        }
        System.out.println("(b) Use a \"switch-case\" statement:" + numberStr);
    }
    
}
