package stack;

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
		if (tos == data.length - 1) {
			System.out.println("Stack is full.");
		} else {
			data[++tos] = value;
		}

	}

	/**
	 * Get element from the stack
	 * @return
	 */
	public int pop() {
		if (tos < 0) {
			return 0;
		} else
			return data[tos--];
	}


	/**
	 * Clear stack
	 */
	public void clear() {
		for (int i = 0; i < DEFAULT_SIZE; i++) {
			data[i] = 0;
		}
	}

	/**
	 * Check if stack is empty
	 * @return
	 */
	public boolean isEmpty() {
		return return DEFAULT_SIZE == 0;
	}

	/**
	 * Increase the stack capacity if there is not enough space to add additional items
	 */
	private void ensureCapacity() {
		if (tos == data.length - 1) {
			System.out.println("Stack is full.");
		}
	}
}