/**
 * Write a program called CozaLozaWoza which prints the numbers 1 to 110,
 * 11 numbers per line. The program shall print "Coza" in place of the numbers 
 * which are multiples of 3, "Loza" for multiples of 5, "Woza" for multiples of 7,
 * "CozaLoza" for multiples of 3 and 5, and so on.
 * 
 * The output shall look like:
 * 
 *   1 2 Coza 4 Loza Coza Woza 8 Coza Loza 11 
 *   Coza 13 Woza CozaLoza 16 17 Coza 19 Loza CozaWoza 22 
 *   23 Coza Loza 26 Coza Woza 29 CozaLoza 31 32 Coza
 */

package javaexercises.flowcontrol;

/**
 *
 * @author User
 */
public class CozaLozaWoza {
    
    public static void main(String[] args) {
        CozaLozaWoza aCozaLozaWoza = new CozaLozaWoza();
        aCozaLozaWoza.printCozaLozaWoza(110, 11);
    }
    
    
    /**
     * Print Coza Loza Woza in line.
     * 
     * @param itemsPerLine 
     */
    private void printCozaLozaWoza(int itemsCount, int itemsPerLine)
    {
        boolean clwFlag;
        for (int i = 1; i <= itemsCount; i++) {
            clwFlag = false;
            if (i % 3 == 0) {
                System.out.print("Coza");
                clwFlag = true;
            }
            if (i % 5 == 0) {
                System.out.print("Losa");
                clwFlag = true;
            }
            if (i % 7 == 0) {
                System.out.print("Woza");
                clwFlag = true;
            }            
            if ( ! clwFlag) {
                System.out.print(i);
            }
            System.out.print(" ");
            
            if (i % 11 == 0) {
                System.out.println();
            }          
        }
        System.out.println();        
    }
}
