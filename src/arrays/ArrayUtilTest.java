package arrays;

public class ArrayUtilTest {

    public static void main(String[] args) {
        System.out.println("createArray");
        int [] array = {5, 9, 15, 27, 8, 19, 35};
        ArrayUtil.createArray(array);
        System.out.println("create2dArray");
        ArrayUtil.create2dArray(2,3);
        System.out.println("addFirst");
        ArrayUtil.addFirst(array, 17);
        System.out.println("contains");
        ArrayUtil.contains(array, 19);
        System.out.println("indexOf");
        System.out.println(ArrayUtil.indexOf(array, 65));
        System.out.println("remove");
        ArrayUtil.remove(array, 3);

        System.out.println("sum");
        ArrayUtil.sum(array);
        System.out.println("getMax");
        ArrayUtil.getMax(array);
        System.out.println("getMin");
        ArrayUtil.getMin(array);
        System.out.println("getAvg");
        ArrayUtil.getAvg(array);

    }
}
