package algorithms;

public class SortingAlgorithms {

    public static void main(String[] args) {
        int[] array = new int[]{2, 1, 8, 3, 5, 5, -26};
        //sortByBubbleSorting(array);
        //sortBySelectionSorting(array);
        //sortByInsertionSorting(array);
        //sortByMergeSorting(array);
        sortByQuickSorting(array,0, array.length);
        print(array);
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
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                    swap(array, minIndex, i);
                }
            }
        }

    }

    public static void sortByInsertionSorting(int[] array) {
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

    public static void sortByMergeSorting(int[] array) {
        if (array.length < 2) {
            return;
        }

        int[] leftArray = new int[array.length / 2];
        System.arraycopy(array, 0, leftArray, 0, array.length / 2);

        int[] rightArray = new int[array.length - leftArray.length];
        System.arraycopy(array, leftArray.length, rightArray, 0, rightArray.length);

        sortByMergeSorting(leftArray);
        sortByMergeSorting(rightArray);

        mergeArray(array, leftArray, rightArray);
    }

    private static void mergeArray(int[] array, int[] leftArray, int[] rightArray) {

        int leftArrayIndex = 0;
        int rightArrayIndex = 0;

        for (int i = 0; i < array.length; i++) {
            if (leftArrayIndex == leftArray.length) {
                array[i] = rightArray[rightArrayIndex];
                rightArrayIndex++;
            } else if (rightArrayIndex == rightArray.length) {
                array[i] = leftArray[leftArrayIndex];
                leftArrayIndex++;
            } else if (leftArray[leftArrayIndex] < rightArray[rightArrayIndex]) {
                array[i] = leftArray[leftArrayIndex];
                leftArrayIndex++;
            } else {
                array[i] = rightArray[rightArrayIndex];
                rightArrayIndex++;
            }
        }
    }

    public static void sortByQuickSorting(int[] array, int startIndex, int endIndex){
        if (array.length == 0) {
            return;
        }
        if (startIndex >= endIndex) {
            return;
        }
        int middle = (startIndex + endIndex) / 2;
        int pivot = array[middle];
        int i = startIndex;
        int j = endIndex;
        while (i <= j) {
            while (array[i] < pivot) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }
            if (i <= j) {
                swap(array, i, j);
                i++;
                j--;
            }
        }
        if (startIndex < j)
            sortByQuickSorting(array, startIndex, j);

        if (endIndex > i)
            sortByQuickSorting(array, i, endIndex);
    }

    private static void swap(int[] array, int firstIndex, int lastIndex) {
        int tempValue = array[firstIndex];
        array[firstIndex] = array[lastIndex];
        array[lastIndex] = tempValue;
    }

    private static void print(int[] array) {
        for (int element : array) {
            System.out.print(element + ",");
        }
    }
}