package extendedList;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class ExtendedList<T> extends ArrayList<T> {

    public <R> ArrayList<R> map(Function<T, R> function) {
        ArrayList<R> list = new ArrayList<>();
        for (T t : this) {
            list.add(function.apply(t));
        }
        return list;
    }

    public void fill(Supplier<T> supplier, int i) {
        for (int j = 0; j < i; j++) {
            this.add(supplier.get());
        }
    }

    public boolean forAll(Predicate<T> predicate) {
        for (T t : this) {
            if (!predicate.test(t)) {
                return false;
            }
        }
        return true;
    }

    @SuppressWarnings("rawtypes")
    public ArrayList[] partition(Predicate<T> predicate) {
        ArrayList<T> list1 = new ArrayList<>();
        ArrayList<T> list2 = new ArrayList<>();
        ArrayList[] array = new ArrayList[2];
        for (T t : this) {
            if (predicate.test(t)) {
                list1.add(t);
            } else {
                list2.add(t);
            }
        }
        array[0] = list1;
        array[1] = list2;
        return array;
    }

}
