package algorithms;

public class SortingAlgorithms {

    public static void main(String[] args) {
        int [] array = new int[]{2,1,8,3,5,5,-26};
        //sortByBubbleSorting(array);
        //sortBySelectionSorting(array);
        //sortByInsertionSorting(array);
        //sortByMergeSorting(array);
        sortByQuickSorting(array);
        print(array);
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

    public static void sortBySelectionSorting(int[] array){
        for (int i = 0; i < array.length-1; i++) {
            int minIndex = i;
            for (int j = i+1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                    swap(array, minIndex, i);
                }
            }
        }

    }

    public static void sortByInsertionSorting(int[] array){
       for (int i = 1; i < array.length; ++i) {
            int key = array[i];
            int j = i - 1;
                while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }

    }

    public static void sortByMergeSorting(int[] array){
        sort(array,0, array.length-1);

    }
    static   void sort(int array[], int arrBegin, int arrEnd) {
        if (arrBegin < arrEnd) {
           int m = arrBegin + (arrEnd - arrBegin) / 2;
           sort(array, arrBegin, m);
           sort(array, m + 1, arrEnd);
           merge(array, arrBegin, m, arrEnd);
        }
    }
   private static void merge(int array[], int begin, int midel, int end){
        int n1 = midel - begin + 1;
        int n2 = end - midel;
        int l[] = new int[n1];
        int r[] = new int[n2];
        for (int i = 0; i < n1; ++i){
            l[i] = array[begin + i];
        }
        for (int j = 0; j < n2; ++j){
            r[j] = array[midel + 1 + j];
        }
        int i = 0, j = 0;
        int k = begin;
        while (i < n1 && j < n2) {
            if (l[i] <= r[j]) {
                array[k] = l[i];
                i++;
            }
            else {
                array[k] = r[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            array[k] = l[i];
            i++;
            k++;
        }
        while (j < n2) {
            array[k] = r[j];
            j++;
            k++;
        }

    }
    public static void sortByQuickSorting(int[] array){

        quickSort(array,0, array.length-1);

    }
    static void quickSort(int[] arr, int start, int finish)
    {
        if (start < finish)
        { int pi = partition(arr, start, finish);
            quickSort(arr, start, pi - 1);
            quickSort(arr, pi + 1, finish);
        }
    }
    static int partition(int[] arr, int start, int finish)
    {
        int axis = arr[finish];
        int i = (start - 1);
        for(int j = start; j <= finish - 1; j++){
            if (arr[j] < axis){
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, finish);
        return (i + 1);
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