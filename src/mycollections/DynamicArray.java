package mycollections;

public class DynamicArray<E> implements MyList<E> {

    private static final int DEFAULT_CAPACITY = 10;
    private Object[] array;
    private int size;

    public DynamicArray() {
        this.array = new Object[DEFAULT_CAPACITY];
    }

    public DynamicArray(E[] array) {
        this.array = array;
        this.size = array.length;
    }

    public DynamicArray(int capacity) {
        if (capacity > 0) {
            this.array = new Object[capacity];
        } else if (capacity == 0) {
            this.array = new Object[0];
        } else {
            throw new IllegalArgumentException("Capacity can't be less then 0");
        }
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
        if (element == null) {
            for (int i = 0; i < this.size; i++) {
                if (array[i] == null) {
                    return true;
                }
            }
        } else {
            for (int i = 0; i < this.size; i++) {
                if (element.equals(array[i])) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public int indexOf(E element) {
        if (element == null) {
            for (int i = 0; i < this.size; i++) {
                if (array[i] == null) {
                    return i;
                }
            }
        } else {
            for (int i = 0; i < this.size; i++) {
                if (element.equals(array[i])) {
                    return i;
                }
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(E element) {
        if (element == null) {
            for (int i = this.size - 1; i >= 0; i--) {
                if (array[i] == null) {
                    return i;
                }
            }
        } else {
            for (int i = this.size - 1; i >= 0; i--) {
                if (element.equals(array[i])) {
                    return i;
                }
            }
        }
        return -1;
    }

    @SuppressWarnings("unchecked")
    @Override
    public E get(int index) {
        checkIndex(index);
        return (E) this.array[index];
    }

    @SuppressWarnings("unchecked")
    @Override
    public E set(int index, E element) {
        checkIndex(index);
        E oldValue = (E) array[index];
        array[index] = element;
        return oldValue;
    }

    @Override
    public boolean add(E e) {
        if (this.isFully()) {
            this.grow();
        }
        this.array[size++] = e;
        return true;
    }

    @Override
    public void add(int index, E element) {
        checkIndex(index);
        if (this.isFully()) {
            this.grow();
        }
        System.arraycopy(this.array, index, this.array, index + 1, size - index);
        this.array[index] = element;
        this.size++;
    }

    @SuppressWarnings("unchecked")
    @Override
    public E remove(int index) {
        checkIndex(index);
        E removedElement = (E) this.array[index];
        System.arraycopy(this.array, index + 1, this.array, index, size - index);
        this.size--;
        return removedElement;
    }

    @Override
    public boolean remove(E element) {
        for (int i = 0; i < this.size; i++) {
            if (element.equals(array[i])) {
                this.remove(i);
                break;
            }
        }
        return true;
    }

    private boolean isFully() {
        return this.size == this.array.length;
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= this.size) {
            throw new IllegalArgumentException("Index is out of range");
        }
    }

    private void grow() {
        int newLength = this.array.length + (this.array.length >> 1);
        Object[] newArray = new Object[newLength];
        System.arraycopy(this.array, 0, newArray, 0, this.size);
        this.array = newArray;
    }


    public void print (){
        System.out.print("[ ");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.print("]");
        System.out.println();
    }
}
