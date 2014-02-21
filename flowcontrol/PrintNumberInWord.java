/*
 * Exercise PrintNumberInWord (nested-if, switch-case): 
 * Write a program called PrintNumberInWord which prints "ONE", "TWO",... ,
 * "NINE", "OTHER" if the int variable "number" is 1, 2,... , 9, or other, respectively.
 * Use (a) a "nested-if" statement; (b) a "switch-case" statement.
 */

package javaexercises.flowcontrol;

/**
 *
 * @author User
 */
public class PrintNumberInWord {
    
    public static void main(String[] args) {
        int number = 5;
        useNestedIf(number);
        useSwitchCase(number);
    }
    
    private static void useNestedIf(int number)
    {
        String numberStr = null;
        if (0 == number) {
            numberStr = "ZERO";
        } else if (1 == number) {
            numberStr = "ONE";
        } else if (2 == number) {
            numberStr = "TWO";
        } else if (3 == number) {
            numberStr = "THREE";
        } else if (4 == number) {
            numberStr = "FOUR";
        } else if (5 == number) {
            numberStr = "FIVE";
        } else if (6 == number) {
            numberStr = "SEX";
        } else if (7 == number) {
            numberStr = "SEVEN";
        } else if (8 == number) {
            numberStr = "EIGHT";
        } else if (9 == number) {
            numberStr = "NINE";
        } else {
            numberStr = "OTHER";
        }
        System.out.println("(a) Use a \"nested-if\" statement: " + numberStr);
    }
    
    private static void useSwitchCase(int number)
    {
        String numberStr = null;
        switch (number) {
            case 0:  numberStr = "ZERO";  break;
            case 1:  numberStr = "ONE";   break;
            case 2:  numberStr = "TWO";   break;
            case 3:  numberStr = "THREE"; break;
            case 4:  numberStr = "FOUR";  break;
            case 5:  numberStr = "FIVE";  break;
            case 6:  numberStr = "SEX";   break;
            case 7:  numberStr = "SEVEN"; break;
            case 8:  numberStr = "EIGHT"; break;
            case 9:  numberStr = "NINE";  break;
            default: numberStr = "OTHER"; break;
        }
        System.out.println("(b) Use a \"switch-case\" statement: " + numberStr);
    }
    
}
