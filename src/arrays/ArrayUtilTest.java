package arrays;

import array.ArrayUtil;

public class ArrayUtilTest {

    public static void main(String[] args) {
        System.out.println("createArray");
        int [] array = {5, 9, 15, 27, 8, 19, 35};
        ArrayUtil.createArray(15);
        System.out.println("create2dArray");
        ArrayUtil.create2dArray(3, 5);
        System.out.println("addFirst");
        ArrayUtil.addFirst(array, 17);
        System.out.println("contains");
        System.out.println(ArrayUtil.contains(array, 19));
        System.out.println("indexOf");
        System.out.println(ArrayUtil.indexOf(array, 27));
        System.out.println("remove");
        ArrayUtil.remove(array, 3);
        System.out.println("sum");
        System.out.println(ArrayUtil.sum(array));
        System.out.println("getMax");
        System.out.println(ArrayUtil.getMax(array));
        System.out.println("getMin");
        ArrayUtil.getMin(array);
        System.out.println("getAvg");
        System.out.println(ArrayUtil.getAvg(array));
    }
}
