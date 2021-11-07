package algorithms;

public class SortingAlgorithms {

    public static void main(String[] args) {
        int[] array = new int[]{2, 1, 8, 3, 5, 5, -26};
        sortByBubbleSorting(array);
        print(array);
        System.out.println();
        sortBySelectionSorting(array);
        print(array);
        System.out.println();
        sortByInsertionSorting(array);
        print(array);
        System.out.println();
    }

    public static void sortByBubbleSorting(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    swap(array, j + 1, j);
                }
            }
        }
    }

    public static void sortBySelectionSorting(int[] array) {
        int min;
        int tempValue = 0;
        for (int i = 0; i < array.length; i++) {
            min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            tempValue = array[i];
            array[i] = array[min];
            array[min] = tempValue;
        }
    }

    public static void sortByInsertionSorting(int[] array) {
        int tempValue;
        int j;
        for (int i = 1; i <array.length ; i++) {
            tempValue=array[i];
            j=i;
            while (j>0 && array[j-1]>tempValue){
                array[j]=array[j-1];
                j=j-1;
            }
            array[j]=tempValue;
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