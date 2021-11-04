package arrays;

public class ArrayUtilTest {

    public static void main(String[] args) {
        int[] array = {8, 15, 0, 10, 32, 22, 44, 66, 12, -1};
        ArrayUtil.createArray(12);
        System.out.println();
        ArrayUtil.createArray(5);
        System.out.println();
        ArrayUtil.create2dArray(2,3);
        System.out.println();
        int max = ArrayUtil.getMax(array);
        System.out.println(max);
        System.out.println();
        ArrayUtil.getMin(array);
        System.out.println();
        int avg = ArrayUtil.getAvg(array);
        System.out.println(avg);
        long sum = ArrayUtil.sum(array);
        System.out.println(sum);
        int index = ArrayUtil.indexOf(array, 5);
        System.out.println(index);
        boolean contains = ArrayUtil.contains(array, 1);
        System.out.println(contains);
        int[] newArray = ArrayUtil.addFirst(array, 44);
        System.out.println(newArray);
        ArrayUtil.remove(array,2);
    }
}
