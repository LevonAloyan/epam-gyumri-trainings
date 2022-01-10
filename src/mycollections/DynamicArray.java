package mycollections;

public class DynamicArray<E>  implements MyList<E> {

	static final int DEFAULT_CAPACITY = 5;
	static Object[] EMPTY_ELEMENT = {};
	private int count = 0;
	private int size;
	private E[] elementData;

	public DynamicArray() {
		this.elementData = (E[]) EMPTY_ELEMENT;
	}

	public DynamicArray(int initialCapacity) {
		if (initialCapacity == 0) {
			this.elementData = (E[]) EMPTY_ELEMENT;
		} else if (initialCapacity > 0) {
			this.elementData = (E[]) new Object[initialCapacity];
		} else {
			throw new IllegalArgumentException("Illegal Capacity -> " + initialCapacity);
		}
	}
	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean isEmpty() {
		return this.size == 0;
	}

	@Override
	public boolean contains(E element) {
		return indexOf(element) >= 0;
	}

	@Override
	public int indexOf(E element) {
		if (element == null) {
			for (int i = 0; i < this.size; i++) {
				if (elementData[i] == null) {
					return i;
				}
			}
		} else {
			for (int i = 0; i < this.size; i++) {
				if (element.equals(elementData[i])) {
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
				if (elementData[i] == null) {
					return i;
				}
			}
		} else {
			for (int i = this.size - 1; i >= 0; i--) {
				if (element.equals(elementData[i])) {
					return i;
				}
			}
		}
		return -1;
	}

	@Override
	public E get(int index) {
		if (index >= size || size < 0 ) {
			throw new IllegalArgumentException("Invalid index.");
		}
		return (E) this.elementData[index];
	}

	@Override
	public E set(int index, E element) {
		if (index >= size || size < 0 ) {
			throw new ArrayIndexOutOfBoundsException("Out of Bounds.");
		}
		E oldValue = (E) elementData[index];
		elementData[index] = element;
		return oldValue;
	}

	@Override
	public boolean add(E e) {
		ensureCapacity();
		elementData[size++] = e;
		return true;
	}
	public E[] ensureCapacity() {
		E[] newArray = (E[]) new Object[DEFAULT_CAPACITY * 2];
		System.arraycopy(elementData, 0, newArray, 0, elementData.length);
		this.elementData = newArray;
		return newArray;
	}

	@Override
	public void add(int index, E element) {
		if (index >= size || size < 0 ) {
			throw new ArrayIndexOutOfBoundsException("Out of Bounds.");
		}
		if (index == size) {
			E[] data = ensureCapacity();
			for (int i = 0; i < this.elementData.length; i++) {
				data[i] = this.elementData[i];
			}
			this.elementData = data;
		}
		elementData[index] = element;
		index++;
	}

	@Override
	public E remove(int index) {
		if (index >= size || size < 0 ) {
			throw new ArrayIndexOutOfBoundsException("Out of Bounds.");
		}
		E arrayTemp = elementData[index];
		int newSize = size - 1;
		if (newSize > index) {
			System.arraycopy(elementData, index + 1, elementData, index, newSize - index);
			size = newSize;
		}
		return arrayTemp;
	}

	@Override
	public boolean remove(E element) {
		if (element == null){
			for (int i = 0; i < size; i++) {
				if (elementData[i] == null) {
					remove(i);
					return true;
				}
			}
		}else {
			for (int i = 0; i < size; i++)
				if (element.equals(elementData[i]))
					remove(i);
			return true;
		}
		return false;
	}
	public void printList() {
		System.out.print("[ ");
		for (int i = 0; i < size; i++){
			System.out.print(elementData[i] + ", ");
		}
		System.out.print(" ]");
		System.out.println();
	}
}
