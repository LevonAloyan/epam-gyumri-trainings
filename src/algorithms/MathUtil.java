package algorithms;

public class MathUtil {

    public static void main(String[] args) {
        System.out.println("Pow 2^5 = " + pow(2, 5));
        System.out.println("Factorial 5 = " + factorial(5));
        System.out.println("Absolute number 45 = " + abs(45));
        System.out.println("Absolute number -54 = " + abs(-54));
        System.out.println("Reversed number 5248 = " + reverse(5248));
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
        int calculatedNumber = n;

        if (n == 1) {
            return 1;
        }

        calculatedNumber *= factorial(n - 1);
        return calculatedNumber;
    }

    /**
     * Calculates and returns the absolute value
     * of specified n number
     *
     * @param n specified number to find the absolute number
     * @return absolute number of specified n
     */
    public static int abs(int n) {

        if (n >= 0) {
            return n;
        }

        return abs(n * -1);
    }

    /**
     * Reverses the specified "number" parameter by digits.
     *
     * @param number the parameter to be revered
     * @return reversed number
     */

    static int reversedNumber = 0;
    public static int reverse(int number) {
        if (number < 10) {
            reversedNumber = reversedNumber * 10 + number;
            return number;
        }

        reverse(number % 10);
        reverse(number / 10);
        return reversedNumber;
    }
}

