package algorithms;

public class SortingAlgorithms {

    public static void main(String[] args) {
        int [] array = new int[]{2,-6,8,3,5,15};
        //sortByBubbleSorting(array);
       // print(array, "Sort By Bubble Sorting");
            System.out.println();
        //sortBySelectionSorting(array);
        //print(array, "Sort By Selection Sorting");
            System.out.println();
        //sortByInsertionSorting(array);
        //print(array, "Sort By Insertion Sorting");
            System.out.println();
       // array = sortByMergeSorting(array);
       // print(array, "Sort By Merge Sorting");
            System.out.println();
         array = sortByQuickSorting(array);
        print(array,"Sort By Quick Sorting");
            System.out.println();
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
        for(int i = 0; i< array.length; i++){
        int minIndex = i;
        for(int j = i + 1; j < array.length; j++) {
            if(array[j] < array [minIndex]) {
                minIndex = j;
            }
        }
        if(minIndex != i){
            swap(array,i, minIndex);
        }
        }
    }

    public static void sortByInsertionSorting(int[] array){
    for(int i = 0; i< array.length; i++){
        for (int  j  = i - 1; j >= 0; j--){
              if(array[i] < array[j]) {
                  swap(array, j, i);
              }
        }
         }
    }

    public static int[] sortByMergeSorting(int[] array){
        if (array.length <= 1) {
            return array;
        }
        int mid = array.length / 2;
        int[] leftArray  = new int[mid];
        int[] rightArray = new int[array.length - mid];
            for (int i = 0; i < mid; i++) {
                leftArray[i] = array[i];
        }
            for (int j = 0; j < rightArray.length; j++) {
                rightArray[j] = array[mid + j];
        }
            int [] result = new int[array.length];
       leftArray = sortByMergeSorting(leftArray);
       rightArray = sortByMergeSorting(rightArray);
       result =  merge(leftArray, rightArray);
        return result;
    }
        private static int[] merge(int[] leftArray, int[] rightArray) {
            int[] result = new int [leftArray.length + rightArray.length];
            int l = 0;
            int r = 0;
            int rt = 0;
            while (l < leftArray.length || r < rightArray.length) {
                if(l < leftArray.length && r < rightArray.length){
                    if (leftArray[l] < rightArray[r]) {
                        result[rt++] = leftArray[l++];
                    } else {
                        result[rt++] = rightArray[r++];
                    }
                } else if(l < leftArray.length){
                    result[rt++] = leftArray[l++];
                }
                else if (r < rightArray.length) {
                    result[rt++] = rightArray[r++];
                }
            }
            return result;
    }


    public static int[] sortByQuickSorting(int[] array) {
        quick(array, 0, array.length - 1);
        return array;
    }
    private static  int sortQuick (int array[], int start, int end){
        int pivot = array[end];
        int i = (start - 1);
            for (int j = start; j <= end - 1; j++)
        {
            if (array[j] < pivot)
            {
                i++;
                swap(array, i, j);
            }
        }
        swap(array,i+1, end);
        return (i + 1);
    }
    public static void quick(int[] array, int start, int end){
        if (start < end)
        {
            int p = sortQuick(array, start, end);
            quick(array, start, p - 1);
            quick(array, p + 1, end);
        }
    }

    private static void swap(int [] array, int firstIndex, int lastIndex) {
        int tempValue = array[firstIndex];
        array[firstIndex] = array[lastIndex];
        array[lastIndex] = tempValue;
    }
    private static void print (int [] array, String sortingAlgorithmName ){
        System.out.print(sortingAlgorithmName + " ~ ");
        for(int element : array){
            System.out.print(element+", ");
        }
    }
}
