package algorithms;

public class MathUtil {

    public static void main(String[] args) {
        System.out.println(pow(2, -2));
        // System.out.println(reverse(19960907));
        System.out.println(factorial(-6));
        // System.out.println(abs(-7));

    }

    /**
     * Returns the value of the first argument raised to the power of the
     * second argument, such that a > 0 and n > 0.
     *
     * @param number the base
     * @param pow    the exponent
     * @return the value <code>a<sup>b</sup></code>.
     */
    public static double pow(double number, int pow) {
        double negativePow = 1 / number;
        double positivePow = number;

        if (pow < 0) {
            if (pow == -1) {
                return negativePow;
            }
            negativePow *= pow(number, pow + 1);
        } else {
            if (pow == 0) {
                return 1;
            } else if (pow == 1) {
                return positivePow;
            }

            positivePow *= pow(number, pow - 1);
        }

        return (pow < 0) ? negativePow : positivePow;
    }

    /**
     * Calculates and returns the factorial of specified n number
     *
     * @param n the number factorial of which must be calculated
     * @return calculated number
     */
    public static int factorial(int n) {
        int positiveFact = n;
        int negativeFact = -n;
        if (n >= 0) {
            if (n == 1 || n == 0) {
                return positiveFact;
            }
            positiveFact *= factorial(n - 1);
        } else {
            if (n == -1) {
                return -1;
            }
            negativeFact *= factorial(n+1);
        }

        return (n > 0) ? positiveFact : negativeFact;
    }

    /**
     * Calculates and returns the absolute value
     * of specified n number
     *
     * @param n specified number to find the absolute number
     * @return absolute number of specified n
     */
    public static int abs(int n) {
        return (n >= 0) ? n : -n;
    }


    /**
     * Reverses the specified "number" parameter by digits.
     *
     * @param number the parameter to be revered
     * @return reversed number
     */
    public static int reverse(int number) {
        int reversedNumber = 0;
        int reminder = 0;
        while (number > 0) {
            reminder = number % 10;
            number /= 10;
            reversedNumber = reversedNumber * 10 + reminder;
        }

        return reversedNumber;
    }


}