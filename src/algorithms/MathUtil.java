package algorithms;

public class MathUtil {

    public static void main(String[] args) {
        System.out.println(pow(2, 0));
        int num = 76;
        reverse(num);
        System.out.println(abs(-5));
        System.out.println(factorial(-9));
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
     */
    public static int factorial(int n) {
        int plus = n;
        int minus = -n;
        if (n > 0) {
            if (n == 1) {
                return plus;
            }
            plus = minus * factorial(n - 1);
        } else if (n < 0) {
            // checking if n is odd or even, because two minus signs give us plus
            if (n == -1 && (n % 2) != 0) {
                return -minus;
            } else if (n == -1 && (n % 2) == 0) {
                return minus;
            }
            minus *= factorial(n + 1);
        }

        return (n > 0) ? plus : minus;
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
            return n * (-1);
        }
        return n;
    }


    /**
     * Reverses the specified "number" parameter by digits.
     *
     * @param number the parameter to be revered
     */
    public static int reverse(int number) {
        if (number < 10) {
            System.out.println(number);
            return number;
        }
        int reversedNumber = 0;
        while (number != 0) {
            reversedNumber = reversedNumber * 10 + number % 10; // 76/10 6
            number = number / 10; // 76/10 7
        }
        return reversedNumber;

    }
}



