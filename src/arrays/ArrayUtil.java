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
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};{
            for (int j : array) {
                System.out.print(j + " ");
            }
        }
    }

    /**
     * Create two dimensional array with the given sizes, fill it with different values and print it.
     */
    public static void create2dArray(int x, int y) {

        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}};
        int[][] newArray = new int[x][y];
        if (array.length >= x && array[0].length >= y) {
            for (int i = 0; i < x; i++) {
                System.arraycopy(array[i], 0, newArray[i], 0, newArray[i].length);
                System.out.println();
            }
        }
    }

    /**
     * Add the given value at the beginning of the given array
     *
     * @return new array.
     */
    public static int[] addFirst(int[] array, int valueToAdd) {
        int length = array.length + 1;
        int[] newArray = new int[length];
        for (int i = 0; i < length; i++) {
            if (i == 0) {
                newArray[i] = valueToAdd;
            } else {
                newArray[i] = array[i - 1];
            }
        }
        return newArray;
    }

    /**
     * Implement a method that will check if the given value contains in the array
     *
     * @return true if the array contains the given value, otherwise return false.
     */
    public static boolean contains(int[] array, int value) {
        boolean result = false;
        for (int j : array) {
            if (j == value) {
                result = true;
                break;
            }
        }
        return result;
    }

    /**
     * @param array An array to search in.
     * @param value The value to search for.
     * @return the first index of value in the array, if array does not contain given element return -1.
     */
    public static int indexOf(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
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
        int[] newArray = new int[array.length - 1];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (!(i == index)) {
                newArray[j++] = array[i];
            }
        }
        System.out.println(Arrays.toString(newArray));
    }

    /**
     * Calculate and return sum of array's elements.
     */
    public static long sum(int[] array) {
        int result = 0;
        int i;
        for (i = 0; i < array.length; i++) {
            result = result + array[i];
        }
        return result;
    }

    /**
     * Get the max value from the array.
     */
    public static int getMax(int[] array) {
        int maxNumber = array[0];
        for (int j : array) {
            if (j > maxNumber) {
                maxNumber = j;
            }
        }
        return maxNumber;
    }

    /**
     * Get the minimum value from the array
     */
    public static int getMin(int[] array) {
        int minNumber = array[0];
        for (int j : array) {
            if (j < minNumber) {
                minNumber = j;
            }
        }
        return minNumber;
    }

    /**
     * Calculate average of array
     */
    public static int getAvg(int[] array) {
        int sum = 0;
        int count = 0;
        for (int j : array) {
            sum = sum + j;
            count++;
        }
        return sum / count;
    }

}