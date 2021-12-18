package mycollections;

public class DynamicArray<E> implements MyList<E> {

    int size = 0;
    int cursor = -1;
    private static final int DEFAULT_CAPACITY = 10;
    E[] arrayList;

    public DynamicArray(int capacity) {
        this.size = size;
        this.arrayList = (E[]) new Object[capacity];
    }

    public DynamicArray() {
        this.arrayList = (E[]) new Object[DEFAULT_CAPACITY];
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        if (this.size <= 0) {
            return true;
        }
        return false;
    }

    @Override
    public boolean contains(E element) {
        if (this.size != 0) {
            for (int i = 0; i < size; i++) {
                if (arrayList[i].equals(element)) {
                    return true;
                }
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
        return -1;
    }

    @Override
    public int lastIndexOf(E element) {
        int temp = -1;
        for (int i = 0; i < size; i++) {
            if (arrayList[i].equals(element)) {
                temp = i;
            }
        }
        return temp;
    }

    @Override
    public E get(int index) {
        if (index > size) {
            return null;
        }
        return arrayList[index];
    }

    @Override
    public E set(int index, E element) {
        E temp = arrayList[index];
        arrayList[index] = element;

        return temp;
    }

    @Override
    public boolean add(E e) {
        arrayList[++cursor] = e;
        if (arrayList.length - 1 <= size) {
            ensureCapacity();
        }
        if (arrayList[cursor].equals(e)) {
            size++;
            return true;
        }
        return false;
    }

    @Override
    public void add(int index, E element) {
        if (arrayList.length - 1 <= size) {
            ensureCapacity();
        }
        for (int i = size; i >= index; i--) {
            arrayList[i + 1] = arrayList[i];
        }
        arrayList[index] = element;
    }

    @Override
    public E removeByIndex(int index) {
        E temp = null;
        for (int i = index; i < size; i++) {
            temp = arrayList[index];
            arrayList[i] = arrayList[i + 1];
            arrayList[size] = null;
        }
        size--;
        return temp;
    }

    @Override
    public boolean remove(E element) {
        E temp;
        for (int i = 0; i < size; i++) {
            if (arrayList[i] == element) {
                removeByIndex(i);
                return true;
            }
        }
        return false;
    }


    private void ensureCapacity() {
        E[] newArray = (E[]) new Object[arrayList.length * 2];
        System.arraycopy(arrayList, 0, newArray, 0, arrayList.length);
        this.arrayList = newArray;
    }

    public void print() {
        for (int i = 0; i <= size; i++) {
            System.out.print(arrayList[i] + " , ");
        }
        System.out.println();

    }
}
