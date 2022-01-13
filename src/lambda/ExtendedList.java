package lambda;

import java.util.ArrayList;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class ExtendedList <T> extends ArrayList <T> {

    T element;

    ExtendedList(){
        super();
    }

    public T getElement() {
        return element;
    }

    public static final <T, R> ArrayList<T> map(ArrayList<T> list, Function<T, R> function) {

        ArrayList<R> returnList = new ArrayList<>();

        for (T current : list){
             returnList.add(function.apply(current));
        }
        return (ArrayList<T>) returnList;
    }

    public ArrayList<T> fill(Supplier <T> supplier, int initialCapacity){
        ArrayList<T> returnList = new ArrayList<>();
        for (int i = 0; i < initialCapacity; i++) {
            returnList.add(supplier.get());
        }
        return returnList;
    }

    public boolean forAll(ArrayList<T> list, Predicate<T> predicate){

        for (T current : list) {
            if (predicate.test(current)){
                return true;
            }
        }
        return false;
    }

    public ArrayList<T> partition(Predicate<T> predicate){
        ArrayList<T> OddAndEvenList = new ArrayList<>();
        ArrayList<T> oddList = new ArrayList<>();
        ArrayList<T> evenList = new ArrayList<>();

        for (T t : this){
            if (predicate.test(t)){
                evenList.add(t);
            }else {
                oddList.add(t);
            }
        }
        OddAndEvenList.add((T) evenList);
        OddAndEvenList.add((T) oddList);
        return OddAndEvenList;
    }

    public T reduce(T identity, BinaryOperator<T> b){
        T result = identity;
        for(T element : this){
            result = b.apply(result, element);
        }
        return result;
    }


    public void printArrayList(ExtendedList<T> es){
        System.out.print("[ ");
        for (T e: es) {
            System.out.print(e + ", ");
        }
        System.out.print(" ]");
        System.out.println();
    }

}
