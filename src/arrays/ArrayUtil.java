package arrays;

import java.util.Arrays;

/**
 * An utility class containing methods for convenient work with arrays
 */
public class ArrayUtil {


    /**
     * Create an array with the given size, fill it with the different values and print it.
     */
   public static void createArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.print(array[i] + ",");
        }
        System.out.println();
    }

    /**
     * Create two dimensional array with the given sizes, fill it with different values and print it.
     */
   public static void create2dArray(int x, int y) {
        int[][] array = new int[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                array[i][j] = (int) (Math.random() * 100);
                System.out.print(array[i][j] + ",");
            }
            System.out.println();
        }
    }

    /**
     * Add the given value at the beginning of the given array
     *
     */
    public static void addFirst(int[] array, int valueToAdd) {
       int[] addValue = new int[array.length+1];
       addValue[0] = valueToAdd;
        System.arraycopy(array, 0, addValue, 1, addValue.length - 1);
        System.out.println(Arrays.toString(addValue));
    }

    /**
     * Implement a method that will check if the given value contains in the array
     *
     * return
     */
    public static boolean contains(int[] array, int value) {
        for (int j : array) {
            if (j == value)
                System.out.println("true");
                return true;
        }
        System.out.print("false");
        return false;
    }

    /**
     * @param array An array to search in.
     * @param value The value to search for.
     */
    public static void indexOf(int[] array, int value) {
            for (int i = 0; i < array.length; i++){
                if ( array[i] == value){
                    System.out.print(i);
                    return i;
                }
            }
    }

    /**
     * Remove the element by the given index.
     * Print new array
     */
    public static void remove(int[] array, int index) {
        int[] removeElement = new int[array.length-1];
        System.out.println("Remove element");
        for (int i = 0; i < array.length-1; i++){
            if (i < index){
                removeElement[i] = array[i];
            }else {
                removeElement[i] = array[i+1];
            }
            System.out.print(removeElement[i] + " ,");
        }
        System.out.println();
    }


    /**
     * Calculate and return sum of array's elements.
     */
    public static long sum(int[] array) {
        int sum = 0;
        for (int j : array) {
            sum += j;
        }
        System.out.println("sum " + sum);
        return sum;
    }


    /**
     * Get the max value from the array.
     */
    public static int getMax(int[] array) {
        int max = array[0] ;
        for (int maxValue : array){
            if (maxValue > max){
                max = maxValue;
            }
        }
        System.out.println("max " + max);
        return max;
    }

    /**
     * Get the minimum value from the array
     */
   public static void getMin(int[] array) {
        int min = array[0] ;
        for (int minValue : array){
            if (min > minValue){
                min = minValue;
            }
        }
        System.out.println("min " + min);
        //return min;
    }

    /**
     * Calculate average of array
     */
    public static int getAvg(int[] array) {
        int sum = 0;
        for (int j : array) {
            sum += j;
        }
        System.out.println("getAvg " + sum / array.length);
        return sum / array.length;
    }


}