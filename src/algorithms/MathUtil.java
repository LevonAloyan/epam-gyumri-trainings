package algorithms;

public class MathUtil {

    public static void main(String[] args) {
       System.out.println(pow(2, 0));
       System.out.println(factorial(3));
       System.out.println(abs(-8));
    }

    /**
     * Returns the value of the first argument raised to the power of the
     * second argument, such that a > 0 and n > 0.
     *
     * @param number the base
     * @param pow the exponent
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
        int sum = 1;
        for(int i=1; i <= n; i++ ) {
            sum = sum * n;
            n--;
        }
        return sum;
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
        else {
            return n * (-1);
        }
    }


    /**
     * Reverses the specified "number" parameter by digits.
     *
     * @param number the parameter to be revered
     * @return reversed number
     */
    //TODO not completed, does not work
//    public static int reverse(int number) {
//        int k = 1;
//        int x = 0;
//        while(x != number) {
//            k = k*10;
//            x = number % k;
//        }
//
//        k = k /10;
//        int reverse = 0;
//        int c = 1;
//        for (int i = k; i >= 1 ; i= i/10) {
//            int value = number % i;
//            reverse = reverse + value * c;
//            c  = c * 10;
//        }
//
//        return reverse;
//    }

}
