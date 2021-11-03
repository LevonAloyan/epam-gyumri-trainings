package arrays;


import java.util.Arrays;
import java.util.Random;

/**
 * An utility class containing methods for convenient work with arrays
 */
public class ArrayUtil {


    /**
     * Create an array with the given size, fill it with the different values and print it.
     */
    public static void createArray(int size) {
        int[] week_days = new int[size];
        Random random_number = new Random();
        for(int i = 0; i < size; i++){
            week_days[i] = random_number.nextInt(500);
            System.out.println(week_days[i]);
            }
    }

    /**
     * Create two dimensional array with the given sizes, fill it with different values and print it.
     */
    public static void create2dArray(int x, int y) {
        int[][] twoDArray = new int[x][y];
        Random random_number = new Random();
        for(int i = 0; i < x; i++){
            for(int j = 0; j<y; j++){
                twoDArray[i][j] = random_number.nextInt(100);
                System.out.print(twoDArray[i][j]);
            }
        }
    }

    /**
     * Add the given value at the beginning of the given array
     *
     * @return new array.
     */
    public static int[] addFirst(int[] array, int valueToAdd) {
        int size = array.length + 1;
        int[] new_arr = new int[size];
        new_arr[0] = valueToAdd;
        System.arraycopy(array,0,new_arr,1, array.length);
        for(int i = 0; i <= new_arr.length -1; i++){
            System.out.println(new_arr[i]);
        }
        return new_arr;
    }

    /**
     * Implement a method that will check if the given value contains in the array
     *
     * @return true if the array contains the given value, otherwise return false.
     */
    public static boolean contains(int[] array, int value) {
        boolean result = false;
        for (int i = 0; i < array.length; i++){
            if(array[i] == value){
                result = true;
                break;
            }
        }
        System.out.println(result);
        return result;
    }

    /**
     * @param array An array to search in.
     * @param value The value to search for.
     * @return the first index of value in the array, if array does not contain given element return -1.
     */
    public static int indexOf(int[] array, int value) {
        int res =  -1;
        for (int i = 0; i < array.length; i++){
            if(array[i] == value){
                res = i;
            }
        }
        System.out.println(res);
        return res;
    }

    /**
     * Remove the element by the given index.
     * Print new array
     */
    public static void remove(int[] array, int index) {
        int[] new_array = new int[array.length - 1];
        System.arraycopy(array,0, new_array,0,index);
        System.arraycopy(array,index + 1, new_array, index, array.length - index - 1);
        System.out.println(Arrays.toString(new_array));
    }


    /**
     * Calculate and return sum of array's elements.
     */
    public static long sum(int[] array) {
        long sum = 0;
        for(int i = 0; i < array.length; i++){
            sum += array[i];
        }
        System.out.println("Sum of given array is " + sum);
        return sum;
    }


    /**
     * Get the max value from the array.
     */
    public static int getMax(int[] array) {
        int max = array[0];
        for(int i = 0; i <array.length; i++){
            if(max < array[i]){
                max = array[i];
            }
        }
        System.out.println("Maximum value of given array is " +max);

        return max;
    }

    /**
     * Get the minimum value from the array
     */
    public static void getMin(int[] array) {
        int min = array[0];
        for(int i = 0; i <array.length; i++){
            if(min > array[i]){
                min = array[i];
            }
        }
        System.out.println("Minimum value of given array is " +min);
    }

    /**
     * Calculate average of array
     */
    public static int getAvg(int[] array) {
        int avg;
        int sum = 0;
        for(int i = 0; i < array.length; i++){
            sum += array[i];
        }
        avg = sum / array.length;
        System.out.println("Average of given array is " + avg);
        return avg;
    }


}