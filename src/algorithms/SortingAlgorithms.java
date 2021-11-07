package algorithms;

public class SortingAlgorithms {

    public static void main(String[] args) {
        int[] array = new int[]{2, -45, 1, 8, 10,  3, 9, 5, 5, -26};
        sortByBubbleSorting(array);
        sortByInsertionSorting(array);
        sortBySelectionSorting(array);
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
            for (int j = i; j < array.length - 1; j++) {
                if (array[minIndex] > array[j + 1]){
                    minIndex = j + 1;
                }

            }
            if (minIndex != i) {
                swap(array, minIndex, i);
            }
        }
    }

    public static void sortByInsertionSorting(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int temp = 0;
            for (int j = 0; j < i + 1; j++) {
                if (array[i + 1 - temp] < array[i - temp]) {
                    swap(array, i + 1 - temp, i - temp);
                    temp++;
                } else {
                    break;
                }
            }
        }

    }

    public static void sortByMergeSorting(int[] array) {

    }

    public static void sortByQuickSorting(int[] array) {

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