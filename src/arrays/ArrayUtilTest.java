package arrays;

public class ArrayUtilTest {

    public static void main(String[] args) {
        ArrayUtil.createArray(13);
        ArrayUtil.create2dArray(3,5);
        int[] arr = { 45,2,14,62,74,89,51,12,5,7 };
        ArrayUtil.addFirst(arr,77);
        ArrayUtil.contains(arr,64);
        ArrayUtil.indexOf(arr,51);
        ArrayUtil.remove(arr,7);
        ArrayUtil.sum(arr);
        ArrayUtil.getMax(arr);
        ArrayUtil.getMin(arr);
        ArrayUtil.getAvg(arr);
    }
}
