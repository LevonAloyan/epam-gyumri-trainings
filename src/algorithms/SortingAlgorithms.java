package algorithms;

public class SortingAlgorithms {

    public static void main(String[] args) {
        int [] array = new int[]{2,1,8,3,5,5,-26};
        sortByBubbleSorting(array);
        print(array);
//        sortBySelectionSorting(array);
//        print(array);
//        sortByInsertionSorting(array);
//        print(array);
//        sortByMergeSorting(array);
//        print(array);
//        sortByQuickSorting(array);
//        print(array);
    }

    public static void sortByBubbleSorting(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    swap(array, j + 1, j);
                }
            }
        }
    }

    public static void sortBySelectionSorting(int[] array){
        int i, j;
        for (i = 0; i < array.length-1; i++) {
            int min = i;
            for (j = i+1; j < array.length; j++){
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            if (min != i){
                swap(array, i, min);
            }
        }
    }

    public static void sortByInsertionSorting(int[] array){
        int i, j, k;
        for (i = 1; i < array.length; i++) {
            k = array[i];
            j = i - 1;
            if (k < array[i - 1]) {
                while (j >= 0 && k < array[j]) {
                    array[j + 1] = array[j];
                    j = j - 1;
                }
                array[j + 1] = k;
            }
        }
    }

    public static void sortByMergeSorting(int[] array){
        mergeSort(array);
    }

    public static void sortByQuickSorting(int[] array){
        sortQuick(array, 0, array.length - 1);
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
        System.out.println();
    }
    private static void merge(int [] left, int [] right, int [] all){
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length){
            if(left[i] < right[j]){
                all[k] = left[i];
                i++;
            } else {
                all[k] = right[j];
                j++;
            }
            k++;
        }
        while (i < left.length) {
            all[k++] = left[i++];
        }
        while (j < right.length){
            all[k++] = right[j++];
        }
    }

    private static void mergeSort(int[]array) {
        if (array.length <= 1) {
            return;
        }
        int midpoint = array.length / 2;
        int[] left = new int[midpoint];
        int[] right = new int[array.length - midpoint];
        for (int i = 0; i < midpoint; i++) {
            left[i] = array[i];
        }
        for (int i = 0; i < array.length-midpoint; i++) {
            right[i] = array[midpoint+i];
        }
        mergeSort(left);
        mergeSort(right);
        merge(left, right, array);
    }

    private static void sortQuick (int []array, int left, int right){
        int index = mid(array, left, right);
        if (left < index - 1)
            sortQuick(array, left,index - 1);
    }

    private static int mid(int[] array, int left, int right) {
        int i = left;
        int j = right;
        int pivot = array[(left + right) / 2];
        while (i <= j) {
            while (array[i] < pivot)
                i++;
            while (array[j] > pivot)
                j--;
            if (i <= j) {
                swap(array, i, j);
                i++;
                j--;
            }
        }
        return i;
    }
}