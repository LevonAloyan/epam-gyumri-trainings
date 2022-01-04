package mycollections;

import java.util.ArrayList;
import java.util.function.*;

public class ExtendedList<E> extends ArrayList<E> {

    public <R> ArrayList<R> map(Function<E, R> function) {
        ArrayList<R> newList = new ArrayList<>();
        for (E element : this) {
            newList.add(function.apply(element));
        }
        return newList;
    }


    public void fill(Supplier<E> supplier, int quantity) {
        for (int i = 0; i < quantity; i++) {
            this.add(supplier.get());
        }
    }

    public boolean forAll(Predicate<E> isEven) {
        for (E element : this)
            if (!isEven.test(element)) {
                return false;
            }
        return true;
    }

    public <R> ArrayList[] partition(Predicate<E> predicate) {
        ArrayList<E> list1 = new ArrayList<>();
        ArrayList<E> list2 = new ArrayList<>();
        ArrayList[] total = new ArrayList[2];
        for (E element : this) {
            if (predicate.test(element)) {
                list1.add(element);
            } else {
                list2.add(element);
            }
        }
        total[0] = list1;
        total[1] = list2;
        return total;
    }

    public E reduce(E identityValue, BinaryOperator<E> binaryOperator) {
        for (E element : this) {
            identityValue = binaryOperator.apply(element, identityValue);
        }
        return identityValue;
    }
}
