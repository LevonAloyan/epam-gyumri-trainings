package mycollections;

import java.util.Arrays;

public class DynamicArray<E> implements MyList<E> {
    private final int DEFAULT_SIZE = 10;
    static int size = 0;

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
        for (int i = 0; i < size; i++) {
            if (arrayList[i] == element) {
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
    public E get(int index) {
        if (index >= 0 && index < size) {
            return arrayList[index];
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    @Override
    public E set(int index, E element) {
        if (index >= 0 && index < size()) {
            return arrayList[index] = element;
        }
        return null;
    }

    @Override
    public boolean add(E e) {
        arrayList[size++] = e;
        if (arrayList[size - 1] == (e)) {
            if (size == arrayList.length) {
                ensureCapacity();
            }
            return true;
        }
        return false;
    }

    @Override
    public void add(int index, E element) {
        if (size == arrayList.length) {
            ensureCapacity();
        }
        if (index < size) {
            System.arraycopy(arrayList, index, arrayList, index + 1, size - index);
            arrayList[index] = element;
            size++;
        }
    }

    @Override
    public E remove(int index) {
        if (index < size) {
            E value = arrayList[index];
            System.arraycopy(arrayList, index + 1, arrayList, index, size - index);
            size--;
            return value;
        } else throw new IndexOutOfBoundsException();
    }

    @Override
    public boolean remove(E element) {
        if (indexOf(element) < size) {
            remove(indexOf(element));
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        Object[] objects = new Object[size];
        System.arraycopy(arrayList, 0, objects, 0, size);
        return Arrays.toString(objects);
    }

    private void ensureCapacity() {
        Object[] array = new Object[arrayList.length + 10];
        System.arraycopy(this.arrayList, 0, array, 0, this.arrayList.length);
        this.arrayList = (E[]) array;
    }
}
