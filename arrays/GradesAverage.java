/**
 * Write a program called GradesAverage, which prompts user for the number of students,
 * reads it from the keyboard, and saves it in an int variable called "numStudents".
 * It then prompts user for the grades of each of the students and saves them 
 * in an int array called "grades".  
 * Your program shall check that the grade is between 0 and 100.
 * 
 * A sample session is as follow:
 * 
 * Enter the number of students: 3
 * Enter the grade for student 1: 55
 * Enter the grade for student 2: 108
 * Invalid grade, try again...
 * Enter the grade for student 2: 56
 * Enter the grade for student 3: 57
 * 
 * The average is 56.0
 */

package javaexercises.arrays;

import java.util.Scanner;


public class GradesAverage {
    
    private final int LOWEST_GRADE  = 0;
    private final int HIGHEST_GRADE = 100;
    
    // student's grades
    private int[] grades;
    
    private Scanner in;
    
    /**
     * Enter program's point.
     * 
     * @param args 
     */
    public static void main(String[] args)
    {
        GradesAverage aGradesAverage = new GradesAverage();
        aGradesAverage.in = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = aGradesAverage.in.nextInt();
                
        aGradesAverage.run(numStudents);
    }
        
    /**
     * Run program.
     * 
     * @param numStudents 
     */
    private void run(int numStudents)
    {
        if (numStudents <= 0) {
            System.out.println("Invalid number of students.");
            return;
        }        
        grades = new int[numStudents];
        
        double sum = 0;
        int    i   = 0;
        while (i < numStudents)
        {
            System.out.printf("Enter the grade for student %1$d: ", (i+1));
            int grade = in.nextInt();
            
            // chek if grade is between 0 and 100
            if ((grade >= LOWEST_GRADE) && (grade <= HIGHEST_GRADE)) {
                grades[i] = grade;
                sum      += grade;
                i++;
                continue;
            }
            System.out.println("Invalid grade, try again...");
        }
        System.out.printf("The average is %1$.2f\n", (sum / numStudents));
    }
    
}
