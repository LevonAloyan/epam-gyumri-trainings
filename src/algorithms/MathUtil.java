package algorithms;

public class MathUtil {

    static int reverseNumber = 0;

    public static void main(String[] args) {

        System.out.println(pow(2, 0));
        System.out.println(factorial(5));
        System.out.println(factorialSec(4));
        System.out.println(abs(20));
        System.out.println(reverse(68497));
        System.out.println(reverseSec(68497));

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

    // 1 option
    public static int factorial(int n) {

        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);

    }



    //2 option
    public static int factorialSec(int n) {

        int fact = 1;
        if (n == 0) {
            fact = 1;
        }

        for(int i = 1; i < n+1; i++) {
            fact *= i;
        }
        return fact;
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
            return (-1) * n;
        }

        return n;
    }


    /**
     * Reverses the specified "number" parameter by digits.
     *
     * @param number the parameter to be revered
     * @return reversed number
     */
    // 1 option

      public static int reverseSec(int number) {
        int reverse_number = 0;

        while(number>=1){
            reverse_number = 10*reverse_number + (number % 10);
            number /= 10;

        }
        return reverse_number;

        }

    //2 option
    public static int reverse(int number) {
        if (number < 1) {
            return 0;
        }

        reverseNumber = 10 * reverseNumber + (number % 10);
        number = number / 10;
        reverse(number);

        return reverseNumber;

    }


}
