package arrays;

import java.util.Random;
import java.util.Arrays;

public class ArrayUtil {
    /**
     * Create an array with the given size, fill it with the different values and print it.
     */
    public static void createArray(int size) {
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt();
            System.out.print(array[i] + " ");
        }
    }

    /**
     * Create two dimensional array with the given sizes, fill it with different values and print it.
     */
    public static void create2dArray(int x, int y) {
        int[][] array1 = new int[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                array1[i][j] = i + j;
                System.out.print(array1[i][j] + " ");
            }
            System.out.println();

        }
    }

    /**
     * Add the given value at the beginning of the given array
     *
     * @return new array.
     */
    public static int[] addFirst(int[] array, int valueToAdd) {
        int[] secondArray = new int[array.length + 1];
        int index = 1;
        secondArray[0] = valueToAdd;
        for (int i = 0; i < array.length; i++) {
            secondArray[index] = array[i];
            index++;
        }
        return secondArray;
    }

    /**
     * Implement a method that will check if the given value contains in the array
     *
     * @return true if the array contains the given value, otherwise return false.
     */
    public static boolean contains(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (value == array[i]) {
                return true;
            }
        }
        return false;
    }

    /**
     * @param array An array to search in.
     * @param value The value to search for.
     * @return the first index of value in the array, if array does not contain given element return -1.
     */
    public static int indexOf(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (value == array[i]) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Remove the element by the given index.
     * Print new array
     */
    public static void remove(int[] array, int index) {
        int[] newarray = new int[array.length - index];
        for (int i = 0; i < array.length - index; i++) {
            newarray[i] = array[i];
        }
        System.out.println(Arrays.toString(newarray));
    }

    /**
     * Calculate and return sum of array's elements.
     */
    public static long sum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    /**
     * Get the max value from the array.
     */
    public static int getMax(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    /**
     * Get the minimum value from the array
     */
    public static void getMin(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("min="+min);
    }

    /**
     * Calculate average of array
     */
    public static double getAvg(int[] array) {
        double sum = 0;
        double result;
        for (int i = 0; i < array.length; i++) {
            sum+=array[i];
        }
        result=sum/array.length;
       return result;
    }
}

