package algorithms;

public class MathUtil {

    public static void main(String[] args) {
        System.out.println(pow(2, 0));
        System.out.println(factorial(0));
        System.out.println(abs(-8));
        System.out.println(reverse(2345));

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
       
       int fact=1;
    if (n>0){
        for(int i=1;i<n;i++){
            fact=fact*(i+1);
          
           }
    }
    else if(n==0)
       {
           fact =1;
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
        
  
    if (n==0) {
     return 0;
      
    }  
    else if (n <0){
    n= -1*n;
    }
    else if (n>0){
    n= 1*n;
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
       int  reversed =0;
while ( number != 0){
 int   remainder = number%10;
 reversed = reversed * 10+ remainder;
 number =number/10;
}
return reversed;
    }



}
