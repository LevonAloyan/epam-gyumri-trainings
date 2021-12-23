package mycollections;

public class DynamicArray<E>  implements MyList<E> {
	private int size;
	private E[] array = (E[]) new Object[15];

	public DynamicArray(){
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
		for(int i = 0; i <size; i++){
			if(element.equals(array[i])){
				return true;
			}
		}
		return false;
	}

	@Override
	public int indexOf(E element) {
		if(element != null){
			for(int i = 0; i < size; i++){
				if(element.equals(array[i])) return i;
			}
		}
		return 0;
	}

	@Override
	public int lastIndexOf(E element) {
		for (int i = size; i >= 0; i--) {
			if (array[i] == element) return i;
			}
		return 0;
	}

	@Override
	public E get(int index) {
		return array[index];
	}

	@Override
	public E set(int index, E element) {
		if (index < 0 || index >= size) {
			throw new ListIndexOutOfBoundException("Index trying to set is out of bound");
		}
		E old_value = array[index];
		array[index] = element;
		return old_value;
	}

	@Override
	public boolean add(E e) {
		array[size] = e;
		size++;
		return true;
	}

	@Override
	public void add(int index, E element) {
		if (index < 0 || index > size) {
			throw new ListIndexOutOfBoundException("index trying to add is out of bound");
		}
		if(index < array.length){
			ensureCapacity();
		}
		for (int i = size;i > index;i--){
			array[i] = array[i - 1];
		}
		array[index] = element;
		size++;
	}

	@Override
	public E remove(int index) {
		E old_value = array[index];
		for (int i = index + 1;i < size;i++){
			array[i - 1] = array[i];
		}
		array[--size] = null;
		return old_value;
	}

	@Override
	public boolean remove(E element) {
		remove(indexOf(element));
		return true;
	}


	private void ensureCapacity(){
		E[] newAarray = (E[]) new Object[array.length + 10];
		for (int i = 0;i < size;i++){
			newAarray[i] = array[i];
		}
		array = newAarray;
	}
}
