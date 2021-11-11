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
		if (tos < data.length - 1){
			data[++tos] = value;
			System.out.println("Pushed value: " + value);
		}else{
			System.out.println("Stack is full!");
		}
	}

	/**
	 * Get element from the stack
	 * @return
	 */
	public int pop() {
		if (tos >= 0){
			return data[tos--];
		}
		return 0;
	}


	/**
	 * Clear stack
	 */
	public void clear() {
		for(int i = 0; i < data.length; i++){
			data[i] = Integer.parseInt(null);
		}
	}

	/**
	 * Check if stack is empty
	 * @return
	 */
	public boolean isEmpty() {
		if(tos == -1){
			return true;
		}
		return false;
	}

	/**
	 * Increase the stack capacity if there is not enough space to add additional items
	 */
	private void ensureCapacity() {
		data = Arrays.copyOf(data, data.length * 5);
	}
}