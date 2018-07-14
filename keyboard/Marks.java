/**
 * Write a program in Java called Marks, which prompts user for the number of marks, 
 * reads it from the keyboard, and saves it in an int variable called numOfMarks. 
 * It then prompts user for the marks and saves them in an int array called marks. 
 * 
 * Program shall check that the marks value is between 0 and 100 and 
 * the number of marks is between 1 to 30. The program should display number of marks
 * that are more than 50.
 * 
 *  An example of output is shown below:
 * 
 *     Enter the number of marks: 2
 *     Enter marks 1: 112
 *     Invalid marks.. try again...
 *     Enter marks 1: 49
 *     Enter marks 2: 60
 *     Number of marks more than 50 is 1
 * 
 * Note: This program can be written in a structured way.
 */

import java.util.Scanner;

public class Marks {

    private static final int MAX_NUM_OF_MARKS =  30;
    private static final int LO_MARK_VALUE    =   0;
    private static final int HI_MARK_VALUE    = 100;
    private static final int BOUND_MARK_VALUE =  50;

    private static Scanner in = new Scanner(System.in);

    /**
     * Endpoint.
     * 
     * @param  args  input params
     */
    public static void main(String[] args)
    {
        int numOfMarks = readNumOfMarks();
        if (numOfMarks == 0) {
            System.out.println("Program is terminated. Bye...");
            System.exit(0);
        }

        int numOverBoundMarks = 0;
        int[] marks = new int[numOfMarks];
        for (int i = 0; i < numOfMarks; i++) {
            marks[i] = readMark( (i+1) );
            numOverBoundMarks += (marks[i] > BOUND_MARK_VALUE) ? 1 : 0; 
        }

        System.out.println("Number of marks more than 50 is " + numOverBoundMarks);
    }

    /**
     * Read mark.
     * 
     * @param  markIdx  index of mark
     * @return          marks value
     */
    private static int readMark(int markIdx)
    {
        int mark = -1;
        do {
            mark = readInt(String.format("Enter marks %d: ", markIdx));
            if ( mark >= LO_MARK_VALUE && mark <= HI_MARK_VALUE ) {
                break;
            }
            System.out.println("Invalid marks.. try again... ");
        }
        while (true);

        return mark;
    }

    /**
     * Read number of marks.
     * 
     * @return number of marks.
     */
    private static int readNumOfMarks()
    {
        int num      = 0;
        int attempts = 0;
        while (true) 
        {
            num = readInt("Enter the number of marks: ");
            attempts++;

            if ( (num > MAX_NUM_OF_MARKS) && (attempts < 3) ) {
                System.out.println("Invalid number of marks.. try again... remaining attempts: "+(3-attempts));
                continue;
            }
            break;
        }
        return num;
    }

    /**
     * Read int value from keyboard.
     * 
     * @param  inputMessage  Welcome message
     * @return               int value 
     */
    private static int readInt(String inputMessage) {
        System.out.print(inputMessage);
        return in.nextInt();
    }

}