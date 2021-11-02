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
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.print(array[i] + " ");

        }
    }

    /**
     * Create two dimensional array with the given sizes, fill it with different values and print it.
     */
    public static void create2dArray(int x, int y) {
        int[][] array = new int[x][y];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 100);
                System.out.print(array[i][j] + " ");
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
        System.out.println(Arrays.toString(array) + " value to add: " + valueToAdd);

        int[] tempArray = new int[array.length + 1];
        tempArray[0] = valueToAdd;

        // espes kenei ete System.arraycopy methody chogtagorceinq >>

        /**  for (int i = 1; i <= array.length; i++) {
         tempArray[i]=array[i-1];
         }
         */
        System.arraycopy(array, 0, tempArray, 1, array.length);
        array = tempArray;

        return array;
    }

    /**
     * Implement a method that will check if the given value contains in the array
     *
     * @return true if the array contains the given value, otherwise return false.
     */
    public static boolean contains(int[] array, int value) {

        for (int i = 0; i < array.length; i++) {

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
        // methodi pahanjy chisht em haskce-> ete "value"-n mer massivi mej ka uremn return massivi araji elementy??
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                // return array[0]; ete petq e veradardznenq araji index-i arjeqy
                //return array[i];  ete petq e veradardznenq value-n massivi mijic
                return i;         //ete petq e veradardznenq value-i index-y massivi mej
                //avel pakas nerox kexniq)
            }

        }
        return -1;
    }

    /**
     * Remove the element by the given index.
     * Print new array
     */
    public static void remove(int[] array, int index) {
        System.out.println(Arrays.toString(array) + " remove index " + index);

        int[] tempArray = new int[array.length - 1];
        System.arraycopy(array, index + 1, tempArray, index, array.length - 1 - index);
//            System.out.println(Arrays.toString(tempArray));
        System.arraycopy(array, 0, tempArray, 0, index);

        System.out.println(Arrays.toString(tempArray));
    }


    /**
     * Calculate and return sum of array's elements.
     */
    public static long sum(int[] array) {
        long sum = 0L;
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
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }

    /**
     * Get the minimum value from the array
     */
    public static int getMin(int[] array) {
        //method void > change returning int
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }

    /**
     * Calculate average of array
     */
    public static int getAvg(int[] array) {
        int avg = 0;
        for (int i = 0; i < array.length; i++) {
            avg += array[i];
        }

        return avg / array.length;
    }


}