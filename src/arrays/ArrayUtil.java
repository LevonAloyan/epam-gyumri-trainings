package arrays;
import arrays.ArrayUtilTest;

import java.util.Arrays;

/**
 * An utility class containing methods for convenient work with arrays
 */
public class ArrayUtil {


    /**
     * Create an array with the given size, fill it with the different values and print it.
     */
    public static void createArray(int size) {
        int [] array = {12,45,78,95,23,14,71,65,74};
        int [] arrayCopy=new int[size];
        if (array.length>=arrayCopy.length){
            System.arraycopy(array,0,arrayCopy,0,size);
            for (int i=0; i<size;i++){
                System.out.print(arrayCopy[i]+",");
            }
        }else
            System.out.println("The size of the array is large");

        System.out.println();
    }

    /**
     * Create two dimensional array with the given sizes, fill it with different values and print it.
     */
    public static void create2dArray(int x, int y) {
        int[][] array1 = {{4,45,12,35,41,78}, {24,85,42,65,21,71}};
        int[][] arrayCopy1 = new int[x][y];
        if(array1.length>=x && array1[0].length>=y){
            for (int i=0; i<x; i++){
                System.arraycopy(array1[i], 0, arrayCopy1[i], 0, arrayCopy1[i].length);

            }

        }else System.out.println("The size of the array is large");
        System.out.println();
    }

    /**
     * Add the given value at the beginning of the given array
     *
     * @return new array.
     */
    public static int[] addFirst(int[] array, int valueToAdd) {
        int length=array.length+1;
        int [] arrayNew=new int[length];
        for (int i=0; i<length; i++) {
            if (i == 0) {
                arrayNew[i] = valueToAdd;
            } else {
                arrayNew[i] = array[i-1];

            }
        }
        return arrayNew;
    }

    /**
     * Implement a method that will check if the given value contains in the array
     *
     * @return true if the array contains the given value, otherwise return false.
     */
    public static boolean contains(int[] array, int value) {
        boolean result=false;
        for (int i=0; i<array.length; i++) {
            if (array[i]==value){
                result = true;
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

        for (int i=0; i<array.length; i++){
            if(array[i]==value){
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
        int [] arrayNew = new int[array.length-1];
        int j=0;
        for(int i = 0; i<array.length;i++){
            if(!(i==index)){
                arrayNew[j++]=array[i];
            }
        }
        System.out.println(Arrays.toString(arrayNew));

    }


    /**
     * Calculate and return sum of array's elements.
     */
    public static long sum(int[] array) {
        int sum=0;
        for (int i=0; i<array.length; i++){
            sum=sum+array[i];
        }
        return sum;
    }


    /**
     * Get the max value from the array.
     */
    public static int getMax(int[] array) {
        int max=0;
        for(int i = 0; i<array.length; i++){
            max=array[0];
            if(max<array[i]){
                max=array[i];
            }
        }
        return max;
    }

    /**
     * Get the minimum value from the array
     */
    public static int getMin(int[] array) {
        int min=0;
        for(int i = 0; i<array.length; i++){
            min=array[0];
            if(min>array[i]){
                min=array[i];
            }
        }
        return min;

    }

    /**
     * Calculate average of array
     */
    public static int getAvg(int[] array) {
        int sum=0;
        int count=0;
        for (int i=0; i<array.length; i++){
            sum=sum+array[i];
            count++;
        }
        return sum/count;
    }


}