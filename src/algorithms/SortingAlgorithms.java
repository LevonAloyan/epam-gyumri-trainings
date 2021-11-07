package algorithms;

public class SortingAlgorithms {

    public static void main(String[] args) {
        int [] array = new int[]{2,1,8,3,5,5,-26};
//        sortByBubbleSorting(array);
//        print(array);
//        sortBySelectionSorting(array);
//        print(array);
//        sortByInsertionSorting(array);
//        print(array);
//        sortByMergeSorting(array);
//        print(array);
//        sortByQuickSorting(array,0,array.length-1);
//        print(array);
    }

    public static void sortByBubbleSorting(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length-i-1; j++) {
                if (array[j] > array[j+1]) {
                    swap(array, j+1, j);
                }
            }
        }
    }

    public static void sortBySelectionSorting(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int minValue = array[i];
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < minValue) {
                    minValue = array[j];
                    swap(array, j, i);
                }
            }
        }
    }

    public static void sortByInsertionSorting(int[] array){
        for (int i = 1; i < array.length; i++) {
            int currentValue = array[i];
            int j = 0;
            for (j = i - 1; j >= 0 && array[j] > currentValue; j--) {
                array[j + 1] = array[j];
            }
            array[j + 1] = currentValue;
        }
    }

    public static void sortByMergeSorting(int[] array){

    }


    public static void sortByQuickSorting(int[] array,int begin,int end){
        if(begin>=end){
            return;
        }
        int p = partition(array, begin, end);
        if(begin < p-1){
            sortByQuickSorting(array, begin, p - 1);
        }
        if(p<end){
            sortByQuickSorting(array, p + 1, end);
        }


    }
    private static int partition (int array[], int begin, int end) {
        int pivot = array[end];
        int i = (begin-1);
        for (int b = begin; b < end; b++){
            if (array[b] <= pivot){
                i++;
                swap(array,i,b);
            }
        }
        swap(array,i+1,end);
        return i+1;
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