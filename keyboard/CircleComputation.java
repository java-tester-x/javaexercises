/**
 * Write a program, which prompts user for a radius (of double) 
 * and compute the area and perimeter of a circle.
 * 
 * The output shall look like:
 * 
 * Enter the radius: 1.2
 * The area is 4.5239
 * The perimeter is 7.5398223686155035
 * 
 * Hints: π is kept in a constant called Math.PI.
 */

package javaexercises.keyboard;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class CircleComputation {
        
    public static void main(String[] args) {
        CircleComputation aCircleComputation = new CircleComputation();
        aCircleComputation.runComputation();
    }
    
    private void runComputation()
    {
        Scanner in = new Scanner(System.in);
    
        double radius;
        System.out.printf("Enter the radius: ");
        radius = in.nextDouble();
        
        double area = Math.PI * Math.pow(radius, 2);
        System.out.printf("\nThe area is %1$.4f", area);

        double perimeter = 2*Math.PI * radius;
        System.out.printf("\nThe perimeter is %1$.16f\n", perimeter);
    }
}
