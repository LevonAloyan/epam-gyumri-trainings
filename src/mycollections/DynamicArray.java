package mycollections;

import java.util.ArrayList;
import java.util.Arrays;

public class DynamicArray<E> implements MyList<E> {

	private static final int DEFAULT_SIZE_LIMIT = 10;
	private E[] myArrayList;
	private int maxSize;

	public DynamicArray() {
		this(DEFAULT_SIZE_LIMIT);
	}

	public DynamicArray(int size) {
		myArrayList = (E[]) new ArrayList[size];
		maxSize = size;
	}


	@Override
	public int size() {

		return maxSize;
	}

	@Override
	public boolean isEmpty() {

		return size() == 0;
	}

	@Override
	public boolean contains(E element) {

		return indexOf(element) != -1;
	}

	@Override
	public int indexOf(E element) {

		if (element == null) {
			for (int i = 0; i < maxSize; i++) {
				if (myArrayList[i] == null) {
					return i;
				}
			}
		}else {
			for (int i = 0; i < maxSize; i++) {
				if (element.equals(myArrayList[i])){
					return i;
				}
			}
		}
		return -1;
	}

	@Override
	public int lastIndexOf(E element) {
		if (element == null) {
			for (int i = maxSize-1; i > 0; i--) {
				if (myArrayList[i] == null) {
					return i;
				}
			}
		}else {
			for (int i = maxSize-1; i > 0; i--) {
				if (element.equals(myArrayList[i])){
					return i;
				}
			}
		}
		return -1;
	}

	@Override
	public E get(int index) {
		rangeCheck(index);
		return (E) myArrayList[index];
	}

	@Override
	public E set(int index, E element) {

		rangeCheck(index);
		E oldElement = myArrayList[index];
		myArrayList[index] = element;
		return oldElement;
	}

	@Override
	public boolean add(E e) {

		if (maxSize == myArrayList.length) {
			myArrayList = ensureCapacity();
		}
		myArrayList[maxSize] = e;
		maxSize++;
		return true;
	}


	@Override
	public void add(int index, E element) {
		rangeCheck(index);
		for (int i = maxSize - 1; i >= index; i--) {
			myArrayList[i + 1] = myArrayList[i];
		}
		myArrayList[index] = element;
		maxSize++;

	}

	@Override
	public E remove(int index) {
		rangeCheck(index);
		E el = myArrayList[index];
		for (int i = index; i < maxSize; i++) {
			myArrayList[i] = myArrayList[i + 1];
		}
		myArrayList[--maxSize] = null;
		return el;

	}

	@Override
	public boolean remove(E element) {
		for (int i = 0; i < maxSize; i++)
		{
			if (myArrayList[i].equals(element))
			{
				remove(i);
				return true;
			}
		}

		return false;
	}

	private void rangeCheck(int index) {
		if (index < 0 || index >= maxSize) {
			throw new IndexOutOfBoundsException("Index:" + index + ", Size:" + maxSize);
		}
	}

	@Override
	public String toString() {
		return "DynamicArray{ array=" + Arrays.toString(myArrayList) +
				", arraySize=" + maxSize +'}';
	}

	private E[] ensureCapacity() {
		E[] newArray = (E[]) new Object[myArrayList.length * 2];
		System.arraycopy(myArrayList, 0, newArray, 0, myArrayList.length);
		myArrayList = newArray;
		return myArrayList;
	}
}