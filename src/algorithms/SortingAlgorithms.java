package algorithms;

import com.sun.java.swing.plaf.windows.WindowsDesktopPaneUI;

public class SortingAlgorithms {

    public static void main(String[] args) {
        int [] array = new int[]{2,1,8,3,5,5,-26,9,10,12,-16};
        System.out.println("Initial Array: 2,1,8,3,5,5,-26,9,10,12,-16 ");
       sortByBubbleSorting(array);
        print(array);
       System.out.println();
       sortBySelectionSorting(array);
       print(array);
       System.out.println();
       sortByInsertionSorting(array);
       print(array);
        //System.out.println();
        //sortByMergeSorting(array);
       //print(array);
        //System.out.println();
        //sortByQuickSorting();
        //print(array);
    }

    public static void sortByBubbleSorting(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length-i-1; j++) {
                if (array[j] > array[j+1]) {
                    swap(array, j+1, j);
                }
            }
        }
        System.out.print("Bubble Sorting---->");
    }

    public static void sortBySelectionSorting(int[] array){
            for (int i = 0; i < array.length; i++) {
                int minIndex = i;
                for (int j = i + 1; j < array.length; j++) {
                    if (array[j] < array[minIndex]){
                        minIndex = j;
                }
                }
            }

        System.out.print("Selection Sorting -->");
        }


    public static void sortByInsertionSorting(int[] array){
        for (int i = 0; i < array.length; i++) {
            int j = i;
            while ((j > 0) && (array[j -1]>array[j])){
                int tmp = array[j];
                array[j] = array[j - 1];
                array[j -1] = tmp;
                j--;
            }
        }
       // return array;
        System.out.print("Insertion String--->");
    }

    public static void sortByMergeSorting(int[] array){

    }


    public static void sortByQuickSorting(int[] array){

    }

    private static void swap(int [] array, int firstIndex, int lastIndex) {
        int tempValue = array[firstIndex];
        array[firstIndex] = array[lastIndex];
        array[lastIndex] = tempValue;
    }
    private static void print (int [] array){
        for(int element : array){
            System.out.print(element+",");
        }
    }
}