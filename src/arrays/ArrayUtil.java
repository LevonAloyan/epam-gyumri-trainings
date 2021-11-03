package arrays;


import java.util.Random;

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
     * @return new array.
     */
    public static int[] addFirst(int[] array, int valueToAdd) {
        int[] newArray = new int[array.length + 1];
        newArray[0] = valueToAdd;
        System.arraycopy(array, 0, newArray, 1, array.length);
        return array;
    }


    /**
     * Implement a method that will check if the given value contains in the array
     *
     * @return true if the array contains the given value, otherwise return false.
     */
    public static boolean contains(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (value == array[i]) {
                System.out.println(true);
                return true;
            }
        }
        System.out.println(false);
        return false;
    }

    /**
     * @param array An array to search in.
     * @param value The value to search for.
     * @return the first index of value in the array, if array does not contain given element return -1.
     */
    public static int indexOf(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                System.out.print(i + "  ");
                return i;
            }
        }
        System.out.print("the given value does not exist" + "  ");
        return -1;
    }

    /**
     * Remove the element by the given index.
     * Print new array
     */
    public static void remove(int[] array, int index) {
        int[] newArray = new int[array.length - 1];
        if (index > array.length - 1) {
            System.out.println("value with this index does not exist");
        } else {
            for (int i = 0; i < array.length - 1; i++) {
                if (i < index) {
                    newArray[i] = array[i];
                } else {
                    newArray[i] = array[i + 1];
                }
            }
            for (int i = 0; i < newArray.length; i++) {
                System.out.print(newArray[i] + ",");
            }
        }
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
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println(max);
        return max;
    }

    /**
     * Get the minimum value from the array
     */
    public static void getMin(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println(min);
    }

    /**
     * Calculate average of array
     */
    public static int getAvg(int[] array) {
        int sum = 0;
        int avg = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            avg = sum / (i + 1);
        }
        System.out.println(avg);
        return avg;
    }


}