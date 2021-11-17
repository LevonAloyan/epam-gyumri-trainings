package algorithms;

public class MathUtil {

    public static void main(String[] args) {
//        System.out.println(pow(3, 0));
//        System.out.println(factorial(5));
       System.out.println(abs(-70));
        //System.out.println(reverse(354));
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
        int value = 1;
        for (int i = 2; i <= n; i++) {
            value = value * i;
        }
        return value;
    }


    /**
     * Calculates and returns the absolute value
     * of specified n number
     *
     * @param n specified number to find the absolute number
     * @return absolute number of specified n
     */
    public static int abs(int n) {
        if (n <= 0) {
            n *= -1;
        }
        return n;
    }


    /**
     * Reverses the specified "number" parameter by digits.
     *
     * @param number the parameter to be revered
     * @return reversed number
     */
    public static int reverse(int number) {
        int result = 0;
        while (number > 0) {
            result = result * 10 + number % 10;
            number = number / 10;
        }
        return result;
    }
}