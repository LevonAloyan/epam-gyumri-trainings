package stack;

import stack.exceptions.EmptyStackException;
import stack.exceptions.StackOverFlowException;

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
	public void push(int value) throws StackOverFlowException {
			if (!isFull()){
//				for (int i = 0; i < value; i++) {
					data[++tos] = value;
					System.out.println("Pushed value: " + value);
//				}
			}else{
				throw new StackOverFlowException("Stack is full");
			}
//		else{
//			ensureCapacity();
//			push(value);
//		}
	}

	/**
	 * Get element from the stack
	 * @return
	 */
	public int pop() throws EmptyStackException {
			if (tos >= 0){
				return data[tos--];
			}else{
				throw new EmptyStackException("Stack is empty");
			}
	}


	/**
	 * Clear stack
	 */
	public void clear() {
		//Arrays.fill(data, 0);
		for(int i = 0; i < data.length; i++){
			data[i] = 0;
		}
	}

	/**
	 * Check if stack is empty
	 * @return true if tos is -1
	 */
	public boolean isEmpty() {
		return tos == -1;
	}

	/**
	 * Check if stack is full
	 * @return true if tos equals to length
	 */
	public boolean isFull() {
		return tos == data.length - 1;
	}
	/**
	 * Increase the stack capacity if there is not enough space to add additional items
	 */
	private void ensureCapacity() {
		data = Arrays.copyOf(data, data.length * 5);
	}
}