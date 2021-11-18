package algorithms;

public class MathUtil {

    public static void main(String[] args) {
        System.out.println(pow(2, 0));
        System.out.println(factorial(6));
        System.out.println(abs(-6));
        System.out.println(reverse(12345));
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
        // int result = number;

        // if (pow == 0){
        //     return 1;
        // }

        // if (pow == 1){
        //     return number;
        // }

        // result *= pow(number, pow-1);

        // return result;
        int result = 1;
        if (pow > 0) {
            result *= pow (number, pow -1) ;
        } 
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
        
        if (n == 0) {
            return 1;
        } 
        else if (n < 0) {
            System.out.print( "In mathematics, the factorial of a non-negative integer n. "); 
        }
        if (n > 1){
            result *= factorial(n-1);
        }
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
        if (n >= 0){
            return n;
        } else {
            return -n;
        }
    }


    /**
     * Reverses the specified "number" parameter by digits.
     *
     * @param number the parameter to be revered
     * @return reversed number
     */
    public static int reverse(int number) {
        int  reverse = 0;
        int i;
        
        while (number > 9) {
            i = number % 10;
            reverse =  reverse * 10 + i;
            number = (number - i) / 10;
        }
        return  reverse * 10 + number;
    }



}
