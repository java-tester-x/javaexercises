/**
 * Write a program called TimeTable to produce the multiplication table 
 * of 1 to 9 as shown using two nested for-loops:
 * 
 *     |  1  2  3  4  5  6  7  8  9
 *   -------------------------------
 *   1 |  1  2  3  4  5  6  7  8  9
 *   2 |  2  4  6  8 10 12 14 16 18
 *   3 |  3  6  9 12 15 18 21 24 27
 *   4 |  4  8 12 16 20 24 28 32 36
 *   5 |  5 10 15 20 25 30 35 40 45
 *   6 |  6 12 18 24 30 36 42 48 54
 *   7 |  7 14 21 28 35 42 49 56 63
 *   8 |  8 16 24 32 40 48 56 64 72
 *   9 |  9 18 27 36 45 54 63 72 81
 * 
 * Modify the program to print the multiplication table of 1 to 12.
 */

package javaexercises.nestedloop;

/**
 *
 * @author User
 */
public class TimeTable {
    
    public static void main(String[] args) {
        TimeTable aTimeTable = new TimeTable();
        aTimeTable.printTimeTable(12);
    }
    
    private void printTimeTable(int n)
    {
        for(int i = -1; i <= n; i++) 
        {
            if (i == -1) {
                System.out.print("\t|");
            }
            else if (i == 0) {
                System.out.print("------------");
            }
            else if (i > 0) {                    
                System.out.printf("%1$d\t|", i);    
            }
            
            for(int j = 1; j <= n; j++)
            {        
                if (i == -1) {
                    System.out.printf("\t%1$d", j);
                    continue;
                }
                else if (i == 0) {
                    System.out.print("--------");
                    continue;
                }
                
                System.out.printf("\t%1$d", i * j);
            }
            System.out.println();
        }
    }
            
    
}
