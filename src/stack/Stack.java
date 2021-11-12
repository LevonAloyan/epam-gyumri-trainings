package stack;

import java.util.Arrays;

public class Stack {

	static final int DEFAULT_SIZE = 16;
	private int[] data;
	private int tos; //index which determines the top of stack

	public Stack() {
		this(DEFAULT_SIZE);
	}

	public Stack(int size) {
		data = new int[size];
		this.tos = -1;
	}

	/**
	 * Add element into stack
	 */
	public void push(int value) {
		data[++tos]=value;

	}

	/**
	 * Get element from the stack
	 * @return
	 */
	public int pop() {

		return data[tos--];
	}


	/**
	 * Clear stack
	 */
	public void clear() {
		int [] arr=new int [data.length];
		arr=data;
		System.out.println(Arrays.toString(data));

	}

	/**
	 * Check if stack is empty
	 * @return
	 */
	public boolean isEmpty() {
		if(tos==-1){
			return true;
		}
		return false;
	}

	/**
	 * Increase the stack capacity if there is not enough space to add additional items
	 */
	private void ensureCapacity() {
		int [] arr=new int[data.length+10];
		System.arraycopy(data,0,arr,0, data.length);
		arr=data;

	}
}