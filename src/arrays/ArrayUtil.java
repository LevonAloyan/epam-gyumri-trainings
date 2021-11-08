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
        array[0] = 1;
        array[1]= 2;
        array[2] = 3;
        array[3] = 4;
        array[4] = 5;
        array[5] = 6;

        for (int x=0;x<size;x++){
            System.out.print(array[x]+",");
        }
        System.out.println();
    }

    /**
     * Create two dimensional array with the given sizes, fill it with different values and print it.
     */
    public static void create2dArray(int x, int y) {
      int k=0;

        int [][] array =new int[x][y];

        for (int j=0;j<x;j++){

            for (int i=0;i<y;i++){
                array [j][i] = k;
                k++;
            }
        }
        for (int b=0;b<x;b++){

            for (int i=0;i<y;i++){
                System.out.print(array[b][i]+",");
            }
        }
        System.out.println();
    }

    /**
     * Add the given value at the beginning of the given array
     *
     * @return new array.
     */
    public static int[] addFirst(int[] array, int valueToAdd) {

        int[] arr2 = new int[array.length + 1];
        System.arraycopy(array, 0, arr2, 1, array.length);
        arr2[0] = valueToAdd;
        array = arr2;
        return array;

    }

    /**
     * Implement a method that will check if the given value contains in the array
     *
     * @return true if the array contains the given value, otherwise return false.
     */
    public static boolean contains(int[] array, int value) {
        for(int i=0;i<=array.length;i++) {
            if (array[i] == value) {
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
        for(int i=0;i<array.length-1;i++) {
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
        for(int i=index;i<= array.length-2;i++){
            array[i]=array [i+1];
        }
        array[array.length-1]=0;

        System.out.print(Arrays.toString(array));
        System.out.println();
    }


    /**
     * Calculate and return sum of array's elements.
     */
    public static long sum(int[] array) {
       long result=0;
       for (int i=0;i<= array.length-1;i++){
           result=result +array[i];
       }
       return result;
    }



    /**
     * Get the max value from the array.
     */
    public static int getMax(int[] array) {
        int max = array[0];
        for(int i = 0; i <= array.length-1; i++) {
        if (array[i] > max) {
        max = array[i];
        }

        }
        return max;
    }

    /**
     * Get the minimum value from the array
     */
    public static int getMin(int[] array) {
        int min = array[0];
        for(int i = 0; i <= array.length-1; i++) {
            if (array[i] < min) {
                min = array[i];
            }

        }
        return min;
    }



    /**
     * Calculate average of array
     */
    public static float getAvg(int[] array) {
        float sum=0;
        for(int i=0;i<= array.length-1;i++){
            sum=sum+array[i];
        }
        return sum / array.length;
    }




}