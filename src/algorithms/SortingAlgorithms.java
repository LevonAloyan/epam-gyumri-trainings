package algorithms;

public class SortingAlgorithms {
    public static void main(String args[]) {
        int[] array = new int[]{2, 1, 8, 3, 5, 5, -26};
        sortByBubbleSorting(array);
        sortBySelectionSorting(array);
        sortBySelectionSorting(array);
        sortByMergeSorting(array);
        print(array);
        sortByQuickSorting(array,array[0],-26);
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
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + " ");
        }
        System.out.println();
    }

    public static void swap(int[] array, int index1, int index2) {
        int temp = 0;
        temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void sortBySelectionSorting(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int minValue = array[i];
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < minValue) {
                    minValue = array[j];
                    minIndex = i;
                }
            }
            if (i != minIndex) {
                int temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }

            System.out.print(array[i] + " ");

        }
        System.out.println();

    }

    public static void sortInsertionSorting(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int index = i;
            int temp = array[i];
            while (index > 0 && array[index - 1] >= temp) {
                array[index] = array[index - 1];
                index--;
            }

            array[index] = temp;

            System.out.println(array[i] + " ");
        }
        System.out.println();
    }

    public static void sortByMergeSorting(int[] array) {
        int temp = array.length;
        if (temp < 2) {
            return;
        }
        int midIndex = temp / 2;
        int[] leftHalf = new int[midIndex];
        int[] rigthHalf = new int[temp - midIndex];
        for (int i = 0; i < midIndex; i++) {
            leftHalf[i] = array[i];
        }
        for (int i = midIndex; i < temp; i++) {
            rigthHalf[i - midIndex] = array[i];

        }
        sortByMergeSorting(leftHalf);
        sortByMergeSorting(rigthHalf);
    }

    public static void marge(int[] array, int[] leftHalf, int[] rigthHalf) {


        int leftSize = leftHalf.length;
        int rigthSize = rigthHalf.length;
        int i = 0, j = 0, k = 0;
        while (i < leftSize && j < rigthSize) {
            if (leftHalf[i] <= rigthHalf[j]) {
                array[k] = leftHalf[i];
                i++;
            } else {
                array[k] = rigthHalf[j];
                j++;
            }
            k++;
        }
        while (i < leftSize) {
            array[k] = leftHalf[i];
            i++;
            k++;
        }
        while (j < rigthSize) {
            array[k] = rigthHalf[j];
            j++;
            k++;
        }
        for (i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }

    public static void sortByQuickSorting(int [] array, int startIndex, int endIndex){
          if(array.length==0){
              return;
          }
          if(startIndex>=endIndex){
              return;
          }
          int i= startIndex;
          int j= endIndex;
          int midle = array[(i+j/2)];
          do{
              while(array[i]>midle){
                  i++;
              }
              while(array[j]>midle){
                  j++;
              }
              if(i<=j){
                  swap(array, i, j);
              }
          }while(i<=j);
          if(startIndex<j){
           sortByQuickSorting(array, startIndex, j);
           if(i<endIndex){
               sortByQuickSorting(array, i, endIndex);
           }
          }

      }
   /*public static void sortByQuickSorting(int[] array, int startIndex, int endIndex) {
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
       System.out.println();
   }*/



    private static void print(int[] array) {
        for (int element : array) {
            System.out.print(element + ",");

        }System.out.println();
    }


}


