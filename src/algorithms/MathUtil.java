package algorithms;

import org.w3c.dom.CDATASection;
import stack.Stack;

public class MathUtil {

    public static void main(String[] args) {
//        System.out.println(pow(2, 5));
//        System.out.println(factorialWithRecursion(16));
//        System.out.println(abs(5));
//        System.out.println(reverse(122));
        Stack stack = new Stack();

        System.out.println(stack.push(5));
        System.out.println(stack.push(88));
        System.out.println(stack.pop(5));
        stack.clear();
        System.out.println(stack.isEmpty(stack.data));
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
     * 16! = 16*....5*4*3*2*1 =
     */
    public static long factorialWithRecursion(int n) {
        if (n == 0 || n == 1){
            return 1;
        }
        if (n > 1){
            return  (int)n * factorialWithRecursion(n - 1);
        } else if (n > 16){
            return  n * factorialWithRecursion(n - 1);
        }
        return 0;
    }

    /**
     * Calculates and returns the absolute value
     * of specified n number
     *
     *
     * @param n specified number to find the absolute number
     * @return absolute number of specified n
     */
    public static int abs(int n) {
        if (n < 0){
            return n * (-1);
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
        while (number != 0){
            int digit = number % 10;
            result = result * 10 + digit;
            number = number / 10;
        }
        return result;
    }



}
