package functionalinterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;


public class ExtendedList<T> extends ArrayList<T> {

    public <R extends Number> ArrayList<R> map(Function<T, R> function) {
        ArrayList<R> list = new ArrayList<>();
        for (int i = 0; i < this.size(); i++) {
            list.add(function.apply(this.get(i)));
        }
        return list;
    }

    public ArrayList<T> fill(Supplier<T> supplier, int elementCount) {
        ArrayList<T> list = new ArrayList<>();
        for (int i = 0; i < elementCount; i++) {
            list.add(supplier.get());
        }
        return list;
    }

    public boolean forAll(Predicate<T> predicate) {
        List<Boolean> predicateChecker = new ArrayList<>();
        for (T t : this) {
            if (predicate.test(t)) {
                predicateChecker.add(true);
            }
        }
        return predicateChecker.size() == this.size();
    }

    public List<ArrayList<T>> partition(Predicate<T> predicate) {

        List<ArrayList<T>> arrayOfList = new ArrayList<>();
        ArrayList<T> truePredicate = new ArrayList<>();
        ArrayList<T> falsePredicate = new ArrayList<>();
        for (T element : this) {
            if (predicate.test(element)) {
                truePredicate.add(element);
                System.out.println(element + " element satisfies the predicate. True");
            } else {
                falsePredicate.add(element);
                System.out.println(element + " element doesn't satisfy the predicate. False");
            }
        }
        arrayOfList.add(truePredicate);
        arrayOfList.add(falsePredicate);
        return arrayOfList;
    }

    public T reduce(BinaryOperator<T> binaryOperator, T identityElement) {
        T result = binaryOperator.apply(this.get(0), identityElement);
        for (int i = 1; i < this.size(); i++) {
            result = binaryOperator.apply(this.get(i), result);
        }
        return result;
    }
}
