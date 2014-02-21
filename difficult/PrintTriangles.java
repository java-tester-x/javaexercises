/**
 * Write a method to print each of the following patterns using nested-loops 
 * in a class called PrintTriangles. The signatures of the methods are:
 * 
 * public static void printXxxTriangle(int numRows)  // Xxx is the pattern's name
 * 
 * Write the main() which prompts the user for the numRows and prints all the patterns.
 *                             1
 *                         1   2   1
 *                     1   2   4   2   1
 *                 1   2   4   8   4   2   1
 *             1   2   4   8  16   8   4   2   1
 *         1   2   4   8  16  32  16   8   4   2   1
 *     1   2   4   8  16  32  64  32  16   8   4   2   1
 * 1   2   4   8  16  32  64 128  64  32  16   8   4   2   1
 *                   (a) PowerOf2Triangle
 *   
 * 1                                      1
 * 1  1                                 1   1
 * 1  2  1                            1   2   1
 * 1  3  3  1                       1   3   3   1
 * 1  4  6  4  1                  1   4   6   4   1
 * 1  5 10 10  5  1             1   5  10  10   5   1
 * 1  6 15 20 15  6  1        1   6  15  20  15   6   1
 * (b) PascalTriangle1           (c) PascalTriangle2
 * 
 */

package javaexercises.difficult;

/**
 *
 * @author User
 */
public class PrintTriangles {
    
    public static void main(String[] args) {
        
        PrintTriangles aPrintTriangles = new PrintTriangles();
        
        System.out.println("(a) PowerOf2Triangle");
        aPrintTriangles.printPowerOf2Triangle(7);
        System.out.println();
        
        System.out.println("(b) PascalTriangle1");
        aPrintTriangles.printPascalTriangle1(7);
        System.out.println();
        
        System.out.println("(c) PascalTriangle2");
        aPrintTriangles.printPascalTriangle2(7);
        System.out.println();
    }
    
    private void printPowerOf2Triangle(int numRows)
    {
        for (int i = 1; i <= numRows; i++)
        {
            for (int j = 1; j <= 2 * numRows; j++) 
            {
                if (j == numRows+1) {
                    continue;
                }
                
                int k = (j < numRows+1) ? j : 2*numRows-j+1;
                if (k >= numRows+1-i) {
                    int x = (int) Math.pow(2, (i+k-numRows - 1));
                    System.out.printf("%3d", x);
                }
                else {
                    System.out.print("   ");
                }
                System.out.print(" ");                
            }
            System.out.println();
        }
    }
    
    private void printPascalTriangle1(int numRows)
    {
        // generate array for Pascal Triangle
        int[][] intArray = new int[numRows][numRows];
        for (int i = 0; i < numRows; i++)
        {
            for (int j = 0; j < numRows; j++) 
            {
                intArray[i][j] = 0;
                if (j == 0 || i == j) {
                    intArray[i][j] = 1;
                }
                else if (j < i) {
                    intArray[i][j] = intArray[i-1][j] + intArray[i-1][j-1];
                }
            }
        }
        
        // print Pascal Triangle's array
        for (int[] a : intArray)
        {
            for (int x : a)
            {
                if (x == 0) {
                    System.out.printf("%3s", "");
                    continue;
                }
                System.out.printf("%2d ", x);
            }
            System.out.println();
        }
    }
    
    private void printPascalTriangle2(int numRows) {
        
    }
    
}
