package algorithms;

import java.util.Arrays;

public class MathUtil {

    public static void main(String[] args) {
//        System.out.println(pow(2, 0));
//        System.out.println(factorial(3));
        System.out.println(reverse(123));

    }

    /**
     * Returns the value of the first argument raised to the power of the
     * second argument, such that a > 0 and n > 0.
     *
     * @param number the base
     * @param pow    the exponent
     * @return the value <code>a<sup>b</sup></code>.
     */
    public static int pow(int number, int pow) {
        int result = number;

        if (pow == 0) {
            return 1;
        }
        if (pow == 1) {
            return number;
        }
        result *= pow(number, pow - 1);

        return result;
    }

    /**
     * Calculates and returns the factorial of specified n number
     *
     * @param n the number factorial of which must be calculated
     * @return calculated number
     */
    public static int factorial(int n) {

        int result = 1;
/**
 // without recursive method

 for (int i = 1; i <= n; i++) {
 result = result * i;
 }
 return result;

 */
        if (n < 1) {
            return result;
        } else {
            return n * factorial(n - 1);
        }
    }

    /**
     * Calculates and returns the absolute value
     * of specified n number
     *
     * @param n specified number to find the absolute number
     * @return absolute number of specified n
     */
    public static int abs(int n) {
        return 0;
    }


    /**
     * Reverses the specified "number" parameter by digits.
     *
     * @param number the parameter to be revered
     * @return reversed number
     */
    public static int reverse(int number) {
        int reverseNumber = 0;
        /*
//         another variant,working, but....

        if (number != 0) {
            char[] charArray = String.valueOf(number).toCharArray();
            System.out.println(charArray);

            for (int i = charArray.length - 1; i >= 0; i--) {
                reverseNumber = reverseNumber * 10 + Character.getNumericValue(charArray[i]);
            }
        }
*/
        while (number != 0) {
            int remainderNumber = number % 10;
//            System.out.println(remainderNumber +"remainderNumber");
            reverseNumber = reverseNumber * 10 + remainderNumber;
            number = number / 10;
        }
        return reverseNumber;

    }
}
