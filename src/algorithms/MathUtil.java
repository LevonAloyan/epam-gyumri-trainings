package algorithms;

public class MathUtil {
   static int result = 0;

    public static void main(String array[]) {
        System.out.println(pow(2, 8));
        System.out.println(+factorial(13));
        System.out.println(abs(-61));
        System.out.println(reverse(123));
    }

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

    public static int factorial(int n) {
        int result = n;
        if (n == 0) {
            return 0;
        }
        result += factorial((n - 1));


        return result;

    }

    public static int abs(int n) {
        int result = n;
        if (n == 0) {
            return 0;
        }
        if (n > 0) {
            return n;
        }
        if (n < 0) {
            result += abs(2 * -n);
        }
        return result;
    }

    public static int reverse(int number) {
        
        if (number != 0) {
            int reminder = number %10;
            result = result * 10 + reminder;
            reverse(number / 10);
        } else {

        }
        return result;
    }
}