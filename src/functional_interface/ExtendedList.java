package functional_interface;

import java.util.ArrayList;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class ExtendedList<T> extends ArrayList<T> {
    public static void main(String[] args) {

        ExtendedList<Integer> list = new ExtendedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(-5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);

        System.out.println(list.map(x -> x * x, list));
        System.out.println(list.fill(() ->(int) (Math.random() * 100)));
        System.out.println(list.forAll(x -> x > 0, list));
        System.out.println(list.partition(list, x -> x % 2 == 0));
        System.out.println(list.reduce(list, Integer::sum,0));




    }

    public ExtendedList<T> map(UnaryOperator<T> square, ExtendedList<T> list) {
        ExtendedList<T> arrayList = new ExtendedList<>();
        for (T t : list) {
            arrayList.add(square.apply(t));
        }
        return arrayList;
    }

    public ExtendedList<T> fill (Supplier<T> supplier){
        ExtendedList<T> list = new ExtendedList<>();
        for (int i = 0; i <= 100; i++) {
            list.add(supplier.get());
        }
        return list;
    }

    public boolean forAll(Predicate<T> predicate, ExtendedList<T> list) {
        for (T t : list) {
            if (!predicate.test(t)) {
                return false;
            }
        }
        return true;
    }
    public ExtendedList<ExtendedList> partition(ExtendedList<T> list,Predicate<T> predicate){
        ExtendedList<T> odd = new ExtendedList<>();
        ExtendedList<T> pair = new ExtendedList<>();

        for (T t : list) {
            if (!predicate.test(t)){
                odd.add(t);
            }else {
                pair.add(t);
            }
        }
        ExtendedList<ExtendedList>extendedList = new ExtendedList<>();

        extendedList.add(odd);
        extendedList.add(pair);

        return extendedList;
    }
    public Integer reduce(ExtendedList<T> list, BinaryOperator<T> binaryOperator,Integer startValue){
        int sum = startValue;
        for (T t : list) {
            sum += (Integer)binaryOperator.apply((T) startValue,t);

        }return sum;
    }
}
