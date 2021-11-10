package algorithms;

public class MathUtil {

    public static void main(String[] args) {
        System.out.println(pow(2, 3));
        System.out.println(factorial(4));
        System.out.println(abs(-7));
        System.out.println(reverse(1234567));

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
        if (pow == 1) {
            return number;
        }
        return number * pow(number, pow - 1);
    }

    /**
     * Calculates and returns the factorial of specified n number
     *
     * @param n the number factorial of which must be calculated
     * @return calculated number
     */
    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    /**
     * Calculates and returns the absolute value
     * of specified n number
     *
     * @param n specified number to find the absolute number
     * @return absolute number of specified n
     */
    public static int abs(int n) {
        return (n < 0) ? -n : n;
    }


    /**
     * Reverses the specified "number" parameter by digits.
     *
     * @param number the parameter to be revered
     * @return reversed number
     */
    public static int reverse(int number) {
        int reversedNum = 0;
        while (number != 0) {
            int digit = number % 10;
            reversedNum = reversedNum * 10 + digit;
            number /= 10;
        }
        return reversedNum;
    }


}
