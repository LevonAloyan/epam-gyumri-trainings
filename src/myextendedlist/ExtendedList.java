package myextendedlist;

import java.util.ArrayList;
import java.util.Random;
import java.util.function.*;

public class ExtendedList<T> extends ArrayList<T> {

    public <R> ArrayList map(Function<T, R> function, ArrayList<T> list) {
        ArrayList<R> rList = new ArrayList<>();

        for (T tList : list) {
            rList.add(function.apply(tList));
        }
        return rList;
    }

    public void fill(Random random, int randomNumbersQuantity) {
        Supplier<Integer> supplier = () -> random.nextInt(100);

        for (int j = 0; j < randomNumbersQuantity; j++) {
            this.add((T) supplier.get());
        }
    }

    public boolean forAll(Predicate<T> evenNumber) {
        for (T num : this) {
            if (!(evenNumber.test(num))) {
                return false;
            }
        }
        return true;
    }

    public ArrayList<T>[] partition(Predicate<T> predicate) {
        ArrayList<T> evenNumbersList = new ArrayList<>();
        ArrayList<T> oddNumbersList = new ArrayList<>();
        ArrayList[] generalList = new ArrayList[2];

        for (T num : this) {
            if (predicate.test(num)) {
                evenNumbersList.add(num);
            } else {
                oddNumbersList.add(num);
            }
        }

        generalList[0] = evenNumbersList;
        generalList[1] = oddNumbersList;

        return generalList;
    }

    public T reduce( BinaryOperator<T> binaryOperator, T identityElement) {
        for (T list: this) {
            identityElement = binaryOperator.apply(list,identityElement);
        }
        return identityElement ;
    }
}