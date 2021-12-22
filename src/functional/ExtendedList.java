package functional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.*;

public class ExtendedList<T> extends ArrayList<T> {

    public ExtendedList() {
        super();
    }

    public ExtendedList(int initialCapacity) {
        super(initialCapacity);
    }


    public ExtendedList<T> map(UnaryOperator<T> square) {
        Object[] originalList = super.toArray();
        ExtendedList<T> squareList = new ExtendedList<>();

        for (Object ob : originalList) {
            squareList.add(square.apply((T) ob));
        }
        return squareList;
    }

    public boolean forAll(Predicate<T> predicate) {
        Object[] originalList = super.toArray();

        for (Object ob : originalList) {
            if (!(predicate.test((T) ob))) {
                return false;
            }
        }
        return true;
    }

    public ExtendedList<ExtendedList<T>> partition(Predicate<T> predicate) {
        Object[] originalList = super.toArray();
        ExtendedList<T> evenNumberList = new ExtendedList<>();
        ExtendedList<T> oddNumberList = new ExtendedList<>();
        ExtendedList<ExtendedList<T>> resultList = new ExtendedList<>();

        for (Object ob : originalList) {
            if (predicate.test((T) ob)) {
                evenNumberList.add((T) ob);
            } else {
                oddNumberList.add((T) ob);
            }
        }
        resultList.add(evenNumberList);
        resultList.add(oddNumberList);

        return resultList;
    }


    public T reduce(BinaryOperator<T> binaryOperator, Integer identityElement) {
        Object[] originalList = super.toArray();

        T sum = (T) identityElement;
        for (Object ob : originalList) {
            sum = binaryOperator.apply(sum, (T) ob);
        }
        return sum;
    }

    public ExtendedList<T> fill(int initialCapacity, Supplier<T> supplier) {
        ExtendedList<T> newArray = new ExtendedList<>(initialCapacity);

        for (int i = 0; i < initialCapacity; i++) {
            T apply = supplier.get();
            newArray.add(apply);
        }
        return newArray;
    }
}
