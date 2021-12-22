package mycollections;

public class DynamicArray<E> implements MyList<E> {

    private int size = 0;
    private int tos = -1;
    private final int DEFAULT_SIZE = 10;
    private E[] array;

    public DynamicArray() {
        this.array = (E[]) new Object[DEFAULT_SIZE];
    }

    public DynamicArray(int size) {
        this.array = (E[]) new Object[size];
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        if (this.size == 0) {
            return true;
        }
        return false;
    }

    @Override
    public boolean contains(E element) {
        for (int i = 0; i < this.size; i++) {
            if (array[i].equals(element)) {
                return true;
            }
        }
        return false;

    }

    @Override
    public int indexOf(E element) {
        for (int i = 0; i < this.size; i++) {
            if (array[i].equals(element)) {
                return i;
            }

        }

        return -1;
    }

    @Override
    public int lastIndexOf(E element) {
        for (int i = this.size - 1; i >= 0; i--) {
            if (array[i].equals(element)) {
                return i;
            }
        }
        return 0;
    }

    @Override
    public E get(int index) {
        if (index > 0 && index < size()) {

            return array[index];

        }
        return null;
    }

    @Override
    public E set(int index, E element) {
        E temp = array[index];
        if (index > 0 && index < size()) {
            array[index]=element;
            return temp;
        }

        return null;
    }

    @Override
    public boolean add(E e) {
        array[++tos] = e;
        size++;
        return contains(e);
    }

    @Override
    public void add(int index, E element) {
        if (size() >= array.length) {
            ensureCapacity();
        }
        for (int i = size(); i > 0; i--) {
            array[i + 1] = array[i];
        }
        array[index] = element;
        size++;

    }

    @Override
    public E remove(int index) {
        if (index >= 0 && index < size()) {
            E temp = array[index];

            for (int i = index; i < size(); i++) {
                array[i] = array[i + 1];
            }
            array[size() - 1] = null;
            size--;
            return temp;
        }
        return null;
    }

    @Override
    public boolean remove(E element) {
        if (contains(element)) {
            remove(indexOf(element));
            return true;

        }
        return false;
    }
    private void ensureCapacity() {
        E[] newArray = (E[]) new Object[array.length * 2];
        System.arraycopy(array, 0, newArray, 0, array.length);
        this.array = newArray;
    }

    public void print() {
        for (int i = 0; i < size(); i++) {
            System.out.print(array[i] + ",");

        }
        System.out.println();
    }
}
