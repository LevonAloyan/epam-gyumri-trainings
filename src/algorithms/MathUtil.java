package algorithms;

public class MathUtil {

    public static void main(String[] args) {
        System.out.println(pow(2, 0));
        int num = 4567;
        reverse(num);

        System.out.println(abs(5));
        System.out.println(factorial(6));
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
//        int i,fact=1;
//        int number=5;//It is the number to calculate factorial
//        for(i=1;i<=number;i++){
//            fact=fact*i;
//        }
//        System.out.println("Factorial of "+number+" is: "+fact);
        if (n <= 2) {
            return n;
        }
        return n * factorial(n - 1);
    }



    /**
     * Calculates and returns the absolute value
     * of specified n number
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
     */
    public static void reverse(int number) {
        if (number < 10) {
            System.out.println(number);
            return;
        } else {
            System.out.print(number % 10);
            reverse(number / 10);
        }
    }
    }




