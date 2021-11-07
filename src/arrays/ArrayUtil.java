package arrays;



/**
 * An utility class containing methods for convenient work with arrays
 */
public class ArrayUtil {


    /**
     * Create an array with the given size, fill it with the different values and print it.
     */
    public static void createArray(int size) {
        int [] numArray;
        numArray = new int[size];
        for(int num = 0;num < numArray.length;num++ ){
            numArray[num] = num;
            System.out.print( numArray[num] +" ");
        }
        System.out.println();

    }

    /**
     * Cre two dimensional array with the given sizes, fill it with different values and print it.eat
     */
    public static void create2dArray(int x, int y) {
        int c = 0;
        int[][] numArray = new int[x][y];
        for (int i = 0; i < x; i++) {
            System.out.println(" ");
            for (int  j = 0; j < y; j++) {
                numArray[i][j] = c;
                c+=1;

                System.out.print(numArray[i][j]);
                System.out.print(" ");

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
        int[] array1 = new int [ array.length +1];
        System.arraycopy(array,0,array1,1,array.length);
        array1[0] = valueToAdd;
        return array1;






    }

    /**
     * Implement a method that will check if the given value contains in the arra
     * @return true if the array contains the given value, otherwise return false.
     */
    public static boolean contains(int[] array, int value) {
        for(int i = 0;i < array.length;i++) {
            if (array[i] == value){
                System.out.println(true);
            }
            else{
                System.out.println(false);
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

        return 0;
    }

    /**
     * Remove the element by the given index.
     * Print new array
     */
    public static void remove(int[] array, int index) {

    }


    /**
     * Calculate and return sum of array's elements.
     */
    public static long sum(int[] array) {
        long num = 0;
        for (int i = 0; i < array.length; i++) {
            num = num+ array[i];




        }
        System.out.println(num );


        return num;
    }




    /**
     * Get the max value from the array.
     */
    public static int getMax(int[] array) {
        int max = array[0];
        for (int i = 0;i < array.length; i ++){
            if(array[i] > max){
                max = array[i];

            }

        }
        System.out.print(max);

        return max;
    }

    /**
     * Get the minimum value from the array
     */

    public static int getMin(int[] array) {
        int min = array[0];
        for (int i = 0;i < array.length; i ++){
            if(array[i] < min){
                min = array[i];

            }

        }
        System.out.println();
        System.out.println(min);
        return min;


    }

    /**
     * Calculate average of array
     */
    public static int getAvg(int[] array) {
        int k = 0;
        for(int i = 0;i < array.length;i++){
            k = k + array[i];
        }
        System.out.println();
        System.out.print( k / array.length);

        return k;
    }


}