package Expressions;

import java.util.ArrayList;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class ExtendsList<T> extends ArrayList <T>{

    public ExtendsList() {
        super();
    }

    public <R> ArrayList<R> map(Function<T, R> function) {
        ArrayList<R> myList = new ArrayList<R>();
        for (T el : this) {
            myList.add(function.apply(el));
        }
        return myList;
    }

    public ArrayList<T> fill(Supplier<T> supplier, int count) {
        ArrayList<T> myList = new ArrayList<T>();
        for (int i = 0; i < count; i++) {
            myList.add(supplier.get());
        }
        return myList;
    }

    public boolean forAll(Predicate<T> predicate) {
        for (T el : this) {
            if (!predicate.test(el)) {
                return false;
            }
        }
        return true;
    }

    public ArrayList[] partition(Predicate<T> predicate) {
        ArrayList<T> evenList = new ArrayList<>();
        ArrayList<T> oddList = new ArrayList<>();
        ArrayList[] arrayList = new ArrayList[2];
        for (T el : this) {
            if (predicate.test(el)) {
                evenList.add(el);
            } else {
                oddList.add(el);
            }
        }
        arrayList[0] = evenList;
        arrayList[1] = oddList;
        return arrayList;
    }

    public T reduce(BinaryOperator<T> binOperator, T identityEl) {
        for (T el : this) {
            identityEl = binOperator.apply(el, identityEl);
        }
        return identityEl;
    }
}
