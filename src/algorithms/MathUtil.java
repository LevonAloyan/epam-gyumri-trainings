package algorithms;

public class MathUtil {

    public static void main(String[] args) {
        System.out.println(pow(2, -2));
        System.out.println(factorial(3));
        System.out.println(abs(-2));
        System.out.println(reverse(34465));
    }

    /**
     * Returns the value of the first argument raised to the power of the
     * second argument, such that a > 0 and n > 0.
     *
     * @param number the base
     * @param pow the exponent
     * @return the value <code>a<sup>b</sup></code>.
     */
    public static double pow(double number, double pow){
        if (pow == 0){
            return 1;
        }
        if (pow == 1){
            return number;
        }
        if (number<0 && pow%2 ==0){
            number *=(-1);
        }
        double result = number;
        if(pow>1) {
            result *= pow(number, pow - 1);
            return result;
        }
        if(pow<0)
           pow *= (-1);
           result *= pow(number, pow - 1);
            double res = 1/result;
           return res;
        }




    /**
     * Calculates and returns the factorial of specified n number
     *
     * @param n the number factorial of which must be calculated
     * @return calculated number
     */
    public static int factorial(int n) {
        if (n == 0){
            return 1;
        }
        if (n<0 && n%2 == 0){
            n*=(-1);
            return n*factorial(n-1);
        }
        else{
       return n * factorial(n-1);
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
        if (n<0){
            n*=(-1);
            return n;
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
        if (number >= -9 && number <= 9) {
            return number;
        }
        // Method 1 int cast array reverse array [i] and array cast int
        else {
            String s = Integer.toString(number);
            int[] arr = new int[s.length()];
            for (int i = s.length() - 1; i >= 0; i--) {
                arr[i] = number % 10;
                number /= 10;
            }
            int start = 0;
            int end = arr.length - 1;
            while (start < end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
            int result = 0;
            for (int i = arr.length - 1, n = 0; i >= 0; --i, n++) {
                int pos = (int) Math.pow(10, i);
                result += arr[n] * pos;
            }
            return result;
        }
     /* Method 2
      int  rev =0;
       while ( number != 0){
           int   count = number%10;
           rev = rev * 10+ count;
           number =number/10;
        }
        return rev;*/
    }

}







