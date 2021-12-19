package mycollections;

public class DynamicArray<E>  implements MyList<E> {

	private  static  final int DEFAULT_SIZE = 10;
	private Object [] data;
	private int size;

	public DynamicArray(){
		this(DEFAULT_SIZE);
	}

	public  DynamicArray(int size){
		this.data = new Object [size];
		this.size = 0;
	}
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
		return indexOf(element) != -1;
	}

	@Override
	public int indexOf(E element) {
		for (int i = 0; i < size; i++) {
			if (data[i] == element){
				return i;
			}
		}
		return -1;
	}

	@Override
	public int lastIndexOf(E element) {
		for (int i = size - 1; i >= 0 ; i--) {
			if (data[i] == element){
				return  i;
			}

		}
		return -1;
	}

	@Override
	public E get(int index) {
		try {
			rangeCheck(index);}
		catch (DynamicArrayIndexOutOfBoundException e) {
			System.out.println("Exception is found " + e.getMessage());
		}
		 E dataElement = (E) data[index];
		return dataElement;
	}

	@Override
	public E set(int index, E element) {
		rangeCheck(index);
		E oldValue = (E) data[index];
		data[index] = element;
		return oldValue;
	}

	@Override
	public boolean add(E e) {
		if (size == data.length) {
			ensureCapacity();
		}
		data[size++] = e;
		return true;
	}

	@Override
	public void add(int index, E element) {
		rangeCheck(index, true);

		if (size == data.length) {
			ensureCapacity();
		}
		for (int i = size - 1; i >= (Integer) index; i--) {
			data[i + 1] = data[i];
		}
		//data[index] = element;
		data[index] = element;
		size++;
	}

	@Override
	public E remove(int index) {
		E oldValue = (E) data[index];
		for (int i = index; i < size -1; i++) {
			data[i] = data[i + 1];
		}

		data[size - 1] = 0;
		size--;
		return oldValue;
	}
	@Override
	public void clear() {
		data = new Object [DEFAULT_SIZE];
		size = 0;
	}

	private void ensureCapacity() {
		int length = (int) (data.length * 1.5 + 1);
		Object [] newData = new Object [length];
		System.arraycopy(data, 0, newData,
				0, data.length);
		data = newData;
	}

	private void rangeCheck(int index) {
		rangeCheck(index, false);
	}

	private void rangeCheck(int index, boolean isSizeValid) {
		int upperBound = isSizeValid ? size : size - 1;
		if (index > upperBound || index < 0) {
			throw new DynamicArrayIndexOutOfBoundException(index) ;
		}
	}
	@Override
	public boolean remove(E element) {
		return false;
	}
}
