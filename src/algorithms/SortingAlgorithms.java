package algorithms;

public class SortingAlgorithms {

    public static void main(String[] args) {
        int[] array = new int[]{2, 12, 3, 21, 8, 0, 18, -26};
//           sortByBubbleSorting(array);
//          print(array, "sortByBubbleSorting");
//         sortBySelectionSorting(array);
//        print(array, "sortBySelectionSorting");
        sortByInsertionSorting(array);
        print(array, " sortByInsertionSorting");
//     sortByMergeSorting(array);
//    print(array, "sortByMergeSorting");
//   sortByQuickSorting(array,0,array.length-1);
//  print(array, "sortByQuickSorting");
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

    public static void sortBySelectionSorting(int[] array) {
        for (int k = 0; k < array.length; k++) {
            for (int l = k + 1; l < array.length; l++) {
                if (array[l] < array[k]) {
                    swap(array, k, l);
                }
            }
        }
    }

    public static void sortByInsertionSorting(int[] array) {
        for (int l = 1; l < array.length; l++) {
            int key = array[l];
            int m = l - 1;
            while (m >= 0 && array[m] > key) {
                array[m + 1] = array[m];
                m--;
            }
            array[m + 1] = key;
        }
    }

    public static void sortByMergeSorting(int[] array) {
        if (array.length < 2) {
            return;
        }
        int middle = array.length / 2;
        int[] leftArr = new int[middle];
        int[] rightArr = new int[array.length - middle];
        for (int i = 0; i < middle; i++) {
            leftArr[i] = array[i];
        }
        for (int j = 0; j < rightArr.length; j++) {
            rightArr[j] = array[middle + j];
        }
        sortByMergeSorting(leftArr);
        sortByMergeSorting(rightArr);
        mergeArray(array, leftArr, rightArr);
    }

    public static void mergeArray(int[] array, int[] leftArr, int[] rightArr) {
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < leftArr.length && j < rightArr.length) {
            if (leftArr[i] <= rightArr[j]) {
                array[k] = leftArr[i];
                i++;
            } else {
                array[k] = rightArr[j];
                j++;
            }
            k++;
        }

        while (i < leftArr.length) {
            array[k] = leftArr[i];
            i++;
            k++;
        }

        while (j < rightArr.length) {
            array[k] = rightArr[j];
            j++;
            k++;
        }

    }
        public static void sortByQuickSorting ( int[] array, int begin, int end){
            if (begin >= end) {
                return;
            }
            int p = partition(array, begin, end);
            if (begin < p - 1) {
                sortByQuickSorting(array, begin, p - 1);
            }
            if (p < end) {
                sortByQuickSorting(array, p + 1, end);
            }

        }
        private static int partition ( int array[], int begin, int end){

            int pivot = array[end];
            int i = (begin - 1);
            for (int b = begin; b < end; b++) {
                if (array[b] <= pivot) {
                    i++;
                    swap(array, i, b);
                }
            }
            swap(array, i + 1, end);
            return i + 1;
        }


    private static void swap(int[] array, int firstIndex, int lastIndex) {
        int tempValue = array[firstIndex];
        array[firstIndex] = array[lastIndex];
        array[lastIndex] = tempValue;
    }

    private static void print(int[] array, String Name) {
        System.out.print(Name + "   ");
        for (int element : array) {
            System.out.print(element + ", ");
        }
        System.out.println();
    }
}


