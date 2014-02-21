/**
 * Write a method call toRadix() which converts a positive integer from one radix into another.
 * The method has the following header:
 * 
 * public static String toRadix(String in, int inRadix, int outRadix)  // The input and output are treated as String.
 * 
 * Write a program called NumberConversion, which prompts the user for an input number, 
 * an input radix, and an output radix, and display the converted number.
 * The output shall look like:
 *      Enter a number and radix: A1B2
 *      Enter the input radix: 16
 *      Enter the output radix: 2
 *      "A1B2" in radix 16 is "1010000110110010" in radix 2.
 */

package javaexercises.difficult;

public class NumberConversion {

    private final String alphabet = "0123456789ABCDEFGHIJKLMNOPQRSTVUWXYZ";
     
    public static void main(String[] args)
    {
        NumberConversion aNumberConversion = new NumberConversion();
        
        String numberStr = "01010101";
        int    inRadix   = 2;
        int    outRadix  = 10;
        System.out.printf("\"%1$s\" in radix %2$d is \"%3$s\" in radix %4$d.\n"
                , numberStr, inRadix
                , aNumberConversion.toRadix(numberStr, inRadix, outRadix), outRadix
        );
    }
    
    private int toInt(String in, int inRadix)
    {
        int result = 0;
        for(int i = in.length()-1; i >= 0; i--) {
            int digit = Character.digit(in.charAt(i), inRadix);
            result += digit * Math.pow(inRadix, (in.length()-1 - i));
        }
        return result;
    }
    
    private String toRadix(int number, int radix)
    {
        String result = "";
        if (radix == 0) {
            return result;
        }
        
        while (number > 0) {
            result = alphabet.charAt(number%radix) + result;
            number /= radix;
        }
        return result;
    }
        
    private String toRadix(String in, int inRadix, int outRadix) {
        if (inRadix == outRadix) {
            return in;
        }
        return toRadix(toInt(in, inRadix), outRadix);
    }
    
}
