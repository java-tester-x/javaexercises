/**
 * Write a program, which reads in n grades (of int between 0 and 100, inclusive)
 * and displays the average, minimum, maximum, and standard deviation. 
 * 
 * Your program shall check for valid input. You should keep the grades in an int[]
 * and use a method for each of the computations.
 * 
 * Your output shall look like:
 * Enter the number of students: 4
 * Enter the grade for student 1: 50
 * Enter the grade for student 2: 51
 * Enter the grade for student 3: 56
 * Enter the grade for student 4: 53
 * The average is 52.5
 * The minimum is 50
 * The maximum is 56
 * The standard deviation is 2.29128784747792
 * 
 * Hints: The formula for calculating standard deviation is:
 * 
 * standard deviation = sqrt( sum[i=0..n-1]( sqr(x[i]) - sqr(average) ) * 1/n )
 */

package javaexercises.methods;

import  java.util.Scanner;

public class GradesStatistics {
    
    private final int GRADE_MINIMUM = 0;
    private final int GRADE_MAXIMUM = 100;
    
    private int[] grades;
   
    // main() method
    public static void main(String[] args)
    {
        GradesStatistics aGradesStatistics = new GradesStatistics();
       
        aGradesStatistics.readGrades();
        System.out.printf("The average is %1$.2f\n", aGradesStatistics.average());
        System.out.printf("The minimum is %1$d\n", aGradesStatistics.min());
        System.out.printf("The maximum is %1$d\n", aGradesStatistics.max());
        System.out.printf("The standard deviation is %1$.15f \n", aGradesStatistics.stdDev());
    }
   
    // read students' grades
    private void readGrades()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numberStudens = in.nextInt();
       
        grades = new int[numberStudens];
                
        int i = 0;
        while (i < numberStudens)
        {
            System.out.printf("Enter the grade for student %1$d: ", (i+1));
            int grade = in.nextInt();
            if (GRADE_MINIMUM <= grade && grade <= GRADE_MAXIMUM)
            {
                grades[i] = grade;
                i++;
            }
            else {
                System.out.println("Error! Grade must be integer between 0 and 100!");
            }
        }
    } 
    
    private int min()
    {
        if (grades.length == 0) {
            return 0;
        }

        int min = grades[0];
        for (int i = 0; i < grades.length; i++) {
            min = (min > grades[i]) ? grades[i] : min;
        }
        return min;
    }
    
    private int max()
    {
        if (grades.length == 0) {
            return 0;
        }

        int max = grades[0];
        for (int i = 0; i < grades.length; i++) {
            max = (max < grades[i]) ? grades[i] : max;
        }
        return max;
    }

    private double average()
    {        
        if (grades.length == 0) {
            return 0.0;
        }
        
        double sum = 0.0;
        for (int i = 0; i < grades.length; i++) {
            sum += grades[i];
        }
        return (sum / grades.length);
    }
        
    private double stdDev()
    {
        if (grades.length == 0) {
            return 0f;
        }
        
        double avg = average();
        double sum = 0;
        for(int i = 0; i < grades.length; i++) {
            sum += grades[i] * grades[i] - avg * avg;
        }        
        return Math.sqrt(sum / grades.length);
    }
    
    
}
