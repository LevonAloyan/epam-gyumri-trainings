package functionalinterfaces;

import java.util.ArrayList;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class ExtendedList<T> extends ArrayList<T> {

    public ExtendedList<T> map(ExtendedList<T> array, UnaryOperator<T> square) {
        ExtendedList<T> arrayList = new ExtendedList<>();

        for (T t : array) {
            arrayList.add(square.apply(t));
        }
        return arrayList;
    }

    public ExtendedList<T> fill(Supplier<T> supplier) {

        ExtendedList<T> extendedList = new ExtendedList<>();
        for (int i = 0; i < 100; i++) {
            extendedList.add(supplier.get());
        }
        return extendedList;
    }

    public boolean forAll(ExtendedList<T> extendedList, Predicate<T> predicate) {

        for (T i : extendedList) {
            if (!predicate.test(i)) {
                return false;
            }
        }
        return true;
    }

    public ExtendedList<ExtendedList> partition(ExtendedList<T> extendedList, Predicate<T> predicate) {

        ExtendedList<T> predicateList = new ExtendedList<>();
        ExtendedList<T> nonpredicateList = new ExtendedList<>();

        for (T t : extendedList) {
            if (predicate.test(t)) {
                predicateList.add(t);
            } else {
                nonpredicateList.add(t);
            }
        }
        ExtendedList<ExtendedList> extendedLists = new ExtendedList<>();

        extendedLists.add(predicateList);
        extendedLists.add(nonpredicateList);

        return extendedLists;
    }

    public Integer reduce(ExtendedList<T> list, BinaryOperator<T> binaryOperator, Integer startValue) {

        int sum = startValue;
        for (T t : list) {
            sum += (int) binaryOperator.apply((T) startValue, t);
        }
        return sum;
    }
}
