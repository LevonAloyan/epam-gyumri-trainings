package mycollections;

import java.util.Arrays;
import java.util.Objects;

public class DynamicArray<E> implements MyList<E> {
    private final int DEFAULT_SIZE = 10;
    static int size = 0;
    static int INDEX = -1;
    E[] arrayList = (E[]) new Object[DEFAULT_SIZE];

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(E element) {
        for (E e : arrayList) {
            if (e == element) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int indexOf(E element) {
        for (E e : arrayList) {
            if (e == element) {
                return INDEX;
            }
        }
        return 0;
    }

    @Override
    public int lastIndexOf(E element) {
        return 0;
    }

    @Override
    public E get(int index) {
        for (E e : arrayList) {
            if (INDEX == index) {
                return e;
            }
        }
        return null;
    }
//    public void cursor(){
//       INDEX++;
//    }

    @Override
    public E set(int index, E element) {
        return null;
    }

    @Override
    public boolean add(E e) {
        arrayList[size++] = e;
        if (arrayList[size - 1] == (e)) {
            if (size == arrayList.length) {
                ensureCapacity();
            }
            INDEX++;
            return true;
        }
        return false;
    }

    @Override
    public void add(int index, E element) {
    }

    @Override
    public E remove(int index) {
        return null;
    }

    @Override
    public boolean remove(E element) {
        for (int i = 0; i < arrayList.length; i++) {
            if (arrayList[i] == element) {
                arrayList[i] = null;
                size--;
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return Arrays.toString(arrayList);

    }

    private void ensureCapacity() {
        Object[] array = new Object[arrayList.length + 10];
        System.arraycopy(this.arrayList, 0, array, 0, this.arrayList.length);
        this.arrayList = (E[]) array;
    }
}
