package algorithms;

import java.sql.SQLOutput;

public class MathUtil {

    public static void main(String[] args) {
        System.out.println("---pow---");
        System.out.print("    ");
        System.out.println(pow(2, 3));
        System.out.println("---factorial---");
        System.out.print("      ");
        System.out.println(factorial(5));
        System.out.println("---absolute---");
        System.out.print("      ");
        System.out.println(abs(0));
        System.out.println("---reverse---");
        System.out.print("     ");
        System.out.println(reverse(327));

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
        if (n == 1) {
            return 1;
        }else{
            return n * factorial(n - 1);
        }

    }



    /**
     * Calculates and returns the absolute value
     * of specified n number
     *
     * @param n specified number to find the absolute number
     * @return absolute number of specified n
     */
    public static int abs(int n) {
        if (n > 0){
            return n;
        }

        if (n == 0){
            return 1;
        }
        int abs = n + (-n * 2);


        return abs;
    }


    /**
     * Reverses the specified "number" parameter by digits.
     *
     * @param number the parameter to be revered
     * @return reversed number
     */
    public static int reverse(int number) {
        int reverse = 0;
        int lastDigit;
        int n = number;
        while (n > 0){
            lastDigit = n % 10;
            reverse = reverse * 10 + lastDigit;
            n /= 10;
        }
        return reverse;
    }



}
