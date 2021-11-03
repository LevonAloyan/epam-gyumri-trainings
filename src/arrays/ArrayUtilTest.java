package arrays;

public class ArrayUtilTest {

    public static void main(String[] args) {

        // createArray
        ArrayUtil.createArray(5);

        System.out.println();
        System.out.println();

        //create2dArray
        ArrayUtil.create2dArray(3,20);

        System.out.println();
        System.out.println();

        // addFirst
        int[] array = {10, 12, 20, 34};

        for (int i : ArrayUtil.addFirst(array, 27)) {
            System.out.println(i);
        }
        System.out.println();



        // contains
        int[] array2 = {20, 30, 23, 4, 213, 234, 430, 234};

        System.out.print(ArrayUtil.contains(array2, 23));

        System.out.println();
        System.out.println();

        // indexOf
        System.out.println(ArrayUtil.indexOf(array2, 30));

        System.out.println();
        System.out.println();

        // remove
        ArrayUtil.remove(array2, 4);

        System.out.println();
        System.out.println();

        // sum
        System.out.println(ArrayUtil.sum(array2));

        System.out.println();
        System.out.println();

        // getMax
        System.out.println(ArrayUtil.getMax(array2));

        System.out.println();
        System.out.println();

        // getMin
        ArrayUtil.getMin(array2);

        System.out.println();
        System.out.println();

        //getAvg
        System.out.println(ArrayUtil.getAvg(array2));

    }
}
