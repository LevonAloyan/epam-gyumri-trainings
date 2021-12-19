package mycollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class DynamicArray<E> implements MyList<E> {
    static int size = 0;
    private final int DEFAULT_SIZE = 10;
    E[] arrayList = (E[]) new Object[DEFAULT_SIZE];

    public E[] copyArray(E[] arrayList) {
        E[] tmpArray = (E[]) new Object[size * 2];

        System.arraycopy(arrayList, 0, tmpArray, 0, arrayList.length);
        this.arrayList = tmpArray;
        return arrayList;
    }


    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean contains(E element) {
        for (int i = 0; i < size; i++) {
            if (arrayList[i].equals(element)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int indexOf(E element) {
        for (int i = 0; i < size; i++) {
            if (arrayList[i].equals(element)) {
                return i;
            }

        }
        return 0;
    }

    @Override
    public int lastIndexOf(E element) {
        for (int i = size; i >= 0; i--) {
            if (arrayList[i] == element) {
                return i;
            }
        }
        return 0;
    }

    @Override
    public E get(int index) throws Exception {
        if (index > size) {
            throw new Exception("There is no value with such an index");
        } else {
            return arrayList[index];
        }
    }

    @Override
    public E set(int index, E element) throws Exception {
        if (index > size) {
            throw new Exception("There is no value with such an index");
        }
        return arrayList[index] = element;
    }

    @Override
    public boolean add(E e) {
        if (size == arrayList.length) {
            copyArray(arrayList);
        } else {
            arrayList[size++] = e;
            if (arrayList[size - 1].equals(e)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void add(int index, E element) {
        if (size == arrayList.length - 1) {
            copyArray(arrayList);
        }
        if (index <= size) {
            System.arraycopy(arrayList, index, arrayList, index + 1,
                    size - index);
            arrayList[index] = element;
            size++;
        }

    }

    @Override
    public E remove(int index) throws Exception {

        if (index < size) {
            E ex = arrayList[index];
            System.arraycopy(arrayList, index + 1, arrayList, index, size - index);
            size--;
            return ex;
        } else {
            throw new Exception("There is no value with such an index");
        }
    }

    @Override
    public boolean remove(E element) throws Exception {
        if (indexOf(element) < size) {
            remove(indexOf(element));
            return true;
        }
        return false;
    }

    public void removeAll() {
        for (int i = 0; i <= size; i++) {
            size-=i;
            arrayList[i] = null;
        }
    }

    @Override
    public String toString() {
        Object[] objects = new Object[size];
        System.arraycopy(arrayList, 0, objects, 0, size);
        return Arrays.toString(objects);
    }
}
