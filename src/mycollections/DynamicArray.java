package mycollections;

public class DynamicArray<E> implements MyList<E> {
    private final int INITIAL_CAPACITY = 16;
    private E[] array;
    private int size;


    public DynamicArray() {
        this.array = (E[]) new Object[INITIAL_CAPACITY];
    }

    public DynamicArray(int length) {
        this.array = (E[]) new Object[length];
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
        for (int i = 0; i < size; i++) {
            if (array[i].equals(element)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int indexOf(E element) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(E element) {
        for (int i = size; i > 0; i--) {
            if (array[i] != null && array[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public E get(int index) {
        if (index > 0 || index <= size) {
            for (int i = 0; i < size; i++) {
                if (i == index) {
                    return array[i];
                }
            }
        }
        return null;
    }

    @Override
    public E set(int index, E element) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException();
        } else {
            return array[index] = element;
        }
    }

    @Override
    public boolean add(E e) {
        array[size++] = e;
        return true;
    }

    @Override
    public void add(int index, E element) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException();
        }
        resize();
        for (int i = size; i >= index; i--) {
            array[i + 1] = array[i];
        }
        array[index] = element;
        size++;
    }

    private void resize() {
        if (array.length == size) {
            E[] newArray = (E[]) new Object[size * 2];
            for (int i = 0; i < size; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
        }
    }

    @Override
    public E remove(int index) {
        if (index >= 0 || index <= size) {
            for (int i = 0; i < size; i++) {
                if (i == index) {
                    E value = array[i];
                    for (int j = i; j < size; j++) {
                        array[j] = array[j + 1];
                    }
                    size--;
                    return value;
                }
            }
        }
        return null;
    }

    @Override
    public boolean remove(E element) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(element)) {
                for (int j = i; j < size; j++) {
                    array[j] = array[j + 1];
                    size--;
                }
                return true;
            }
        }
        return false;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
