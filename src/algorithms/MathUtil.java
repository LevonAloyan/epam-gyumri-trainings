package algorithms;

import stack.Stack;

public class MathUtil {

    public static void main(String[] args) {
        // System.out.println(pow(2, 1));
        //System.out.println(factorial(-4));
        // System.out.println(abs(-454));
        //System.out.println(reverse(1234));
        Stack stack = new Stack();
        System.out.println(stack);
        stack.push(12);
        stack.pop();
        stack.clear();
        stack.isEmpty();

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
        int result = n;
        if (n < -1) {
            result *= factorial(n + 1);
            return result;
        }
        if (n == -1) {
            return -1;
        }
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        result *= factorial(n - 1);
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
        int result = n;
        if (n == 0) {
            return 0;
        }
        if (n > 0) {
            return n;
        }
        if (n < 0) {
            return n * (-1);
        }
        //Hovhannes jan, is there a need to use recursion? I think that not necessary, if I am wrong, please tell me.
        // stex rekursya ogtagorcelu kariq ka? es chtesa kariq@, ete petq e ogtagorcel, sa ha Hovhannes jan?
        return result;
    }


    /**
     * Reverses the specified "number" parameter by digits.
     *
     * @param number the parameter to be revered
     * @return reversed number
     */
    public static int reverse(int number) {//I have not be able to solve this problem using recursion.
        int reverse = 0;                    //Hovhannes jan, can you help me with this?
        int remainder;
        while (number > 0) {
            remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number /= 10;
        }
        return reverse;
    }


}
