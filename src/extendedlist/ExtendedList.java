package extendedlist;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class ExtendedList<T> extends ArrayList<T> {
    public <K> ArrayList<K> map(Function<T, K> function) {
        ArrayList<K> list = new ArrayList<>();
        for (T t : this) {                           //foreach
            list.add(function.apply(t));
        }
        return list;
    }


    public ArrayList<T> fill(Supplier<T> supplier, int count) {
        ArrayList<T> list = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            list.add(supplier.get());
        }
        return list;
    }

    public boolean forAll(Predicate<T> predicate) {
        for (T t : this) {
            if (!predicate.test(t)) {
                return  false;
            }
        }
return true;
    }

    public List<ArrayList<T>> partition(Predicate<T> predicate) {
        List<ArrayList<T>> arrayList = new ArrayList<>();
        ArrayList<T> listtrue = new ArrayList<>();
        ArrayList<T> listfalse = new ArrayList<>();
        for (T element : this) {
            if (predicate.test(element)) {
                listtrue.add(element);

            } else {
                listfalse.add(element);
                System.out.println(element + " element doesn't satisfy the predicate. False");


            }
        }
        arrayList.add(listtrue);
        arrayList.add(listfalse);
        return arrayList;
    }

    public T reduce(BinaryOperator<T> binaryOperator, T identityElement) {
        T result = identityElement;
        for (int i = 0; i < this.size(); i++) {
            result = binaryOperator.apply(this.get(i), result);
        }
        return result;
    }

}
