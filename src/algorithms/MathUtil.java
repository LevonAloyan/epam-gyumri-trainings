package algorithms;

public class MathUtil {

    public static void main(String[] args) {
        System.out.println(pow(2, 0));
        System.out.println(factorial(5));
        System.out.println(abs(-7));
        reverse(-7953);

    }

    /**
     * Returns the value of the first argument raised to the power of the
     * second argument, such that a > 0 and n > 0.
     *
     * @param number the base
     * @param pow the exponent
     * @return the value <code>a<sup>b</sup></code>.
     */
    public static int pow(int number, int pow){
        int result = number;

        if (pow == 0){
            return 1;
        }

        if (pow == 1){
            return number;
        }

        result *= pow(number, pow-1);

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

        if(n == 1 ) return n;

        result = factorial(n-1) * n;

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
        return (n < 0) ? -n : n;
    }


    /**
     * Reverses the specified "number" parameter by digits.
     *
     * @param number the parameter to be revered
     * @return reversed number
     */
    public static int reverse(int number) {
        int result = 0;

        if (number == 0) return 0;

        if (number > 0) {
            while (number != 0) {
                result = number % 10;
                number = number / 10;
                System.out.print(result);
            }
        } else {
            System.out.print("-");
            while (number != 0) {
                result = number % 10;
                number = number / 10;
                System.out.print(-(result));
            }
        }
        return 0;
    }

}
