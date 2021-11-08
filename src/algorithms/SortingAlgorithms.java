package algorithms;

public class SortingAlgorithms {

    public static void main(String[] args) {
        int [] array = new int[]{2,1,8,3,5,5,-26};
        //sortByBubbleSorting(array);
        //sortBySelectionSorting(array);
        sortByInsertionSorting(array);
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

        int min;

        for (int i = 0; i < array.length - 1; i++) {

            min = i;

            for (int j = i; j <array.length ; j++) {

                if (array[j] < array[min]){

                    min = j;
                }

            }

            if (array[min] != array[i]);{

                swap(array, i, min);

            }

        }
    }

    public static void sortByInsertionSorting(int[] array){

        for (int i = 0; i < array.length; i++) {

            int temp = array[i];

            int j = i - 1;

            while ((j >= 0) && (array[j] > temp)){

                array[j + 1] = array[j];

                j--;
            }

            array[j + 1]= temp;

        }

    }

    public static void sortByMergeSorting(int[] array){

    }

    public static void sortByQuickSorting(int[] array){

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