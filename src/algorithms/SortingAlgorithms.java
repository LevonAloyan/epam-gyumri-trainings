package algorithms;

public class SortingAlgorithms {

    public static void main(String[] args) {
        int [] array = new int[]{2,1,8,3,5,5,-26};
        sortByBubbleSorting(array);
//        sortBySelectionSorting(array);
//        sortByInsertionSorting(array);
//        sortByMergeSorting(array);
//        sortByQuickSorting(array, 0, array.length -1);
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
        for (int i = 0; i < array.length -1; i++){
            int min_value_index = i;
            for(int j = i+1; j < array.length ; j++){
                if(array[j] < array[min_value_index]){
                    min_value_index = j;
                }
            }
            swap(array, min_value_index, i);
        }
    }

    public static void sortByInsertionSorting(int[] array){
        for (int i=1; i<array.length; ++i) {
            int key = array[i];
            int j = i-1;

            while (j >= 0 && array[j] > key) {
                array[j+1] = array[j];
                j = j-1;
            }
            array[j+1] = key;
        }
    }

    public static void sortByMergeSorting(int[] array){
        if(array.length < 2){
            return;
        }
        int mid_pos = array.length / 2;
        int [] left_array = new int[mid_pos];
        int [] right_array = new int[array.length - mid_pos];

        for(int i = 0; i < mid_pos; i++){
            left_array[i] = array[i];
        }

        for(int i = mid_pos; i < array.length; i++){
            right_array[i -mid_pos] = array[i];
        }

        sortByMergeSorting(left_array);
        sortByMergeSorting(right_array);
        mergeArray(array, left_array, right_array, left_array.length, right_array.length);
    }

    public static void sortByQuickSorting(int[] array, int low, int high){
        if (low >= high){
            return;
        }

        int middle = low + (high - low) / 2;
        int pi = array[middle];

        int i = low, j = high;
        while (i <= j)
        {
            while (array[i] < pi) {
                i++;
            }

            while (array[j] > pi) {
                j--;
            }

            if (i <= j) {
                swap(array, i, j);
                i++;
                j--;
            }
        }

        if (low < j){
            sortByQuickSorting(array, low, j);
        }
        if (high > i){
            sortByQuickSorting(array, i, high);
        }
    }

    private static void swap(int [] array, int firstIndex, int lastIndex) {
        int tempValue = array[firstIndex];
        array[firstIndex] = array[lastIndex];
        array[lastIndex] = tempValue;
    }

    private static void mergeArray(int[] array, int[] left_arr, int[] right_arr, int left_l, int right_l){
        int i = 0, j = 0, k = 0;
        while (i < left_l && j < right_l) {
            if (left_arr[i] <= right_arr[j]) {
                array[k++] = left_arr[i++];
            }else {
                array[k++] = right_arr[j++];
            }
        }
        while (i < left_l) {
            array[k++] = left_arr[i++];
        }
        while (j < right_l) {
            array[k++] = right_arr[j++];
        }
    }

    private static void print (int [] array){
        for(int element : array){
            System.out.print(element+",");
        }
    }
}