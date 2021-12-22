package mycollections;

public class DynamicArray<E> implements MyList<E> {

    private E[] array;
    private final int DEFAULT_SIZE = 16;
    private int size;

    @SuppressWarnings("unchecked")
    public DynamicArray() {
        array = (E[]) new Object[DEFAULT_SIZE];
    }

    @SuppressWarnings("unchecked")
    public DynamicArray(int initCapacity) {
        array = (E[]) new Object[initCapacity];

    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return this.size == 0;
    }

    @Override
    public boolean contains(E element) {
        return indexOf(element) != -1;
    }

    @Override
    public int indexOf(E element) {
        if (element == null) {
            for (int i = 0; i < size; i++) {
                if (array[i] == null) {
                    return i;
                }
            }
        } else {
            for (int i = 0; i < size; i++) {
                if (array[i] == element) {
                    return i;
                }
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(E element) {
        if (element == null) {
            for (int i = size - 1; i >= 0; i--) {
                if (array[i] == null) {
                    return i;
                }
            }
        } else {
            for (int i = size - 1; i >= 0; i--) {
                if (array[i] == element) {
                    return i;
                }
            }
        }
        return -1;
    }

    @Override
    public E get(int index) {
        rangeCheck(index);
        return array[index];
    }

    @Override
    public E set(int index, E element) {
        rangeCheck(index);
        E oldElement = array[index];
        array[index] = element;
        return oldElement;
    }

    @Override
    public boolean add(E e) {
        if (size == (int) ((array.length) * 0.75)) {
            ensureCapacity();
        }
        array[size++] = e;
        return true;
    }

    @Override
    public void add(int index, E element) {
        rangeCheck(index);
        if (array.length - 1 - index >= 0) {
            System.arraycopy(array, index, array, index + 1, array.length - 1 - index);
        }
        array[index] = element;
        size++;
    }

    @Override
    public E remove(int index) {
        rangeCheck(index);
        E oldElement = array[index];
        System.arraycopy(array, index + 1, array, index, array.length - 1 - index);
        size--;
        return oldElement;
    }

    @Override
    public boolean remove(E element) {
        if (element == null) {
            remove(indexOf(null));
        } else {
            remove(indexOf(element));
        }
        return true;
    }

    @SuppressWarnings("unchecked")
    private void ensureCapacity() {
        int length = (int) (DEFAULT_SIZE * 1.5);
        E[] newArray = (E[]) (new Object[length]);
        System.arraycopy(array, 0, newArray, 0, array.length);
        array = newArray;
    }

    private void rangeCheck(int index) {
        if (index < 0 || (index > this.size)) {
            throw new IndexOutOfBoundsException();
        }
    }
}
