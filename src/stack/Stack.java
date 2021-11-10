package stack;

import java.util.Arrays;

public class Stack {

	static final int DEFAULT_SIZE = 2;
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
		if (tos == data.length-1) {
			ensureCapacity();
			data[++tos] = value;
		} else {
			data[++tos] = value;
		}
	}

	/**
	 * Get element from the stack
	 * @return
	 */
	public int pop() {
		if (tos == -1) {
			System.out.println("Stack is empty");
			return 0;
		} else {
			return data[tos--];
		}
	}


	/**
	 * Clear stack
	 */
	public void clear() {
		if (data.length < 1000) {
			Arrays.fill(data, 0);
			tos = -1;
		} else {
			data = new int[DEFAULT_SIZE];
			tos = -1;
		}
	}

	/**
	 * Check if stack is empty
	 * @return
	 */
	public boolean isEmpty() {
		return tos == -1;
	}

	/**
	 * Increase the stack capacity if there is not enough space to add additional items
	 */
	private void ensureCapacity() {
		int length = (data.length + 10);
		int[] result = new int[length];
		System.arraycopy(data,0,result,0,data.length);
		data = result;
	}

	public static void main(String[] args) {
		Stack stack = new Stack();
		System.out.println(stack.isEmpty());
		stack.push(7);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.push(6);
		stack.push(8);
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	}
}
