package mycollections;

public class DynamicArray<E>  implements MyList<E> {

	private static final int DEFAULT_CAPACITY= 10;
	E[] arrayList;
	int size=0;
    int cursor=-1;


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
		return this.size == 0;
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
		return -1;
	}

	@Override
	public int lastIndexOf(E element) {
		return 0;
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
		if (arrayList[cursor].equals(e)) {
			size++;
			return true;
		}
		return false;
	}

	@Override
	public void add(int index, E element) {

		for (int i = size; i >= index; i--) {
			arrayList[i + 1] = arrayList[i];
		}
		arrayList[index] = element;

	}

	@Override
	public E remove(int index) {
		return null;
	}

	@Override
	public boolean remove(E element) {
		return false;
	}
}
