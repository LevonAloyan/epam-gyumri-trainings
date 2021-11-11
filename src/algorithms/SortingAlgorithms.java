package algorithms;

public class SortingAlgorithms {

    public static void main(String[] args) {
        int[] array = new int[]{2, 1, 8, 3, 5, 5, -26, 9, 10, 12, -16};
        System.out.println("Initial Array: 2,1,8,3,5,5,-26,9,10,12,-16 ");
        //sortByBubbleSorting(array);
        // print(array);
        // System.out.println();
        //sortBySelectionSorting(array);
        //print(array);
        // System.out.println();
        //sortByInsertionSorting(array);
        // print(array);
        //System.out.println();
        sortByMergeSorting(array);
        System.out.print("Merge sort--->");
        print(array);
        System.out.println();
        sortByQuickSorting(array, 0, array.length - 1);
        System.out.print("Quick sort-->");
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
        System.out.print("Bubble Sorting---->");
    }

    public static void sortBySelectionSorting(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
        }

        System.out.print("Selection Sorting -->");
    }


    public static void sortByInsertionSorting(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int j = i;
            while ((j > 0) && (array[j - 1] > array[j])) {
                int tmp = array[j];
                array[j] = array[j - 1];
                array[j - 1] = tmp;
                j--;
            }
        }
        // return array;
        System.out.print("Insertion String--->");
    }

    public static void sortByMergeSorting(int[] array) {
        if (array.length < 2)
            return;
        int halfLength = array.length / 2;
        int[] lefOfArray = new int[halfLength];
        int[] rightOfArray = new int[array.length - halfLength];
        for (int i = 0; i < lefOfArray.length; i++) {
            lefOfArray[i] = array[i];
        }
        for (int i = 0; i < rightOfArray.length; i++) {
            rightOfArray[i] = array[lefOfArray.length + i];
        }
        sortByMergeSorting(rightOfArray);
        sortByMergeSorting(lefOfArray);
        merge(array, lefOfArray, rightOfArray);
    }
    private static void merge(int[] destArray, int[] arrayOne, int[] arrayTwo) {
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < arrayOne.length && j < arrayTwo.length) {
            if (arrayOne[i] <= arrayTwo[j]) {
                destArray[k++] = arrayOne[i++];
            } else {
                destArray[k++] = arrayTwo[j];
                arrayTwo[j++] = arrayOne[i];
            }
        }
        while (i < arrayOne.length) {
            destArray[k++] = arrayOne[i++];
        }
        while (j < arrayTwo.length) {
            destArray[k++] = arrayTwo[j++];
        }
    }

    public static void sortByQuickSorting(int[] array, int firstIndex, int lastIndex) {
        if (array.length == 0) {
            return;
        }
        if (firstIndex >= lastIndex)
            return;
        int pivot = array[0];
        while (firstIndex <= lastIndex) {
            while (array[firstIndex] < pivot) {
                firstIndex++;
            }
            while (array[lastIndex] > pivot) {
                lastIndex--;
            }
            if (firstIndex <= lastIndex) {
                swap(array, firstIndex, lastIndex);
            }
            firstIndex++;
            lastIndex--;
        }

        sortByQuickSorting(array, firstIndex, lastIndex);
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