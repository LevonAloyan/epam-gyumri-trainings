package arrays;
import java.util.Arrays;


/**
 * An utility class containing methods for convenient work with arrays
 */
public class ArrayUtil {


    /**
     * Create an array with the given size, fill it with the different values and print it.
     *
    public static void createArray(int size) {
       
        int [] massiv = new int[size];
        for(int i = 0; i<massiv.length;i++){
            massiv[i] = i+1;
            System.out.print(massiv[i]+  " ");
        }


    }

    /**
     * Create two dimensional array with the given sizes, fill it with different values and print it.
     *
    public static void create2dArray(int x, int y) {
        int [] [] twoD_arr= new int [x] [y];
        int k=0;
        for (int i=0; i <x; i++){
            for(int j = 0; j<y;j++){
             twoD_arr[i][j]= k;
             k++;
               System.out.print(twoD_arr[i][j]+" ");
            }
            System.out.println();
        }



    }

    /**
     * Add the given value at the beginning of the given array
     *
     * @return new array.
     *
    public static void addFirst(int[] array, int valueToAdd) {
        int [] addValue = new int [array.length+1];
        addValue[0]= valueToAdd;
        System.arraycopy(array, 0, addValue, 1, addValue.length-1);

    System.out.println(Arrays.toString(addValue));
    }

    /**
     * Implement a method that will check if the given value contains in the array
     *
     * @return true if the array contains the given value, otherwise return false.
     *
    public static boolean contains(int[] array, int value) {
        for (int i=0; i<array.length;i++){
            if (array[i]==value){
            System.out.println(true);
            return true;
            }
            else{System.out.println(false);}
        }

        return false;
    }

    /**
     * @param array An array to search in.
     * @param value The value to search for.
     * @return the first index of value in the array, if array does not contain given element return -1.
     */
    public static void indexOf(int[] array, int value) {

       for (int i = 0; i< array.length; i++){
            if (array[i]==value){
                System.out.println(value);
            }
        else{
            System.out.println(" array does not contain given element");
        }
        }
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
    public static void sum(int[] array) {
       int  k=0;
        for(int i=0;i< array.length;i++){
            k=k+array[i];

        }
System.out.println(k);
    }


    /**
     * Get the max value from the array.
     */
    public static void getMax(int[] array) {
       int max = array[0];
       for(int i = 0;i<array.length;i++){
        if(array[i]>max){
            max = array[i];
        }
       }
       System.out.println(max);
    }

    /**
     * Get the minimum value from the array
     */
    public static void getMin(int[] array) {
        int min =array[0];
       for(int i = 0;i<array.length;i++){
        if(array[i]<min){
            min = array[i];
        }
       }
       System.out.println(min);

    }

    /**
     * Calculate average of array
     */
    public static void getAvg(int[] array) {
      int  gumar=0;
    for (int i =0; i < array.length; i++){
        gumar = gumar + array[i];
        
    }
    System.out.println(gumar/array.length);

}
}