package arrays;

public class ArrayUtilTest {


    public static int[] array = new int[]{4, 2, 3, 1, 1, 1};


    public static void main(String[] args) {
        ArrayUtil.createArray(5);
        ArrayUtil.create2dArray(5,6);
        ArrayUtil.addFirst(array,56);
        ArrayUtil.contains(array,4);
        ArrayUtil.indexOf(array, 1);
        ArrayUtil.remove(array, 2);
        ArrayUtil.sum(array);
        ArrayUtil.getMax(array);
        ArrayUtil.getMin(array);
        ArrayUtil.getAvg(array);
    }
}
