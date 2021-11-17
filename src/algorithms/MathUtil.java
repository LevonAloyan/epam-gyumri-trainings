package algorithms;

public class MathUtil {

    public static void main(String[] args) {
        System.out.println(pow(2, 0));
        System.out.println();
        System.out.println(factorial(4));
        System.out.println();
        System.out.println(abs(-10));
        System.out.println();
        int reverse = reverse(55644);
        System.out.println(reverse);

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
        int result;
        if (n == 1)
            return 1;
        result = factorial(n - 1) * n;
        return result;
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
        String reverse = String.valueOf(number);
        char[] chars = reverse.toCharArray();
        String rev = "";
        for (int i = chars.length - 1; i >= 0; i--) {
            rev += chars[i];
        }
        return Integer.parseInt(rev);
    }


}
