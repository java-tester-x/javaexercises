/**
 * Write a method called reverseArray() with the following signature:
 * 
 * public static void reverseArray(int[] intArray)
 * 
 * The method accepts an int array, and reverses its orders.
 * For example, if the input array is {12, 56, 34, 79, 26},
 * the reversal is {26, 79, 34, 56, 12}. 
 * 
 * 1. You MUST NOT use another array in your method (but you need a temporary 
 * variable to do the swap). 
 * 
 * 2. Take note that the array passed into the method can be modified by the method 
 * (this is called "pass by reference"). On the other hand, primitives passed 
 * into a method cannot be modified. This is because a clone is created and 
 * passed into the method instead of the original copy (this is called "pass by value").
 */

package javaexercises.methods;

public class ReverseArrayTest {
    
    public static void main(String[] args) {
        ReverseArrayTest aReverseArrayTest = new ReverseArrayTest();
        
        int[] intArray = {12, 56, 34, 79, 26, 100};
        aReverseArrayTest.printArray(intArray);
        aReverseArrayTest.reverseArray(intArray);
        aReverseArrayTest.printArray(intArray);
    }
    
    private void reverseArray(int[] intArray) {
        if (intArray.length == 0) {
            return;
        }
        
        for(int i = 0; i < intArray.length / 2; i++) {
            int tmp     = intArray[i];
            intArray[i] = intArray[intArray.length - i -1];
            intArray[intArray.length - i - 1] = tmp;
        }
    }
    
    private void printArray(int[] intArray) {
        for(int i = 0; i < intArray.length; i++) {
            System.out.printf("%d ", intArray[i]);
        }
        System.out.println();
    }
}
