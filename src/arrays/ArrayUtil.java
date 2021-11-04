package arrays;

import java.util.Scanner;
 import java.util.Arrays;

/**
 * An utility class containing methods for convenient work with arrays
 */
public class ArrayUtil {
    /**
     * //     * Create an array with the given size, fill it with the different values and print it.
     * //
     */
    public static void createArray(int size) {
    int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            Scanner in = new Scanner(System.in);
            arr[i] = in.nextInt();
        }
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void create2dArray(int x, int y) {

    int arrTwo[][] = new int[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                Scanner in = new Scanner(System.in);
                arrTwo[i][j] = in.nextInt();
            }
        }
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print(arrTwo[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        // or we can do it the following way

    int l = 1;
    int arrTwo1[][] = new int[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                arrTwo1[i][j] = l;
                l += 2;
            }
        }
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print(arrTwo1[i][j] + " ");
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
    int arr[] = new int[array.length + 1];
    arr[0] = valueToAdd;
        System.arraycopy(array, 0, arr, 1, array.length);
          return arr;
    }

    /**
     * Implement a method that will check if the given value contains in the array
     *
     * @return true if the array contains the given value, otherwise return false.
     */
    public static boolean contains(int[] array, int value) {
     boolean found = false;
        for (int k = 0; k < array.length; k++) {
           if (array[k] == value) {
               found = true;
                break;
            }
        }
        if (found = true) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * @param array An array to search in.
     * @param value The value to search for.
     * @return the first index of value in the array, if array does not contain given element return -1.
     */
    public static int indexOf(int[] array, int value) {
    int found = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                found = i;
                break;
            }
        }
        if (found == -1) {
            return -1;
        } else {
            return found;
        }
    }

    /**
     * Remove the element by the given index.
     * Print new array
     */
    public static void remove(int[] array, int index) {
     int [] newArr = new int[array.length - 1];
     int newarrl = array.length-(index+1);
        System.arraycopy(array, 0, newArr, 0, index);
         System.arraycopy(array, index + 1, newArr, index,newarrl);
           System.out.println(Arrays.toString(newArr));
    }

    /**
     * Calculate and return sum of array's elements.
     */
    public static long sum(int[] array) {
    int sum = 0;
        for (int j = 0; j < array.length; j++) {
            sum += array[j];
        }
        return sum;
    }

    /**
     * Get the max value from the array.
     */
    public static int getMax(int[] array) {
        int Max = array[0];
        for(int i = 1; i < array.length; i++) {
            if (array[i] > Max) {
                Max = array[i];
            }
        }
        return Max;
    }

    /**
     * Get the minimum value from the array
     */
    public static void getMin(int[] array) {
     int Min = array[0];
      for(int i=1; i<array.length; i++){
          if(array[i] < Min){
              Min = array[i];
          }
      }
        System.out.println(Min);
    }

    /**
     * Calculate average of array
     */
    public static int getAvg(int[] array) {
     int sum = 0;
        for (int j = 0; j < array.length; j++) {
            sum += array[j];
        }
     int avg = sum / array.length;
        return avg;
    }
}