package algorithms;

public class MathUtil {

    public static void main(String[] args) {
        System.out.println(pow(5, 5));
        System.out.println(factorial(5));
        System.out.println(factorialWithForLoop(5));
        System.out.println(abs(-5));
        System.out.println(reverse(13579));

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

        if (n <= 2) {
            return n;
        }

        return n * factorial(n - 1);
    }

    public static int factorialWithForLoop(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) result *= i;

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

        if (n < 0) {
            return -n;
        } else return n;
    }


    /**
     * Reverses the specified "number" parameter by digits.
     *
     * @param number the parameter to be revered
     * @return reversed number
     */
    public static int reverse(int number) {
        int reversed = 0;
        while (number != 0){
            int digit = number%10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        return reversed;
    }


}
