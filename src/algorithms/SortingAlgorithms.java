package algorithms;

public class SortingAlgorithms {

    public static void main(String[] args) {
        int [] array = new int[]{2,1,8,3,5,5,-26};
        // sortByBubbleSorting(array);
        // print(array, "Bubble Sorting");
        // sortBySelectionSorting(array);
        // print(array, "Selection Sorting");
        // sortByInsertionSorting(array);
        // print(array, "Insertion Sorting");
        // sortByMergeSorting(array);
        // print(array, "Merge Sorting");
        sortByQuickSorting(array);
        print(array, "Quick Sorting");
    }

    public static void sortByBubbleSorting(int[] array) {
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length-i-1; j++) {
                if (array[j] > array[j+1]) {
                    swap(array, j+1, j);
                }
            }
        }
    }

    public static void sortBySelectionSorting(int[] array){

        for (int i = 0; i < array.length - 1; i++){
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++){
                if (array[j] < array[minIndex])
                    minIndex = j;
            }
            if (minIndex != i)  swap(array, minIndex, i);
        }
    }

    public static void sortByInsertionSorting(int[] array){
        for (int i = 1; i < array.length; i++) {
            int tempValue = array[i];
            int j;
            for (j = i - 1; (j >= 0 && array[j] > tempValue); j--){
                array[j + 1] = array[j];
            }
            array[j + 1] = tempValue;
        }
    }

    public static void sortByMergeSorting(int[] array){
        dividingArrays(array, array.length);
    }
    public static void  dividingArrays(int[] array, int length) {
        if (length < 2) {
            return;
        }
        int midelIndex = length / 2;
        int[] leftArr = new int[midelIndex];
        int[] rightArr = new int[length - midelIndex];
    
        for (int i = 0; i < midelIndex; i++) {
            leftArr[i] = array[i];
        }
        for (int i = midelIndex; i < length; i++) {
            rightArr[i - midelIndex] = array[i];
        }
        dividingArrays(leftArr, midelIndex);
        dividingArrays(rightArr, length - midelIndex);
    
        merge(array, leftArr, rightArr, midelIndex, length - midelIndex);
    }
    
    public static void merge(int[] array, int[] leftArr, int[] rightArr, int left, int right) {
 
    int i = 0, j = 0, k = 0;
    while (i < left && j < right) {
        if (leftArr[i] <= rightArr[j]) {
            array[k] = leftArr[i];
            k++;
            i++;
        }
        else {
            array[k] = rightArr[j];
            k++;
            j++;
        }
    }
    while (i < left) {
        array[k] = leftArr[i];
        k++;
        i++;
    }
    while (j < right) {
        array[k] = rightArr[j];
        k++;
        j++;
    }
}
    public static void sortByQuickSorting(int[] array){

        quickSort(array, 0, array.length - 1);
    }

    public static void quickSort(int array[], int start, int end) {
        if (start < end) {
            int partitionIndex = partition(array, start, end);
            quickSort(array, start, partitionIndex-1);
            quickSort(array, partitionIndex+1, end);
        }
    }
    public static int partition(int array[], int start, int end) {
        int pivot = array[end];
        int i = start;
        for (int j = start; j < end; j++) {
            if (array[j] <= pivot) {
                swap (array, i, j);
                i++;
            }
        }
        swap (array, i, end);
        return i;
    }

    private static void swap(int [] array, int firstIndex, int lastIndex) {
        int tempValue = array[firstIndex];
        array[firstIndex] = array[lastIndex];
        array[lastIndex] = tempValue;
    }
    private static void print (int [] array, String sortName){
        System.out.print(sortName + "   ");
        for(int element : array){
            System.out.print(element+", ");
        }
    }
}